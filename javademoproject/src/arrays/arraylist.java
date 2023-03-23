package arrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
    	ArrayList list = new ArrayList();
    	list.add(2);
    	list.add(9);
    	list.add(5);
    	list.add(13);
    	list.add(4);
    	// System.out.print(list);
    	demo3();
    }
    
    public static void demo3() {
    	ArrayList<Integer> mylist = new ArrayList<Integer>();
    	
    	for(int i = 10; i <=20; i++) {
    		mylist.add(i);
    	}
    	mylist.add(2,34);
    	System.out.print(mylist);
    	
    	//searching for a value
    	
    	int val = 34;
    	if (mylist.contains(val)){
    	System.out.println("yes");
    }
}
}