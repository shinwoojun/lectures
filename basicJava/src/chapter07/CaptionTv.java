package chapter07;

public class CaptionTv extends Tv {

	boolean caption;
	
	void displayCation (String text) {
		if (this.caption) {
			System.out.println(text);
		}
	}
	
}
