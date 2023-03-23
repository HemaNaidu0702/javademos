package functionalprogramming;

import java.util.function.Function;

public class functiondemo {
   public static void main(String[] args) {
	   Function<String, Integer> f1 = s-> s.length();
       System.out.println("Lenth of hello is " + f1.apply("Hello"));
   }
}
