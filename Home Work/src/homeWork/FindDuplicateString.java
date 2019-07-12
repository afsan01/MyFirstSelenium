package homeWork;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateString {

	public static void main(String[] args) {
		String names[]= {"Java","Javascript","C", "ruby", "C", "Python", "Java"};
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
				
			}
			else {
				storeMap.put(name, ++count);
				System.out.println("Duplicate String are:"+ name);
			}
		}

	}

}
