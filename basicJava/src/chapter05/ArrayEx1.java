package chapter05;

public class ArrayEx1 {
	public static void main(String[] args) {
		String[] arrStr = {"korea", "japan", "usa", "canada", "china", "brazil", "indo"};
		int arrSize = arrStr.length;
		
		String[] tmpArrStr = new String[arrSize + 1];
		int tmpArrSize = tmpArrStr.length;

		for (int i = 0; i < arrSize; i++) {
			tmpArrStr[i] = arrStr[i];
		}
		
		
		
		
		
		
		for (int i = 0; i < tmpArrSize; i++) {
			System.out.println(tmpArrStr[i]);
		}
		
	}
}
