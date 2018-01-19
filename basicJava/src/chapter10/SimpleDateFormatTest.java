package chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws Exception {
		// 날짜와 시간을 다루는 클래스
		// Date, Calendar
		// 그러나, 단점이 많은 클래스들.
		// jdk 1.8 부터는 java.time 패키지로 기능 제공
		
		// 오늘 날짜 구하기
		Date today = new Date();
		System.out.println(today.toString());
		
		////////////////////// Date 형을 String 형으로 변환
		
		// 날짜 포맷
		SimpleDateFormat dayFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatResult = dayFormat1.format(today);
		System.out.println(formatResult);

		SimpleDateFormat dayFormat2 = new SimpleDateFormat("yyyy/MM/dd");
		String formatResult2 = dayFormat2.format(today);
		System.out.println(formatResult2);
				
		// 시간 포맷
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss SSS");
		String formatResult3 = timeFormat.format(today);
		System.out.println(formatResult3);
		
		
		
		/////////////////////// String 형을 Date 형으로 변환하기
		SimpleDateFormat dayFormat3 = new SimpleDateFormat("yyyy-MM-dd");
		String endDate = "2017/12/30";
		Date dateResult = dayFormat3.parse(endDate); // Exception 처리 필요
		System.out.println(dateResult.toString());
	}
}










