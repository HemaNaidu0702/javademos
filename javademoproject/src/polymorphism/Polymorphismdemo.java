package polymorphism;

//compile time
public class Polymorphismdemo {
   public static void main(String[] args) {
	   compiletime ctc = new compiletime();
	   ctc.add(1, 2);
	   ctc.add(3.45f, 2.432f);
	   ctc.add("hema", "naidu");
	   ctc.add(1, 2, 6);
   }
}

class compiletime{
	void add(int a,int b) {
		int result = a + b;
		System.out.println("result of two integers" + result);
	}
	
	void add(float a,float b) {
		float result = a + b;
		System.out.println("result of two non integers" + result);
	}
	
	void add(String a,String b) {
		String result = a + b;
		System.out.println("result of two strings" + result);
	}
	
	void add(int a,int b, int c) {
		int result = a + b+ c;
		System.out.println("result of three integers" + result);
	}
}
