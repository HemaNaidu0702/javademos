package functionalprogramming;

import java.util.function.Predicate;

public class mergetwopredicate {
    public static void main(String[] args) {
        int [] y = {1,2,3,4,5,6,7,8,9,10};
    	Predicate<Integer> gt5 = (i) -> (i>5);
    	Predicate<Integer> isEven = (i) -> (i%2==0);
    	int[] x = {0 ,10, 20, 30, 40};
    	m1(gt5.and(isEven), y);
    }
    
   
    
    static void m1(Predicate<Integer> p, int[] x) {
    	for(int i : x) {
    		if(p.test(i)) {
    			System.out.println(i);
    		}
    	}
    }
}
