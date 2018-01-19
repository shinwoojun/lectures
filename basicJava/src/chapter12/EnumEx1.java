package chapter12;

public class EnumEx1 {
	public static void main(String[] args) {
		
		int di2 = Direction2.EAST;
		
		switch(di2) {
		case 1:   //Direction2.EAST와 같이 적어줄수 없다.
			System.out.println("동쪽으로 이동");
			break;
		case 2:
			System.out.println("남쪽");
			break;
		case 3:
			System.out.println("서쪽");
			break;
		case 4:
			System.out.println("북쪽 나라");
			break;
		}
		
		////////////////////////////////////////////////
		Direction di = Direction.NORTH;
		
		switch (di) {
		case EAST:
			System.out.println("동쪽으로 이동");
			break;
		case SOUTH:
			System.out.println("남쪽");
			break;
		case WEST:
			System.out.println("서쪽");
			break;
		case NORTH:
			System.out.println("북쪽 나라");
			break;
		}
		
		
	}
}
