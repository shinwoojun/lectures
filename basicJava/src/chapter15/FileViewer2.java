package chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileViewer2 {

	public static void main(String[] args) {
		FileReader fis = null;
		BufferedReader bis = null;
		FileWriter fos = null;
		BufferedWriter bos = null;
		
		try {
			fis = new FileReader("D:\\dev\\index.html");
			bis = new BufferedReader(fis);
			fos = new FileWriter("D:\\dev\\index_copy.html");
			bos = new BufferedWriter(fos);			
			
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












