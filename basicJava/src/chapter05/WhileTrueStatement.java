package chapter05;

import java.util.Scanner;

public class WhileTrueStatement {
	public static void main(String[] args) {
		String[] words = { 
				"chairman:사장", "desktop:데스크탑컴퓨터",
				"chair:의자", "computer:컴퓨터", "korea:한국",
				"integer:정수", "desk:책상"				
		};
		Scanner scanner = new Scanner(System.in);
		int wordsSize = words.length;
		while(true) {
			System.out.print("영단어를 입력하세요: ");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				break;
			} else {
				boolean matched = false;
				String recommend = "";
				if (input.length() > 0) {
					for (int i = 0; i < wordsSize; i++) {
						String[] tmp = words[i].split(":"); // 0:영어, 1:한글
						if (tmp[0].equals(input)) {
							System.out.println(tmp[1]);
							matched = true;
							break;
						} else if (tmp[0].toUpperCase().contains(input.toUpperCase())) {
							recommend += tmp[0] + " ";
						}
					}
				} 
				
				if (!matched) {
					if (recommend.length() > 0) {
						System.out.println("추천 검색어: " + recommend + "\n");
					} else {
						System.out.println("찾는 단어가 없습니다.\n");
					}
				}
			}
		}
	}
}











