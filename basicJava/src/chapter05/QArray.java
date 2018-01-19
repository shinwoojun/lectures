package chapter05;

public class QArray {
	public static void main(String[] args) {
		int[] score = {89, 87, 85, 64, 100, 63, 25, 87, 65, 98};
		
		// 1. 평균구하기
		int sum = 0;
		int scoreSize = score.length;
		for (int i = 0; i < scoreSize; i++ ) {
			sum += score[i];
		}
		int average = sum / scoreSize;
		System.out.println("평균: " + average);
		
		// 2. 구해진 평균과 빼기해주고, 별도 배열에 저장하기
		int[] tmpArr = new int[scoreSize];
		for (int i = 0; i < scoreSize; i++) {
			tmpArr[i] = Math.abs(average - score[i]);
		}
	
		// 3. 별도배열에서 최소값 구하고 최소값의 인덱스값을 알아내기
		int min = tmpArr[0];
		for (int i = 1; i < scoreSize; i++) {
			if (tmpArr[i] < min) {
				min = tmpArr[i]; 
			}
		}
		int minIdx = 0;
		for (int i = 0; i < scoreSize; i++) {
			if (tmpArr[i] == min) {
				minIdx = i;
			}
		}
	
		System.out.println("평균에 가장 근접한 값: " + score[minIdx]);
		
	}
}
