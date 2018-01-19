package com.ohhoonim.receive;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReceiveFile {
	public List<Map<String, String>> readSendMessage(String yyyymmdd) throws Exception{
		String fileInPath = "D:\\temp\\sendMessage" + yyyymmdd + ".txt";

		FileInputStream   fis   = new FileInputStream(fileInPath);
		InputStreamReader isr   = new InputStreamReader(fis, "utf-8");
		BufferedReader    br    = new BufferedReader(isr);
		
		String line = "";
		int lineNum = 0;
		List<String> keySet = new ArrayList<String>();
		List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
		while ((line = br.readLine()) != null) {
			String[] rowData = line.split("_____");
			if (lineNum == 0) {
				// keyset 추출
				keySet = Arrays.asList(rowData);
			} else {
				// 리스트 전환 로직
				resultList.add(makeRowMap(keySet, rowData));
			}
			lineNum++;
		}
		System.out.println("추출완료");
		
		br.close();
		
		return resultList;
	}
	
	private Map<String, String> makeRowMap(List<String> keySet, String[] rowData) {
		Map<String, String> row = new HashMap<String, String>();
		int size = keySet.size();
		for(int i = 0; i < size; i++ ) {
			if(!keySet.get(i).equals("")) {
				row.put(keySet.get(i), rowData[i]);
			}
		}		
		return row;
	}
}
