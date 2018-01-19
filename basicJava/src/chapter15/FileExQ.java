package chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileExQ {
	public static void main(String[] args) throws IOException {
		String fileInPath = "D:\\dev\\workspace\\hellohello\\src\\hello\\original.txt";
		String fileOutPath = "D:\\dev\\result.txt";

		FileInputStream   fis   = new FileInputStream(fileInPath);
		InputStreamReader isr   = new InputStreamReader(fis, "utf-8");
		BufferedReader    br    = new BufferedReader(isr);
		
		FileOutputStream   fos   = new FileOutputStream(fileOutPath);
		OutputStreamWriter osr   = new OutputStreamWriter(fos, "utf-8");
		BufferedWriter    bw    = new BufferedWriter(osr);
		
		String line = "";
		int lineNum = 0;
		while ((line = br.readLine()) != null) {
			StringBuffer newLine = new StringBuffer();
			if (lineNum != 0) {
				String[] rowData = line.split(",");
				String changedHours = String.valueOf(Integer.parseInt(rowData[3]) + 5);
				rowData[3] = changedHours;
				for (String data: rowData) {
					newLine.append(data);
					newLine.append(",");
				}
			} else {
				newLine.append(line);
			}
			bw.write(newLine.toString());
			bw.newLine();
			lineNum++;
		}
		bw.flush();
		System.out.println("작업종료");
		
		bw.close();
		br.close();
		
		
	}
}
