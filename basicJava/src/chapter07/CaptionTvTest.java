package chapter07;

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		
		System.out.println(ctv.channel);
		
		ctv.displayCation("caption off: Hello, World");
		ctv.caption = true;
		ctv.displayCation("caption on: Hello, World");
		
		
	}
}
