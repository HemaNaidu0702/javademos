package arrays;

public class arrayprogs {
   public static void main(String[] args) {
	   //replacewithzeroes();
	   //sumofarray();
	   //sumofevennumbers();
	   reversestring();
   }
   
   public static void replacewithzeroes() {
	   int arr1[] = {3,5,4,5,6,3,5,7};
	   
	   for(int i =1; i<arr1.length; i++) {
		   if(arr1[i] == 5 && arr1[i-1] ==3)
			   arr1[i] = 0;
	   }
	   for(int i =0; i<arr1.length; i++) {
	       System.out.print(arr1[i] + ",");
	   }
   }
   
   
   public static void sumofarray() {
	   int arr1[] = {1,2,3,1};
	   int sum =0;
	   
	   for(int i =0; i<arr1.length; i++) {
		   sum += arr1[i];
	   }
	
	       System.out.print(sum);
	  
   }
   
   public static void sumofevennumbers() {
	   int arr1[] = {1,2,3,6};
	   int sum =0;
	   
	   for(int i =0; i<arr1.length; i++) {
		   if(arr1[i] %2 == 0)
		   sum += arr1[i];
	   }
	
	       System.out.print(sum);
	  
   }
   
   
   public static void reversestring() {
	   String s = "Hello";
	   
	   
	   for(int i =s.length()-1; i>=0; i--) {
		   System.out.print(s.charAt(i));
	   }
	
	       
	  
   }
}
