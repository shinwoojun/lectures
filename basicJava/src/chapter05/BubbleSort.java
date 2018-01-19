package chapter05;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arrNum = {2, 3, 9, 5, 1, 6, 7, 8, 4};
		int arrSize = arrNum.length;
		
		while(true) {
			boolean changed = false;
			for (int i = 0; i < arrSize - 1; i++) {
				if (arrNum[i] > arrNum[i+1]) {
					int tmp = arrNum[i];
					arrNum[i] = arrNum[i+1];
					arrNum[i+1] = tmp;
					changed = true;
				}
			}
			if (!changed) {
				break;
			}
		}
		
		for(int i = 0; i < arrSize; i++) {
			System.out.println(arrNum[i]);
		}
	}
}
