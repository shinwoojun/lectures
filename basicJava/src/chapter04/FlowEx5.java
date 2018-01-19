package chapter04;

import java.util.Scanner;

public class FlowEx5 {
	
	public static void main(String[] args) {
		System.out.print("input your score: ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		String grade = "F";
		String opt = "";
		if (score >= 90 ) {
			grade = "A";
			opt = returnOpt(score);
		} else if (score >= 80) {
			grade = "B";
			opt = returnOpt(score);
		} else if (score >= 70) {
			grade = "C";
			opt = returnOpt(score);
		} else {
			grade ="F";
		}
		System.out.println(" your grade is " + grade + opt);
	}
	
	public static String returnOpt(int score) {
		String opt = "";
		if (score % 10 >= 8) {
			opt = "+";
		} else if (score % 10 < 4) {
			opt = "-";
		}
		return opt;
	}
}














