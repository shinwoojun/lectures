package chapter13;

public class ThreadNumber2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("숫자: " + i);
		}
	}
	
}
