package chapter15;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		File file = new File(".\\eclipse.ini");
		
		System.out.println(File.separator);
		
		String fileName = file.getName();
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		
		
		System.out.println(fileName); //eclipse.ini
		System.out.println(fileName.substring(0, fileName.lastIndexOf("."))); //eclipse
		System.out.println(fileName.substring(fileName.lastIndexOf(".") + 1)); // 확장자 . ini
		
		String ext = fileName.substring(fileName.lastIndexOf(".")+1);
		if (!ext.equals("exe") && !ext.equals("php") && !ext.equals("jsp")) {
			//...코드가 실행되도록 .... 
		}
		
		
		
	}
}
