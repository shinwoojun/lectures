package chapter07;

public class Tv {
	boolean power;
	int channel;
	//asd
	void power() {
		this.power = !this.power;
	}
	
	void channelUp() {
		++ this.channel;
	}
	
	void channelDown() {
		-- this.channel;
	}
	
}
