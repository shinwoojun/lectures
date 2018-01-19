package chapter04;

import java.util.Scanner;

public class FlowEx4 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 : ");

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		String grade = "F";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 80) {
			grade = "B";
		}  else {
			grade = "F";
		}
		System.out.println("학점은 " + grade + "입니다.");
		
	}
}













