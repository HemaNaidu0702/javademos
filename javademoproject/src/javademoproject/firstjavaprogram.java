package javademoproject;

public class firstjavaprogram {
	
	public firstjavaprogram() {
		 System.out.println("constructor");
	}
	static {
		 System.out.println("static block");
	}
	{
	    
		 System.out.println("non static block");
	}
	 byte color = 50;
	 
public static void main(String[]args) {
	  System.out.println("main method");
	  
	 
	// firstjavaprogram jnsd1 = new firstjavaprogram();
	  firstjavaprogram jnsd2 = new firstjavaprogram();
	  // System.out.println(jnsd1.color);
	  // System.out.println(jnsd2.color);
	  
  }
}
