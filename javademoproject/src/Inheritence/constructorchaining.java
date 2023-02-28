package Inheritence;

public class constructorchaining {
   public static void main(String [] args) {
	   childclass cc = new childclass(10);
	   
   }
}

class superclass {
	superclass() {
		System.out.println("No argument superclass");
	}
	
	superclass(int x) {
		System.out.println("one argument superclass");
	}
}

class childclass extends superclass{
	int y;
	childclass() {
		System.out.println("No argument childclass");
	}
	childclass(int y) {
		super(y);
	}
}
