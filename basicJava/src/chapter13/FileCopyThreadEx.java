package chapter13;

import java.util.ArrayList;
import java.util.List;

public class FileCopyThreadEx {
	public static void main(String[] args) {
		List<Thread> threadLists = new ArrayList<Thread>();
		
		String src = "D:\\dev\\result.txt";
		String target = "D:\\dev\\result_copied_"+ System.nanoTime() + ".txt";
		FileCopy fc = new FileCopy(src, target);
		Thread worker1 = new Thread(fc);
		threadLists.add(worker1);

		String src2 = "D:\\dev\\result2.txt";
		String target2 = "D:\\dev\\result2_copied_"+ System.nanoTime() + ".txt";
		FileCopy fc2 = new FileCopy(src2, target2);
		Thread worker2 = new Thread(fc2);
		threadLists.add(worker2);
		
		String src3 = "D:\\dev\\result3.txt";
		String target3 = "D:\\dev\\result3_copied_"+ System.nanoTime() + ".txt";
		FileCopy fc3 = new FileCopy(src2, target2);
		Thread worker3 = new Thread(fc3);
		threadLists.add(worker3);
		
		for(Thread worker: threadLists) {
			worker.start();
		}
		
	}
}
