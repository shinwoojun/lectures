package gitRepositories;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		System.out.print("국적을 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in); 
		String tmp = scanner.nextLine();
		
		if (tmp.equals("korea")) {
			System.out.println("한국인입니다.");
		}
		
		if (tmp.equals("japan")) {
			System.out.println("일본인입니다.");
		}
		if (tmp.equals("japan")) {
			System.out.println("일본인입니다.");
		}
	}
}
