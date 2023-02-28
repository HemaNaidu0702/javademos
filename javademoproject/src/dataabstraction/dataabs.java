package dataabstraction;

public class dataabs {
   public static void main(String[] args) {
	   BMWthreeseries b3 = new BMWthreeseries();
	   b3.start();
	   b3.accelerate();
   }
}

abstract class BMW {
    void start() {
		System.out.println("BMW started");
	}
	abstract void accelerate() ;
}

class BMWthreeseries extends BMW {
	void accelerate() {
		System.out.println("BMW3 accelerated");
	}
}