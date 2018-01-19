package chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapTest {

	public static void main(String[] args) {
		Map<String, String> rowMap1 = new HashMap<String, String>();
		rowMap1.put("name", "홍길동");
		rowMap1.put("english", "89");
		rowMap1.put("math", "65");
		rowMap1.put("science", "45");
		rowMap1.put("music", "85");

		Map<String, String> rowMap2 = new HashMap<String, String>();
		rowMap2.put("name", "김영희");
		rowMap2.put("english", "85");
		rowMap2.put("math", "65");
		rowMap2.put("science", "65");
		rowMap2.put("music", "38");
		
		Map<String, String> rowMap3 = new HashMap<String, String>();
		rowMap3.put("name", "손석희");
		rowMap3.put("english", "98");
		rowMap3.put("math", "68");
		rowMap3.put("science", "75");
		rowMap3.put("music", "64");
		
		List<Map<String, String>> datas = new ArrayList<Map<String, String>>();
		datas.add(rowMap1);
		datas.add(rowMap2);
		datas.add(rowMap3);
		
		for(Map<String, String> row: datas) {
			Set<String> keys = row.keySet();
			for(String key: keys) {
				System.out.print(key + ":" + row.get(key) + "      ");
			}
			System.out.println("");
		}
		
		
	}

}












