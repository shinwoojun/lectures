package chapter16;

import java.net.InetAddress;
import java.util.Arrays;

public class NetworkEx1 {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
		System.out.println(Arrays.toString(ip.getAddress()));
		
		
		InetAddress localIp = InetAddress.getLocalHost();
		System.out.println(localIp.getHostAddress());
		
	}
}
