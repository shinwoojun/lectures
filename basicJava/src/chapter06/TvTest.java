package chapter06;

public class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();
		
		// tv 켜고 끄기
		t.power();
		t.power();

		if (t.power) {
			System.out.println("tv를 켰습니다.");
		} else {
			System.out.println("tv가 꺼졌습니다.");
		}
		
		// 채널 변경....
		t.channelUp();
		System.out.println(t.channel);

		t.channelUp();
		t.channelUp();
		t.channelUp();
		System.out.println(t.channel);
		
		t.channelUp();
		t.channelUp();
		System.out.println(t.channel);
		
		t.channelDown();
		t.channelDown();
		t.channelDown();
		t.channelDown();
		System.out.println(t.channel);
		
		
		
		
	}
}










