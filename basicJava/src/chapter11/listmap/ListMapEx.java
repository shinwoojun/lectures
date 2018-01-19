package chapter11.listmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapEx {

	public static void main(String[] args) {
		List<Map<String, String>> lists = new ArrayList<Map<String, String>>();

		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("세분류", "응용SW엔지니어링");
		m1.put("수준", "3");
		m1.put("능력단위", "화면구현");
		m1.put("시간", "25");
		m1.put("시작일", "2017-08-28");
		lists.add(m1);

		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("세분류", "DB엔지니어링");
		m2.put("수준", "3");
		m2.put("능력단위", "SQL활용");
		m2.put("시간", "30");
		m2.put("시작일", "2017-10-18");
		lists.add(m2);

		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("세분류", "응용SW엔지니어링");
		m3.put("수준", "4");
		m3.put("능력단위", "애플리케이션구현");
		m3.put("시간", "189");
		m3.put("시작일", "2017-11-10");
		lists.add(m3);

		for (Map<String, String> wholeDatas : lists) {
			Set<String> keys = wholeDatas.keySet();
			for (String key : keys) {
				System.out.println(key + " \t:\t" + wholeDatas.get(key));
			}
			System.out.println("");

		}
		
		

	}
}
