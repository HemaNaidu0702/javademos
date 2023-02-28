package encapsulation;
public class encapsulation {
  public static void main(String[] args) {
	  Cars car1 = new Cars();
	  car1.setcolor("Blue");
	  System.out.println(car1.getcolor());
	  System.out.println(car1.getnumofwheels());
  }
}

class Cars {
	private String color;
	private int numofwheels;
	private boolean customizable;
	
	
	public Cars() {
		numofwheels = 4;
		color = "white";
		customizable = true;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public int getnumofwheels() {
		return this.numofwheels;
	}
	
	public void setcolor(String color1) {
		if (customizable)
		this.color = color1;
	}
	
	public void setnumofwheels(int numofwheels1) {
	    this.numofwheels = numofwheels1;
	}
}
