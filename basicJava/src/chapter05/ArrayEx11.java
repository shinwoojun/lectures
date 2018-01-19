package chapter05;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] nums = {2, 3, 9, 5, 1, 6, 7, 8, 4, 4, 3, 6, 7, 2, 1, 8, 3};
		int[] counts = new int[10];
		
		int size = nums.length;
		for (int i = 0; i < size; i++) {
			int tmpNum = nums[i]; // < = 
			counts[tmpNum]++;
		}
		
		// 출력
		for (int i = 0; i < 10; i++) {
			System.out.println( i + " 개수 : " + counts[i]);
		}
		
	}
}
