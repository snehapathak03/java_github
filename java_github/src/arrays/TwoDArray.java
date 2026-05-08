package arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter rows size");
		int row= s.nextInt();
		System.out.print("Enter columns size");
		int col= s.nextInt();
		
		int matrix[][]= new int[row][col];
		
		// input
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j]= s.nextInt();
			}
		}
		
		System.out.println("Displaying the matrix");
		
		//output
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
