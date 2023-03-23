package utilsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collections.collections;

public class utilsdemo {
	   public static void main(String[] args) {
	    	List list = new ArrayList();
	    	list.add(2);
	    	list.add(9);
	    	list.add(5);
	    	list.add(13);
	    	list.add(4);
	    	System.out.println(list);
	    	
	    	Collections.sort(list);
	    	System.out.println(list);
	    	Collections.sort(list, new Mycomparator());
	    	System.out.println(list);
	    }
}

class Mycomparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}