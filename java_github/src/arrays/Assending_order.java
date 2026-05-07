package arrays;

import java.util.Scanner;

public class Assending_order {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size= s.nextInt();
		
		int arr[] = new int[size];
		 for(int i=0; i<size; i++) {
	          arr[i] = s.nextInt();
	      }


	      boolean isAscending = true;
	      
	      for(int i=0; i<arr.length-1; i++) { // NOTICE arr.length - 1 as termination condition
	           if(arr[i] > arr[i+1]) { // This is the condition for descending order
	               isAscending = false;
	           }
	       }


	       if(isAscending) {
	           System.out.println("The array is sorted in ascending order");
	       } else {
	           System.out.println("The array is not sorted in ascending order");
	       }
	}

}
