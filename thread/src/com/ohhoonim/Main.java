package com.ohhoonim;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.ohhoonim.common.DBCPInit;
import com.ohhoonim.receive.Receive;
import com.ohhoonim.send.Send;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Main 실행");
		if (args == null || args.length == 0 || (!args[0].equals("s") && !args[0].equals("r"))) {
			System.out.println("옵션 s 또는 r을 붙여주세요.");
			System.out.println("s : 송신측 실행");
			System.out.println("r : 수신측 실행");
			System.exit(0);
		}
		String runType = args[0];
		
		DBCPInit dbcp = new DBCPInit();
		dbcp.init();
		
		ExecutorService execService = Executors.newFixedThreadPool(2); 

		String[][] days = {
				{"20180101","20180102","20180103","20180104"},
				{"20180105","20180106","20180107","20180108","20180109"}
		};

		if (runType.equals("s")) {
			long start = System.nanoTime();
			int daySize = days.length;
			for(int i = 0; i < daySize; i++) {
				int taskSize = days[i].length;
				System.out.println("쓰레드 일괄실행 "+ (i + 1) +" 회차 ==== 태스크: "+ taskSize +"건 ===========");
				List<Send> tasks = new ArrayList<Send>();
				
				for (int j = 0; j < taskSize; j++) {
					tasks.add(new Send(days[i][j]));
				}
				
				List<Future<String>> futures = execService.invokeAll(tasks);
				
				for(Future<String> future: futures) {
					System.out.println(future.get());
				}
			}
		
			execService.shutdown();
			
			long end = System.nanoTime();
			
			System.out.println("총 수행시간: " + (end - start));
			
			System.exit(0);
			
		} else if (runType.equals("r")) {
			Receive receive = new Receive();
			receive.receiveMessage("수신측 메시지수신");
			System.exit(0);
		}
	}
}


















