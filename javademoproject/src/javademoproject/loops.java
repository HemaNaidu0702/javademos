package javademoproject;

public class loops {

	public static void main(String [] args) {
		
		// even numbers
		for(int i = 0; i <=10; i++) {
			if(i%2==0) 
				System.out.println(i);
			
		}
		
		//sum of odd numbers
		int sum = 0;
		for(int i =1; i <=10; i=i+2) {
			sum = sum + i;
		}
		System.out.println(sum);

	
	//reverse numbers
	for(int i =10; i >=0; i--) {
		System.out.println(i);
	}
	
	
	//while loop
	
	int i =1;
	while(i<6) {
		System.out.println("hello");
		i++;
	}
}
}
