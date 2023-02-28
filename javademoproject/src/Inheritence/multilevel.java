package Inheritence;

public class multilevel {
   public static void main(String[] args) {
	   JDK7 jdk = new JDK7();
   }
}

class JDK6 {
	JDK6() {
		System.out.println("Initially JDK6");
	}
}

class JDK7 extends JDK6{
	JDK7() {
		System.out.println("Initially JDK7");
	}
}

class JDK8 extends JDK7 {
	JDK8() {
		System.out.println("Initially JDK8");
	}
}