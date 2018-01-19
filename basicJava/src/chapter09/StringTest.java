package chapter09;

public class StringTest {
	public static void main(String[] args) throws Exception {
		String str = "원천징수,원가계산,결산관리,부가세신고";  // "회계감사"
		String[] words = str.split(",");
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < words.length; i++) {
			sb = sb.append(words[i]);
			sb = sb.append(",");
		}
		System.out.println(sb);
		String strResult = sb.substring(0, sb.length() - 1);	
		System.out.println(strResult);
		
		
		/*
		String str1 = "hello";
		
		StringBuffer sb = new StringBuffer(str1);
		sb = sb.append(" world");
		System.out.println(sb);
		///
		String str1 = "hello";
		str1 = str1 + " world";
		System.out.println(str1);
		////

		int num = 1000;
		String str = String.valueOf(num)  ;
		
		String str1 = new String("leave us");
		
		String str = "가나다"; 
		
		byte[] byteStr = str.getBytes();
		
//		String utfStr = new String(byteStr, "UTF-8");
		String utfStr = new String(byteStr, "CP949");
		System.out.println(utfStr);
		
		
		System.out.println("    sdaf   sdg      ".trim());
		System.out.println("    sdaf   sdg      ".replace(" ", ""));
		
		String str = "Called by the garbage collector on an object ";
		System.out.println(str.substring(14, 21));
		
		int startIndex = str.indexOf("garbage");
		int endIndex = str.indexOf("on") + "on".length();
		
		System.out.println(str.substring(startIndex, endIndex));
		
		String str = "원천징수,원가계산,결산관리,부가세신고";
		String[] words = str.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println(str.endsWith(".txt")); // false
		System.out.println(str.startsWith("원천")); // true
		
		//String str = "leave us";
		String str = new String("leave us");
		String str2 = str.replace("e", "E");
		System.out.println(str2);
		System.out.println(str2.replaceFirst("E", "e"));
		
		System.out.println(str.length()); // 8
		
		System.out.println(str.charAt(6));   // 'u'
		System.out.println(str.indexOf("u")); // 6 
		System.out.println(str.indexOf("X")); // -1
		System.out.println(str.lastIndexOf("e")); // 4
		System.out.println(str.indexOf("e")); // 1

		System.out.println(str.concat(". wait!!"));  // leave us. wait!!
		System.out.println(str.contains("us")); // true
		
		*/
	}
}
