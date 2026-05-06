package method_Programs;

import java.util.Scanner;

public class Eligible_Or_Not {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter age :");
		int age= s.nextInt();
		
		vote(age);
		

	}
	
	public static void vote(int age) {
		
		if(age>=18 && age>0) {
			System.out.println("Elegible to vote.");
			return;
		}if(age<18 && age>0) {
			System.out.println("Not Elegible to vote. ");
			return;
		}else {
			System.out.println("Invalid Input");
			return;
		}
	}

}
