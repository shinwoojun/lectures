package chapter13;

public class ThreadEx2 {
	public static void main(String[] args) {
		
		Thread worker1 = new Thread(new Runnable() {
			
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
			
		} );
		
		worker1.start();
		
		
	}
}
