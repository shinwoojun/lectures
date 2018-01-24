package gitRepositories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class test2 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://news.naver.com/main/read.nhn?oid=008&sid1=100&aid=0003948906&mid=shm&mode=LSD&nh=20171017145020");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, "euc-kr");
		BufferedReader br = new BufferedReader(isr);
		
		String fileOutPath = "D:\\temp\\news_result.html";

		FileOutputStream   fos   = new FileOutputStream(fileOutPath);
		OutputStreamWriter osr   = new OutputStreamWriter(fos, "euc-kr");
		BufferedWriter    bw    = new BufferedWriter(osr);
		
		String line = "";
		while( (line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		br.close();
		System.out.println("완료");
	}
}
