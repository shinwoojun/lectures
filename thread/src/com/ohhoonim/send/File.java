package com.ohhoonim.send;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class File {

	
	public String[] KEY_SET = {
			"NOTICE_DATE" , "NOTICE_IDEN" , "NOTICE_STATE" , "EMPLOY_TYPE" , "CATE_STATE"
			, "PERSON" , "QUALI_FIELD" , "LANGUAGE_CODE" , "CONTENTS" , "MANAGER"
			, "APPLY_DATE" , "MAGAM_DATE" 
	};
	
	public void makeListToFile(List<Map<String, String>> list, String yyyymmdd)  throws Exception {
		
		String fileOutPath = "D:\\temp\\sendMessage" + yyyymmdd + ".txt";
		
		FileOutputStream   fos   = new FileOutputStream(fileOutPath);
		OutputStreamWriter osr   = new OutputStreamWriter(fos, "utf-8");
		BufferedWriter    bw    = new BufferedWriter(osr);
		
		int keySetSize = KEY_SET.length;
		bw.write(String.join("_____", KEY_SET));
		bw.newLine();
		for (Map<String, String> row: list) {
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < keySetSize; i++ ) {
				sb = sb.append(row.get(KEY_SET[i]));
				sb = sb.append("_____");
			}
			
			bw.write(sb.toString());
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}
}
