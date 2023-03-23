package threading;

public class daemonthread {
     public static void main(String[] args) {
    	 Utils.printmessage("" + Thread.currentThread().isDaemon());
    	 Worker1 worker = new Worker1();
    	 worker.setDaemon(true);
    	 Utils.printmessage(""+ worker.isDaemon());
    	 worker.start();
     }
}


class Worker1 extends Thread {
	public void run()  {
		for(int i = 0; i<10; i++) {
			Utils.printmessage("" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
