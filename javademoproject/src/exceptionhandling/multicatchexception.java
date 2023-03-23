package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class multicatchexception {
   public static void main(String [] args) {
	   multicatch();
	   
	  
      try {
		checkedException();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
 
   private static void multicatch() {
	   try {
		   String s = "6476";
		   int i = Integer.parseInt(s);
		   System.out.println("converted integer is " + i);
		   String a = null;
		   System.out.println("the length of string is "+ a.length());
	   } catch(NumberFormatException next) {
		   System.out.println("the exception is "+ next.getMessage());
	   } catch(NullPointerException nex) {
		   System.out.println("the exception is "+ nex.getMessage());
	   } catch(Exception ex) {
		   System.out.println("the exception is "+ ex.getMessage());
	   } 
   }
   
  
   private static void checkedException () throws FileNotFoundException {
	   FileInputStream fis = new FileInputStream("/c:/javafsd/javademos/myfile");
  }
 
  }