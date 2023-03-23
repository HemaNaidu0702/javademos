package threading;

public class deadlocks {
    public static void main(String[] args) {
    	FirstResource fr = new FirstResource();
    	SecondResource sr = new SecondResource();
    	ResourceWorker rw = new ResourceWorker(fr, sr);
    	Thread t = new Thread(rw);
    	t.start();
    	sr.method2(fr);
    }
}

class FirstResource {
 public synchronized void method1(SecondResource sr) {
		Utils.printmessage("Inside first resource");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Invoking second message");
		sr.method1();
	}
	
	public void method2() {
		Utils.printmessage("FirstResource.method2");
	}
}

class SecondResource {
	public synchronized void method2(FirstResource fr) {
		Utils.printmessage("Inside second resource");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Invoking first message");
		fr.method2();
	}
	public void method1() {
		Utils.printmessage("FirstResource.method1");
	}
}

class ResourceWorker implements Runnable {
	FirstResource fr;
	SecondResource sr;
	
	ResourceWorker(FirstResource fr, SecondResource sr){
		this.fr = fr;
		this.sr =sr;
		
	}
	
	public void run() {
		fr.method1(sr);
	}
	
}