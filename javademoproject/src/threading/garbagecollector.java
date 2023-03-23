package threading;

public class garbagecollector {
    public static void main(String [] args) {
    	// new House(1);
    	// new House(2);
    	for(int i =1; i<=100000; i++) {
    		new House(i);
    	}
    }
}

class House {
	int id;
	House(int id) {
		this.id = id;
		Utils.printmessage("House created" + id);
	}
	
	public void finalize() throws Throwable {
		Utils.printmessage("House Destroyed" + id);
	}
}