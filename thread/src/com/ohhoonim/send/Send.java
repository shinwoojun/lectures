package com.ohhoonim.send;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class Send implements Callable<String> {
	
	private String yyyymmdd;
	
	public Send(String yyyymmdd) {
		this.yyyymmdd = yyyymmdd;
	}
	
	@Override
	public String call() throws Exception {
		int resultSize = sendMessage(this.yyyymmdd);
		return yyyymmdd + " : " + resultSize + " 건 처리";
	}
	
	private int sendMessage(String yyyymmdd)  {
		Dao dao = new Dao();
		List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
		try {
			resultList = dao.sendList(yyyymmdd);
			File file = new File();
			file.makeListToFile(resultList, yyyymmdd);
			
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
		return resultList.size(); 
	}
}
