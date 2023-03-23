package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
    	randomdemo();
    	hashdemo();
    }
    
    public static void randomdemo() {
    	Random random = new Random();
    	int x = random.nextInt(10,20);
    	System.out.println(x);
    }
    
    public static void hashdemo() {
    	Random random = new Random();
    	ArrayList list = new ArrayList();
    	
    	for(int i =0; i<10; i++) {
    		list.add(random.nextInt(10,30));
    	}
    	System.out.println(list);
    	
    	Set<Integer> set = new HashSet<>(list);
    	System.out.println(set);
    	
    	Set<Integer> link = new LinkedHashSet<>(list);
    	System.out.println(link);
    	
    	Set<Integer> tree = new TreeSet<>(list);
    	System.out.println(tree);
    }
}
