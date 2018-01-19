package reflection;

import java.lang.reflect.Method;

public class ReflectExam {

	public static void main(String[] args) throws Exception {
		
		String[] properties = {"empno","ename","sal","deptno"};
		
		Class empVoClazz = Class.forName("reflection.EmpVo");
		Method[] methods = empVoClazz.getMethods();
		
		
		Object empVo = empVoClazz.newInstance();
		int i = 0;
		for(Method method: methods) {
			for(String propertyName: properties) {
				String methodName = makeSetterName(propertyName);
				if (method.getName().equals(methodName)) {
					method.invoke(empVo, "test" + (i++));
				}
			}
		}
		
		EmpVo vo = (EmpVo)empVo;
		System.out.println(vo.toString());
	}
	
	public static String makeSetterName(String prop) {
		StringBuffer resultStr = new StringBuffer();
		resultStr = resultStr.append("set");
		resultStr = resultStr.append(prop.substring(0, 1).toUpperCase());
		resultStr = resultStr.append(prop.substring(1, prop.length()));
		return resultStr.toString();
	}

}
