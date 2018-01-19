package jdbc.dto;

public class EmpDO {
	private String empno;
	private String ename;
	private String sal;
	private String manager;
	private String deptno;
	private String hiredate;
	private String age;
	private String comm;

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEmpno() {
		return this.empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return this.ename;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getSal() {
		return this.sal;
	}

	public void setManger(String manager) {
		this.manager = manager;
	}

	public String getmanger() {
		return this.manager;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getHiredate() {
		return this.hiredate;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return this.age;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getComm() {
		return this.comm;
	}
}
