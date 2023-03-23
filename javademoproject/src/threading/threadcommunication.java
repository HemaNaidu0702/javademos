package threading;

public class threadcommunication {
	
	public static void main(String[] args) throws InterruptedException {
		Mythread mythread = new Mythread();
		
	
   Thread t1 = new Thread(mythread);
   t1.setName("T1");
   t1.start();
   
   synchronized (t1) {
	   Utils.printmessage("going to wait");
	   t1.wait();
   
   
     Utils.printmessage("notified");
     Utils.printmessage("Total" + mythread.sum );
	}
}
}


class Mythread implements Runnable {
	int sum;
	public void run() {
		Utils.printmessage("Calculating sum");
		
		synchronized (this) {
		for (int i =0; i<=100; i++) {
			sum += i;
		
		}
	
	Utils.printmessage("calculation completed......notify");
	this.notify();
		}
	}
	public int getsum() {
		return sum;
	}
}
