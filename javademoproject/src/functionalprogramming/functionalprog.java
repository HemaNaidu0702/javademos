package functionalprogramming;

public class functionalprog {
     public static void main(String[] args) {
    	 //traditional method
    	 Calculator calc = new Calculator();
    	 calc.calculate(4,5);
    	 
    	 //anonymous inner class
    	 Icalculator multiplier = new Icalculator() {
    		 public int calculate(int a, int b) {
    		 int result = a * b;
    		 System.out.println("Calculate " + a + "*" + b + "=" + result);
    		 return result;
    	 }
     };
     multiplier.calculate(3, 2);
     
     
     //lambda expression
     int x =15;
     int y =3;
     Icalculator divider = (a,b) -> {return a / b;};
     System.out.println("Calculate " + x + "/" + y + "=" + divider.calculate(x, y));
}
}


interface Icalculator {
	int calculate(int a, int b);
}

class Calculator implements Icalculator{
	 public int calculate (int a, int b) {
		 int result = a + b;
		 System.out.println("Calculate " + a + "+" + b + "=" + result);
		 return result;
	 }
}

