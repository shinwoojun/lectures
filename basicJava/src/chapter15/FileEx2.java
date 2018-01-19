package chapter15;

import java.io.File;
import java.util.ArrayList;

public class FileEx2 {
	public static int totalFiles = 0;
	public static int totalDirs = 0;
	
	public static void main(String[] args) {
		/*
		if(args.length != 1) {
			System.out.println("USAGE: java FileEx3 DIRECTORY");
			System.exit(0);
		}
		*/
		File dir = new File("D:\\dev\\workspace\\hellohello\\src\\chapter11");
		
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		printFileList(dir);
	}
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + "디렉토리");
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			String filename = files[i].getName();
			if (files[i].isDirectory()) {
				System.out.println("directory: " + filename);
			} else {
				System.out.println("file     : " + filename);
			}
		}
		
		
	}
}









