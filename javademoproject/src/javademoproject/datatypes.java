package javademoproject;

public class datatypes {
	
    public static void main(String [] args) {
    
        byte a = 5;
    	
    	System.out.println(a);
    	a = (byte) 150;
    	System.out.println(a);
    	
    	System.out.println(Byte.MAX_VALUE);
    	
    	float f = 1.23f;
    	System.out.println(f);
    	
    	double g = 1345.23435;
    	System.out.println(g);
    	
    	//type casting
    	
    	byte x = 100;
    	int y = 65;
    	// y = x;
    	// System.out.println(y);
    	
    	x = (byte) y;
    	System.out.println(x);
    	
    	
    	
  
    	char ch = 'a';
    	System.out.println(ch);
    	
    	int m = ch;
    	System.out.println(m);
    }
}
