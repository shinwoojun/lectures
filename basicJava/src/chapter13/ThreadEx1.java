package chapter13;

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread worker1 = new Thread(new ThreadNumber2());
		
		worker1.start();
		
		/*
		Thread worker1 = new ThreadNumber();
		Thread worker2 = new ThreadNumber();
		Thread worker3 = new ThreadNumber();
		Thread worker4 = new ThreadNumber();
		
		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();
		*/
	}
	
	
}
