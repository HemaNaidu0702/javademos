package searching;

import java.util.Arrays;

public class binarysearch {
    public static void main(String [] args) {
    	int searchitem = 6;
    	int[] numbers = {99,44,6,2,1,5,63,87,283,4,0};
    	
    	Arrays.sort(numbers);

        for (int i =0; i<=numbers.length-1; i++) {
        	System.out.print("\t" +numbers[i]);
        }
        
    	int index = binarySearch(numbers, searchitem);
    	
    	if (index == -1) {
    		System.out.println("Not found");
    	}
    	else { 
    		System.out.println("Item " + searchitem + "Found at " + index);
    	}
    	
    	
    }
    
    
    private static int binarySearch(int[] arr, int searchitem) {
    	
    	int firstIndex = 0;
    	int lastIndex = arr.length -1;
    	int middleIndex = (firstIndex + lastIndex) / 2;
    	
    	while(firstIndex <= lastIndex){
    		if(searchitem > arr[middleIndex]) {
    			firstIndex = middleIndex + 1;
    		} else if (searchitem == arr[middleIndex]){
    			return middleIndex;
    		} else {
    			lastIndex = middleIndex -1;
    		}
    		middleIndex = (firstIndex + lastIndex) /2;
    	}
    	return 0;
    }
    
}
