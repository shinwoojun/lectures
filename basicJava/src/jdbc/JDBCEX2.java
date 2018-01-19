package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdbc.dto.EmpDO;

public class JDBCEX2 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1. jdbc driver 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. database와 connection맺기
			// url정보, id, password
			String url = "jdbc:oracle:thin:@192.168.0.190:1521:orcl";
			String id = "scott";
			String password = "scott";
			conn = DriverManager.getConnection(url, id, password);
			
			//3. 쿼리 실행
			
//			stmt = conn.createStatement();
			String deptno = "20";
			String query = "select e.empno, e.ename, d.dname " + 
							"from emp e, dept d " + 
							"where e.deptno = d.deptno " + 
							"and e.deptno = ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, deptno);			
			
//			rs = stmt.executeQuery(query);
			rs = pstmt.executeQuery();
			
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
			
			while(rs.next()) {
				Map<String, String> rowMap = new HashMap<String, String>();
				rowMap.put("empno", rs.getString("empno"));				
				rowMap.put("ename", rs.getString("ename"));				
				rowMap.put("dname", rs.getString("dname"));		
				list.add(rowMap);
			}
			
			for (Map<String, String> row :list) {
				System.out.println(row.get("empno"));
				System.out.println(row.get("ename"));
				System.out.println(row.get("dname"));
				System.out.println("===================");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// connection 끊기
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}





