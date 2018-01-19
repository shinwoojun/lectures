package com.ohhoonim.receive;

import java.util.List;
import java.util.Map;

public class Receive {
	public void receiveMessage(String msg) throws Exception{
		ReceiveFile file = new ReceiveFile();
		List<Map<String, String>> list = file.readSendMessage("20180102");
		
		list.stream().forEach(row -> System.out.println(row.toString()));
		
		ReceiveDao dao = new ReceiveDao();
		int resultCnt = dao.saveData(list);
		
		System.out.println(resultCnt + " 건이 등록되었습니다.");
	}
}
