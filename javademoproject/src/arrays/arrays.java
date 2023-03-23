package arrays;

public class arrays {
   public static void main(String[] args) {
	   int arr[] = {2,41,9,5,0};
	   
	   arr[2] = 34;
	   arr[3] = new Integer(23);
	   
	   printarray(arr);
   }
   
   public static void printarray(int[] arr) {
	   for(int i = 0; i < arr.length; i++) {
		   System.out.print(arr[i] + ", ");
	   }
   }
}
