package chapter13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

public class FileCopy2 implements Callable{

	private String srcFilePath ;
	private String targetFilePath ; 
	
	public FileCopy2(String src, String target) {
		this.srcFilePath = src;
		this.targetFilePath = target;
	}
	
	@Override
	public String call() {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(this.srcFilePath);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(this.targetFilePath);
			bos = new BufferedOutputStream(fos);			
			
			int data = 0;
			long startTime = System.nanoTime();
			System.out.println("복사시작: " + startTime);
			while((data = bis.read()) != -1) {
				//char c = (char)data;
				bos.write(data);
				
			}
			long endTime = System.nanoTime();
			System.out.println("복사종료: " + endTime);
			System.out.println("걸린시간: " + (endTime - startTime));
			
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		}
		
		return "end";
	}

}
