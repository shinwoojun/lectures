package com.ohhoonim.receive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

import com.ohhoonim.common.DBCPInit;

public class ReceiveDao {

	public int saveData(List<Map<String, String>> list) throws Exception {
		// db pool에서 커넥션 가져오기
		Connection conn = DriverManager.getConnection(DBCPInit.jdbcDriver);
		
		// 쿼리 실행하기
		String sql = "insert into tb_notice (\r\n" + 
				"    NOTICE_DATE, NOTICE_IDEN, NOTICE_STATE, EMPLOY_TYPE, CATE_STATE\r\n" + 
				"    , PERSON, QUALI_FIELD, LANGUAGE_CODE, REGION_CODE, CONTENTS\r\n" + 
				"    , MANAGER, APPLY_DATE, MAGAM_DATE, CAREER_CNT, REFERENCE)\r\n" + 
				"values (\r\n" + 
				"      ?, ?, ?, ?, ?  \r\n" + 
				"    , ?, ?, ?, ?, ?\r\n" + 
				"    , ?, to_date(?, 'YYYYMMDD'), to_date(?, 'YYYYMMDD'), ?, ? )";
		
		int resultCnt = 0;
		
		PreparedStatement pstmt = null;
		
		for (Map<String, String> row: list) {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, row.get("NOTICE_DATE"));
			pstmt.setString(2, row.get("NOTICE_IDEN"));
			pstmt.setString(3, row.get("NOTICE_STATE"));
			pstmt.setString(4, row.get("EMPLOY_TYPE"));
			pstmt.setString(5, row.get("CATE_STATE"));
			pstmt.setString(6, row.get("PERSON"));
			pstmt.setString(7, row.get("QUALI_FIELD"));
			pstmt.setString(8, row.get("LANGUAGE_CODE"));
			pstmt.setString(9, "");
			pstmt.setString(10, row.get("CONTENTS"));
			pstmt.setString(11, row.get("MANAGER"));
			pstmt.setString(12, row.get("APPLY_DATE"));
			pstmt.setString(13, row.get("MAGAM_DATE"));
			pstmt.setString(14, "");
			pstmt.setString(15, "");
			
			resultCnt += pstmt.executeUpdate();
		}
		
		pstmt.close();
		conn.close();
		
		return resultCnt;
	}

}
