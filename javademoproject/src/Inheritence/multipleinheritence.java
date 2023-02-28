package Inheritence;

public class multipleinheritence {
  public static void main(String[] args) {
	  bus v1 = new bus();
	  System.out.println(v1.fuel());
  }
}

class Vehicle {
	String fuel() {
		return "petrol";
	}
}

class car extends Vehicle{
	String fuel() {
		return "CNG";
	}
}

class bus extends Vehicle{
	String fuel() {
		return super.fuel();
	}
}
