package method_Programs;

import java.util.Scanner;

public class Cricle {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value for radius to find circumference: ");
		double r= s.nextDouble();
		System.out.println("Cricumference of a circle: "+ circumference(r));

	}
	
	public static double circumference(double r) {
		
		return 2*3.14*r;
	}

}
