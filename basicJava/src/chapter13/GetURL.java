package chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class GetURL implements Runnable {
	private String initUrl;
	private String encoding;
	private String fileOutPath ;
	
	public GetURL(String url, String encoding, String fileOutPath) {
		this.initUrl = url;
		this.encoding = encoding;
		this.fileOutPath = fileOutPath;
	}
	
	@Override
	public void run() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL(this.initUrl);
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, this.encoding);
			br = new BufferedReader(isr);
				
			FileOutputStream   fos   = new FileOutputStream(this.fileOutPath);
			OutputStreamWriter osr   = new OutputStreamWriter(fos, this.encoding);
			bw    = new BufferedWriter(osr);
			
			String line = "";
			while( (line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("완료");
		
	}
	
}
