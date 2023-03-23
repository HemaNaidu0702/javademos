package threading;

public class threading {
  public static void main(String[] args) {
	  SingleThread st = new SingleThread();
	  st.printnumbers();
	  MultiThread mt = new MultiThread();
	  mt.start();
  }
}

class SingleThread {
	void printnumbers() {
		System.out.println(Thread.currentThread().getName() + "-");
		for (int i =0; i<=100; i++) {
			
			System.out.println(i + "\t");
		}
	}
}

class MultiThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName() + "-");
		for (int i =0; i<=100; i++) {
		 System.out.println(Thread.currentThread().getName() + "-"+ i);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
