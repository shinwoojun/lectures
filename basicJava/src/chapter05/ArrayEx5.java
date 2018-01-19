package chapter05;

public class ArrayEx5 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		int scoreSize = score.length;
		// 합계구하기
		for (int i = 0; i < scoreSize; i++) {
			sum += score[i];
		}
		System.out.println("합계: " + sum);
		
		// 평균구하기
		average = sum / (float)scoreSize;
		System.out.println("평균: " + average);
	}
}
