package arrays;

import java.util.Scanner;

public class MIn_Max {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size= s.nextInt();
		 int num []= new int[size];
		 
		 for(int i=0; i<size; i++) {
			 num[i] = s.nextInt();
		 }
		 
		 int max= num[0];
		 int min= num[0];
		 
		 for(int i=0; i<num.length; i++) {
	          if(num[i] < min) {
	               min = num[i];
	           }
	           if(num[i] > max) {
	               max = num[i];
	           }
		 } 
		 
		 System.out.println("Largest number is: "+max);
		 System.out.println("Lowest number is :"+min);


	}

}
