package chapter15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("D:\\dev\\aaa.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("D:\\dev\\aaa_copy.zip");
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

	}

}












