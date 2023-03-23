package threading;

public class runnabledemo {
    public static void main(String [] args) {
    	
    	
    	Utils.printmessage("Begin main");
    	Thread t = new Thread(new Runnable() {
    		public void run() {
    			Utils.printmessage("Do work");;
    		}
    	});
    	t.start();
    	Utils.printmessage("End work");
    }
}
