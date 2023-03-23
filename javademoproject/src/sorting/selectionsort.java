package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String [] args) {
    	int[] numbers = {99,44,6,2,1,5,63,87,283,4,0};
    	
    	System.out.println("Before sorting "+ Arrays.toString(numbers));
    	
    	
    	System.out.println("After sorting "+ Arrays.toString(Selectionsort(numbers)));
    	
    }
    
    static int[] Selectionsort(int[] array) {
    	for(int i=0; i<array.length; i++) {
    		int indexofSmallest =i;
    		for(int j=i; j<array.length; j++) {
    			if(array[j] < array[indexofSmallest]) {
    				indexofSmallest = j;
    			}
    		}
    		int temp = array[i];
			array[i] = array[indexofSmallest];
			array[indexofSmallest] = temp;
    	}
    	return array;
    }
}
