package method_Programs;

import java.util.Scanner;

public class Find_Average {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 3 numbers for which u want to fine average: ");
		double a= s.nextDouble();
		double b= s.nextDouble();
		double c= s.nextDouble();
		System.out.println("Average of the given number is : "+ average(a,b,c));
	
	}
	
	public static double average(double a, double b, double c) {
		return (a+b+c)/3;
	}
	

}
