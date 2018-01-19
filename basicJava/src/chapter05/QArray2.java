package chapter05;

public class QArray2 {
	public static void main(String[] args) {
		int[] scores = {89, 87, 85, 64, 100, 63, 25, 87, 65, 98};
		int scoresSize = scores.length;
		String[] grade = new String[scoresSize];
		
		for (int i = 0; i < scoresSize; i++) {
			int score = scores[i];
			if (score > 90) {
				grade[i] = "A";
			} else if (score > 80) {
				grade[i] = "B";
			} else if (score > 70) {
				grade[i] = "C";
			} else {
				grade[i] = "D";
			}
		}
		
		for (int i = 0; i < scoresSize; i++) {
			System.out.println(grade[i]);
		}
		
	}
}
