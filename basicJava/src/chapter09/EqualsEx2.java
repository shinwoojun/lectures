package chapter09;

import java.lang.reflect.Method;

public class EqualsEx2 {
	public static void main(String[] args) {
		
		Person person = new Person(112345);
		
		Class clazz = person.getClass();
		
		System.out.println(clazz.getName());
		
		Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
		
		
		/*
		Person p1 = new Person(1234567);
		Person p2 = new Person(5634533);
		
		if (p1.equals(p2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다");
		}
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		String a = "test";
		System.out.println("a: " + a);

		String b = new String("test");
		System.out.println("b: " + b);
		
		if (a.equals(b)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다");
		}*/

	}
}
