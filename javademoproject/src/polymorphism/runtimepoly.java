package polymorphism;

public class runtimepoly {
	   public static void main(String[] args) {
		 Macbook mac = new Macbook();
		 mac.start();
		 
		 Macbook mac1 = new MacbookAir();
		 mac1.start();
	   }
	   
	
}

class Macbook{
	   void start() {
		   System.out.println("Macbook starts");
	   }
	   void stop() {
		   System.out.println("Macbook stops");
	   }
}

class MacbookAir extends Macbook{
	   void start() {
		   System.out.println("Macbookair starts");
	   }
	   void stop() {
		   System.out.println("Macbookair stops");
	   }
}


class MacbookPro extends Macbook{
	   void start() {
		   System.out.println("MacbookPro starts");
	   }
	   void stop() {
		   System.out.println("MacbookPro stops");
	   }
}