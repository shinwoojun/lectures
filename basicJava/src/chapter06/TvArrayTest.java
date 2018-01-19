package chapter06;

public class TvArrayTest {
	public static void main(String[] args) {
		
		int [] arr = new int[10];
		arr[0] = 12;
		arr[1] = 98;
		
		Tv[] arrTv = new Tv[3];
		
		Tv redTv = new Tv();
		redTv.color = "red";
		arrTv[0] = redTv;
		
		Tv blueTv = new Tv();
		blueTv.color = "blue";
		arrTv[1] = blueTv;
		
		Tv tv3 = new Tv();
		tv3.color = "green";
		arrTv[2] = tv3;
		int arrTvSize = arrTv.length;
		for (int i = 0; i < arrTvSize; i++) {
			System.out.println(arrTv[i].color);
		}
		
	}
}







