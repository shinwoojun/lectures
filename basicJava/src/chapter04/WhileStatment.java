package chapter04;

public class WhileStatment {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if ( i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		/*
		for (int i = 0; i < 1000; i++) {
			// 337 일 때 break;
			if (i == 337) {
				break;
			}
			System.out.println(i);
		}
		
		int i = 200;
		do {
			System.out.println("do-while:"+ i++);
		} while (i < 100) ;
		
		while (i < 100) {
			System.out.println("while:" + i++);
		}
		
		int i = 0;
		while (i < 100) {
			System.out.println(i++);
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		 */
		
	}
}
