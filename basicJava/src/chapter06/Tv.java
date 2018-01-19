package chapter06;

public class Tv {
	String color;
	boolean power = false; 
	int channel;
		
	Tv() {
		
	}
	
	Tv(String c, boolean p) {
		color = c;
		power = p;
	}
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	Tv coinIn() {
		Tv t = new Tv();
		return t;
	}
	
	Tv coinIn(int money) {
		
		return null;
	}
	
	
}













