package chapter04;

public class gugudan_1 {

	public static void main(String[] args) {

		int a, b;
		for (b = 1; b < 10; b++) {
			for (a = 2; a < 6; a++) {
				System.out.print(a + " * " + b + " = " + a * b + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("-----------------------------------");
		for (b = 1; b < 10; b++) {
			for (a = 6; a < 10; a++) {
				System.out.print(a + " * " + b + " = " + a * b + "\t");
			}
			System.out.println("\n");
		}

	}
}