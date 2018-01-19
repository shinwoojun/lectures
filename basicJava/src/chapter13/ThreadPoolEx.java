package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolEx {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(
			    Runtime.getRuntime().availableProcessors()
			);

		List<Callable<String>> tasks = new ArrayList<Callable<String>>();
		
		String src = "D:\\dev\\result.txt";
		String target = "D:\\dev\\result_copied_"+ System.nanoTime() + ".txt";
		Callable fc = new FileCopy2(src, target);
		tasks.add(fc);

		String src2 = "D:\\dev\\result2.txt";
		String target2 = "D:\\dev\\result2_copied_"+ System.nanoTime() + ".txt";
		Callable fc2 = new FileCopy2(src2, target2);
		tasks.add(fc2);
		
		String src3 = "D:\\dev\\result3.txt";
		String target3 = "D:\\dev\\result3_copied_"+ System.nanoTime() + ".txt";
		Callable fc3 = new FileCopy2(src3, target3);
		tasks.add(fc3);
		
		
		List<Future<String>> futures = executorService.invokeAll(tasks);
				
		for (Future<String> future: futures) {
			System.out.println(future.get());
			
		}
		

	}
}
