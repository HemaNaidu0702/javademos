package exceptionhandling;

import java.util.Scanner;

public class exceptions {
    public static void main(String [] args) {
        //arithemeticexception();
        // stringparseerror();
    	// nullpointer();
    }


public static void arithemeticexception() {
  	int a, b;
	float c, d;
	
	System.out.println("Enter the value of a");
	Scanner sc1 = new Scanner(System.in);
	a = sc1.nextInt();
	
	System.out.println("Enter the value of b");
	Scanner sc2 = new Scanner(System.in);
	b = sc2.nextInt();
	
	try {
		c = a/b;
		d = a%b;
		System.out.println("division is " + c);
		System.out.println("modulus is " + d);
	} catch(Exception ex) {
		System.out.println("Exception " + ex.getMessage());
	} finally {
		System.out.println("End of calculator");
	}
}

public static void stringparseerror() {
	try {
		String s = "7646";
		int i = Integer.parseInt(s);
		System.out.println("parsed int is " + i);
	} catch (Exception ex) {
		System.out.println("exception is  " + ex.getMessage());
	}
}


public static void nullpointer() {
	try {
		String s = null;
		System.out.println("length of the string is " + s.length());
	} catch (Exception ex) {
		System.out.println("exception is  " + ex.getMessage());
	}
}

}