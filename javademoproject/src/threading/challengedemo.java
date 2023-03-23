package threading;

public class challengedemo {
    public static void main(String[] args) {
		for (int i = 1; i <= 10; i++ ) {
				Utils.printmessage("" + i);
			}
    	
    	
    	Evennum ev =new Evennum();
    	Thread t1 = new Thread(ev);
    	Oddnum odd =new Oddnum();
    	Thread t2 = new Thread(odd);
    	t1.setName("T1");
    	t2.setName("T2");
    	t1.start();
    	t2.start();
    }
}

class Evennum implements Runnable{
	public synchronized void run() {
		for (int i = 1; i <= 10; i++ ) {
			if (i%2 == 0) {
				Utils.printmessage("" + i);
			}
		}
	}
}

class Oddnum implements Runnable {
	public synchronized void run() {
		for (int i = 1; i <= 10; i++ ) {
			if (i%2 != 0) {
				Utils.printmessage("" + i);
			}
		}
	}	
}