package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
    	Map<String, Integer> marks = new HashMap<>();
    	marks.put("Bob", 70);
    	marks.put("Mark", 66);
    	marks.put("John", 80);
    	marks.put("Steve", 57);
    	System.out.println(marks);
    	
    	System.out.println(marks.keySet());
    	System.out.println(marks.values());
    	
    	for(String key : marks.keySet()) {
    		System.out.println(marks.get(key));
    	}
    	
    	
    	Map<String, Integer> marks2 = new LinkedHashMap<>();
    	marks2.put("Bob", 70);
    	marks2.put("Mark", 66);
    	marks2.put("John", 80);
    	marks2.put("Steve", 57);
    	System.out.println(marks2);
    }
}
