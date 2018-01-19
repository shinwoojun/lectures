package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.dto.EmpDO;

public class JDBCEX {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
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
			stmt = conn.createStatement();
			String query = "select empno, ename, sal, manager, deptno, hiredate, age, comm from emp where sal > 2000";
			rs = stmt.executeQuery(query);
			
			List<EmpDO> list = new ArrayList<EmpDO>();
			
			while(rs.next()) {
				EmpDO emp = new EmpDO();
				emp.setEmpno(rs.getString("EMPNO"));
				emp.setEname(rs.getString("ENAME"));
				emp.setSal(rs.getString("SAL"));
				emp.setManger(rs.getString("MANAGER"));
				emp.setDeptno(rs.getString("DEPTNO"));
				emp.setHiredate(rs.getString("HIREDATE"));
				emp.setAge(rs.getString("AGE"));
				emp.setComm(rs.getString("COMM"));
				
				list.add(emp);
			}
			
			for ( EmpDO emp: list) {
				System.out.println(emp.getEmpno());
				System.out.println(emp.getEname());
				System.out.println(emp.getSal());
				System.out.println(emp.getmanger());
				System.out.println(emp.getDeptno());
				System.out.println(emp.getHiredate());
				System.out.println(emp.getAge());
				System.out.println(emp.getComm());
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





