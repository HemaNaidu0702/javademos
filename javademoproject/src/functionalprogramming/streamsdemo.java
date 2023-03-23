package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamsdemo {
    public static void main(String[] args) {
    	
    	List<Integer> list = new ArrayList<>();
    	for (int i =1; i<=10; i++) {
    		list.add(i);
    	}
    	System.out.println(list);
    	List<Integer> filteredlist = list.stream().filter(i->i%2==0).collect(Collectors.toList());
    	System.out.println(filteredlist);
    	
    	List<Integer> mulby2 = filteredlist.stream().map(i->i*2).collect(Collectors.toList());
    	System.out.println(mulby2);
    }
}
