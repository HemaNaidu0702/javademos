package functionalprogramming;

import java.util.function.Predicate;

public class predicatedemo {
    public static void main(String[] args) {
    	// Predicate<Integer> gt20 = (i) -> (i > 20);
    	// System.out.println("Is 5>20" + gt20.test(15));
    	
    	// Predicate<String> stringlengreatthan5 = (s) -> (s.length() > 5);
    	// System.out.println("Hello > 5" + stringlengreatthan5.test("Hello"));
    	
    	
    	
    	
    	Predicate<Integer> gt10 = (i) -> (i>10);
    	int[] x = {0 ,10, 20, 30, 40};
    	m1(gt10, x);
    }
    
    
    private boolean check (int a) {
    	return a > 20;
    }
    
    static void m1(Predicate<Integer> p, int[] x) {
    	for(int i : x) {
    		if(p.test(i)) {
    			System.out.println(i);
    		}
    	}
    }
}
