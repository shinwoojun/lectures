package chapter04;

public class FlowEx1 {
	public static void main(String[] args) {
		int x = 0;
		int y = 2;
		System.out.println("x = " + x + " 일 때, 참인 것은");
		/*
		System.out.printf("x = %d 일 때, 참인 것은\n", x);
		System.out.printf("x = %d, y = %d", x, y);
		*/
		
		if (x == 0) {
			System.out.println("x == 0");
		}
		
		if (x != 0) System.out.println("x != 0");
	}
}








