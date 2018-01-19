package chapter16;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class NetworkEx2 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://news.naver.com:80/main/read.nhn?oid=008&sid1=100&aid=0003948906&mid=shm&mode=LSD&nh=20171017145020");
		
//		String[] querys = url.getQuery().split("&");
		List<String> querys = Arrays.asList( url.getQuery().split("&") );
		
		for(String query: querys) {
			//String[] keyVal = query.split("=");
			List<String> keyVal = Arrays.asList(query.split("="));
			
			System.out.println("key  :" + keyVal.get(0));
			System.out.println("value: " + keyVal.get(1));
			System.out.println("====================");
		}
	}

}
