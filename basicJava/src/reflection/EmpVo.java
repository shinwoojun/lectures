package reflection;

public class EmpVo {
	private String empno;
	private String ename;
	private String sal;
	private String deptno;
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append(this.empno);
		sb = sb.append(" | ");
		sb = sb.append(this.ename);
		sb = sb.append(" | ");
		sb = sb.append(this.sal);
		sb = sb.append(" | ");
		sb = sb.append(this.deptno);
		return sb.toString();
	}
}












