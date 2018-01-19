package chapter04;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요: ");
		// 입력을 받는다. 월(숫자)
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
			
		// switch 문을 이용해서 현재 계절이 무엇인지 출력
		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("봄");
			break;
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("1-12 사이의 숫자를 입력하세요");
			
		}
		
		
		
	}
}










