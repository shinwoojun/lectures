package chapter13;

public class ThreadNumber extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + "숫자: " + i);
		}
	}
}
