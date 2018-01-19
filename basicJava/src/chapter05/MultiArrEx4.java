package chapter05;

public class MultiArrEx4 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터", "노트북"},
				{"integer", "정수"}
		};
		
		
		
		
		for (int i =0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				System.out.print(words[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
