package com.ohhoonim.send;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ohhoonim.common.DBCPInit;

public class Dao {
	public List<Map<String, String>> sendList(String yyyymmdd) throws Exception {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();

		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");
		                               
		String url = "jdbc:oracle:thin:@192.168.0.190:1521:orcl";
		String id = "scott";
		String password = "scott";
		Connection conn = DriverManager.getConnection(url, id, password);
		*/
		// db pool 방식으로 전환
		Connection conn = DriverManager.getConnection(DBCPInit.jdbcDriver);
		
		String query = "SELECT\r\n" + 
				"    R.NOTC_REGT_DT          NOTICE_DATE     -- 채용공고일\r\n" + 
				"    , ROW_NUMBER() \r\n" + 
				"        OVER (\r\n" + 
				"            PARTITION BY NOTC_REGT_DT \r\n" + 
				"            ORDER BY NOTC_REGT_DT DESC\r\n" + 
				"            )        \r\n" + 
				"                            NOTICE_IDEN     -- 채용 공고ID\r\n" + 
				"    , R.EMPL_NOTC_CONT      NOTICE_STATE    -- 채용 공고명\r\n" + 
				"    , R.EMPL_CATE_CODE      EMPLOY_TYPE     -- 채용 구분\r\n" + 
				"    , DECODE(R.EMPL_CATE_CODE       ,'A1', '기획'\r\n" + 
				"                ,'A2','서무'        ,'B1','전산'\r\n" + 
				"                ,'B2','프로그래머'  ,'C1','회계'\r\n" + 
				"                ,'D1','건설'        ,'E1','제조'\r\n" + 
				"            )               CATE_STATE      -- 채용 분야\r\n" + 
				"    , R.EMPL_EXPT_PERS      PERSON          -- 채용 인원\r\n" + 
				"    , R.LICN_CODE           QUALI_FIELD     -- 자격 분야\r\n" + 
				"    , R.LANG_CODE           LANGUAGE_CODE   -- 언어 코드\r\n" + 
				"    , R.NOTC_CONT           CONTENTS        -- 채용 내용\r\n" + 
				"    , U.USER_NM             MANAGER         -- 담당자명\r\n" + 
				"    , R.RECV_STRT_DT        APPLY_DATE      -- 채용 접수일\r\n" + 
				"    , R.RECV_END_DT         MAGAM_DATE      -- 마감일\r\n" + 
				"FROM\r\n" + 
				"    TB_RECRUIT R, TB_USER U\r\n" + 
				"WHERE\r\n" + 
				"    R.MNGE_ID = U.USER_ID\r\n" + 
				//"    AND R.NOTC_REGT_DT = TO_CHAR(SYSDATE - 1, 'YYYYMMDD')";
				"    AND R.NOTC_REGT_DT = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, yyyymmdd);
		ResultSet rs = pstmt.executeQuery();
				
		while(rs.next()) {
			Map<String, String> row = new HashMap<String, String>();
			row.put("NOTICE_DATE",   rs.getString("NOTICE_DATE"));
			row.put("NOTICE_IDEN",   rs.getString("NOTICE_IDEN"));
			row.put("NOTICE_STATE",  rs.getString("NOTICE_STATE"));
			row.put("EMPLOY_TYPE",   CodeMapping.translateEmplCateCode(rs.getString("EMPLOY_TYPE")));
			row.put("CATE_STATE",    rs.getString("CATE_STATE"));
			row.put("PERSON",        rs.getString("PERSON"));
			row.put("QUALI_FIELD",   CodeMapping.translateLicnCode(rs.getString("QUALI_FIELD")));
			row.put("LANGUAGE_CODE", CodeMapping.translateSchlCode(rs.getString("LANGUAGE_CODE")));
			row.put("CONTENTS",      rs.getString("CONTENTS"));
			row.put("MANAGER",       rs.getString("MANAGER"));
			row.put("APPLY_DATE",    rs.getString("APPLY_DATE"));
			row.put("MAGAM_DATE",    rs.getString("MAGAM_DATE"));
			list.add(row);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return list;
	}
}

