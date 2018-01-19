package chapter05;

public class SelectSort {
	public static void main(String[] args) {
		int[] arrNum = {2, 3, 9, 5, 1, 6, 7, 8, 4};
		int arrSize = arrNum.length;
		
		for (int i = 0; i < arrSize - 1; i++) {
			for (int j = i + 1; j < arrSize ; j++) {
				if (arrNum[i] > arrNum[j]) {
					int tmp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}
		
		//출력
		for(int i = 0; i < arrSize; i++) {
			System.out.println(arrNum[i]);
		}
	}
}
