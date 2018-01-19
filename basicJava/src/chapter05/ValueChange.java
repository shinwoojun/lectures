package chapter05;

public class ValueChange {
	public static void main(String[] args) {
		
		String[] arr = {"korea", "japan", "china", "indo"};
		
		String tmp ="";
		tmp = arr[0];
		arr[0] = arr[2];
		arr[2] = tmp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		String a = "korea";
		String b = "japan";
		
		String tmp = "";
		
		tmp = a;		
		a = b;
		b = tmp;
		
		System.out.println(a + b + tmp);
		*/
	}
}
