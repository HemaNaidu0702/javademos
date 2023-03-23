package threading;

import java.util.Scanner;

public class joindemo {
    public static void main(String[] args) {
    	printmessage("Sum of first n digits");
    	printmessage("Enter the value of n");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	calculator calc = new calculator(n);
    	calc.start();
    	
    	try {
			calc.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	printmessage("Sum of first" + n + "numbers" + calc.getSum());
    }
    
    private static void printmessage(String message) {
    	System.out.println(Thread.currentThread().getName() + "-" + message);
    }
}


class calculator extends Thread{
	int n;
	int sum;
	
	calculator(int n) {
		this.n = n;
	}
	
	public void run() {
		for(int i =1; i<=n; i++) {
			this.sum += i;
		}
	}
	public int getSum() {
		return sum;
	}
}