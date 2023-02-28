package dataabstraction;

public class interfacedemo {
   public static void main(String[] args) {
	   honda h1 = new honda();
	   h1.start();
	   h1.stop();
   }
}

  abstract class car {
	 abstract void start();
	 abstract void stop();
  }
  
  class honda extends car{
	  public void start() {
		  System.out.println("starts");
	  }
	  public void stop() {
		  System.out.println("stops");
	  }
  }
