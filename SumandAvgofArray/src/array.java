import java.util.Arrays;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		System.out.println("enter the number of element:");
		   Scanner in = new Scanner(System.in);
		   
		   int n = in.nextInt();
		   
		 int[] arr = new int [n];
		 System.out.println("enter the valude of array:");
		 for(int i = 0 ; i< n ; i++) {
			    System.out.println(i+1);
			       arr[i] = in.nextInt();
		 }
		 
			Arrays.sort(arr)   ;    
			System.out.println("array after oder :" +Arrays.toString(arr));
			
			int sum = 0;
			for (int i=0; i<arr.length; i++) {
				sum += arr[i];
			}
			double avg = (double) sum / arr.length;
			
			System.out.println("sum of element in array:" +sum);
			
			System.out.println("the average of element in array:" +avg);

	}

}
