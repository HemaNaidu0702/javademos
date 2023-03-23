package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertionsort {
    public static void main(String [] args) {
    	List<Integer> numbers = new ArrayList<>();
    	numbers.add(99);
    	numbers.add(44);
    	numbers.add(6);
    	numbers.add(2);
    	numbers.add(1);
    	numbers.add(63);
    	
    	System.out.println("Before sorting "+ numbers);
    	
    	
    	System.out.println("After sorting "+ Insertionsort(numbers));
    	
    }
    
    static List<Integer> Insertionsort(List<Integer> numbers) {
    	 for(int i = 1; i <numbers.size(); i++) {
    		 if(numbers.get(i) < numbers.get(0)) {
    			 numbers.add(0, numbers.get(i));
    			 numbers.remove( i+1);
    		 } else if(numbers.get(i) < numbers.get(i -1))  {
    			 for(int j = 1; j <i; j++) {
    				 if(numbers.get(i) < numbers.get(j)) {
    	    			 numbers.add(j, numbers.get(i));
    	    			 numbers.remove( i+1);
    	    		 }  
    			 }
    		 }
    	 }
    	 return numbers;
    }
}

