package searching;

import java.util.Arrays;

public class linearsearch {
    public static void main(String [] args) {
    	int searchitem = 6;
    	int[] numbers = {99,44,6,2,1,5,63,87,283,4,0};
    	
    	int index = linearSearch(numbers, searchitem);
    	
    	if (index == -1) {
    		System.out.println("Not found");
    	}
    	else { 
    		System.out.println("Item " + searchitem + "Found at " + index);
    	}
    	
    	
    }
    
    private static int linearSearch(int[] arr, int searchitem) {
    	for(int i = 0; i < arr.length; i++){
    		if(arr[i] == searchitem) {
    			return i;
    		}
    	}
    	return -1;
    }
}
