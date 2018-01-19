package chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("aaa", "12345");
		map.put("bbb", "65489");
		map.put("ccc", "25648");
		map.put("ddd", "56958");
		map.put("eee", "69874");
		
		Set<String> keys = map.keySet();
		
		for(String key: keys) {
			System.out.println(map.get(key));
		}
		
	}

}









