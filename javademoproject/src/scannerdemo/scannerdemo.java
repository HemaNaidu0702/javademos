package scannerdemo;

import java.util.Scanner;

public class scannerdemo {
    public static void main(String [] args ){
    	Scanner sc  = new Scanner(System.in);
    	System.out.println("Enter student id");
    	int id = sc.nextInt();
    	System.out.println(id);
    	
    	System.out.println("Enter student name");
    	String name = sc.next();
    	System.out.println(name);
    	}
}
