package threading;

public class interruptdemo {
    public static void main(String[] args) {
    	Utils.printmessage("Begin");
    	
    	Thread t = new Thread(new Worker());
    	t.start();
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Utils.printmessage("end");
    }
}

class Worker implements Runnable {
	public void run() {
		Utils.printmessage("start");
		for(int i =1; i <=10; i++) {
			Utils.printmessage(" " +i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Utils.printmessage("ThreadInterrupted");
			}
		}
		Utils.printmessage("end");
	}
}