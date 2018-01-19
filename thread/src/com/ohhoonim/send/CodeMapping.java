package com.ohhoonim.send;

import java.util.HashMap;
import java.util.Map;

public class CodeMapping {
	
	public static Map<String, String> EMP_CATE = new HashMap<String, String>();
	
	static {
		EMP_CATE.put("A1","1");
		EMP_CATE.put("A2","2");
		EMP_CATE.put("B1","3");
		EMP_CATE.put("B2","4");
		EMP_CATE.put("C1","5");
		EMP_CATE.put("D1","6");
		EMP_CATE.put("E1","7");
	}
	
	
	
	public static String translateEmplCateCode(String senderCode) {
		String receiveCode = "";
		
		receiveCode = EMP_CATE.get(senderCode);
		/*
		     if ( senderCode.equals("A1")) { receiveCode = "1"; }
		else if ( senderCode.equals("A2")) { receiveCode = "2"; }
		else if ( senderCode.equals("B1")) { receiveCode = "3"; }
		else if ( senderCode.equals("B2")) { receiveCode = "4"; }
		else if ( senderCode.equals("C1")) { receiveCode = "5"; }
		else if ( senderCode.equals("D1")) { receiveCode = "6"; }
		else if ( senderCode.equals("E1")) { receiveCode = "7"; }
		*/
		return receiveCode;
	}
	
	public static String translateLicnCode(String senderCode) {
		String receiveCode = "";
		
		         if ( senderCode.equals("1001")) { receiveCode = "1"; }
			else if ( senderCode.equals("1002")) { receiveCode = "1"; }
			else if ( senderCode.equals("1003")) { receiveCode = "1"; }
			else if ( senderCode.equals("1004")) { receiveCode = "1"; }
			else if ( senderCode.equals("2003")) { receiveCode = "2"; }
			else if ( senderCode.equals("2001")) { receiveCode = "8"; }
			else if ( senderCode.equals("2002")) { receiveCode = "8"; }
			else if ( senderCode.equals("3001")) { receiveCode = "10"; }
			else if ( senderCode.equals("3002")) { receiveCode = "301"; }
			else if ( senderCode.equals("3003")) { receiveCode = "379"; }
		
		
		return receiveCode;
		
	}
	
	public static String translateSchlCode(String senderCode) {
		String receiveCode = "";
		
		     if ( senderCode.equals("100")) { receiveCode = "1"; }
		else if ( senderCode.equals("110")) { receiveCode = "4"; }
		else if ( senderCode.equals("130")) { receiveCode = "6"; }
		else if ( senderCode.equals("1115")) { receiveCode = "7"; }
		else if ( senderCode.equals("125")) { receiveCode = "9"; }
		else if ( senderCode.equals("120")) { receiveCode = "10"; }
		else if ( senderCode.equals("105")) { receiveCode = "11"; }

	    return receiveCode;
	}
		
}
