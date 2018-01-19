package jdbc;

import java.util.ArrayList;
import java.util.List;

import jdbc.dto.EmpDO;

public class ListEx {

	public static void main(String[] args) {
		List<EmpDO> list = new ArrayList<EmpDO>();
		
		EmpDO emp1 = new EmpDO();
		emp1.setEname("Lee");
		
		list.add(emp1);
		
		EmpDO emp2 = new EmpDO();
		emp2.setEname("Kim");
		
		list.add(emp2);
		
		for (EmpDO emp: list) {
			System.out.println(emp.getEname());
		}
		
		
	}

}







