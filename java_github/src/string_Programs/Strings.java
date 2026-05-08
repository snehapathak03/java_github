package string_Programs;

import java.util.Scanner;

public class Strings {
// Strings are Immutabe means u cant change the string if u want to make any changes u have to make new string 
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first name : ");
		String firstName= s.next();
		System.out.println("Enter last name : ");
		String lastName = s.next();
		
		String fullName = firstName +" "+ lastName;
		System.out.println("Full name : "+fullName);  	// concatenation- use to join the two strings .
		System.out.println("Length of the fullName String : "+fullName.length());	//length() - function is use to find the length of the String.
		System.out.println("Length of the firstName : "+ firstName.length());
		System.out.println("Length of the lastName : "+ lastName.length());
		
		for(int i=0; i<fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}
		// compare two strings
		System.out.println("Enter str1 : ");
		String str1= s.next();
		System.out.println("Enter str2 : ");
		String str2= s.next();
		if(str1.compareTo(str2)==0) {
			System.out.println("str1 is equal to str2");
		}else {
			System.out.println("str1 is not equal to str2");
		}
		
		System.out.println(str1.compareTo(str2)); // gives integer value 
		
		System.out.print("ENter a sentence:");
		String sentence= s.nextLine();

		//substring(begin index , end index)- here what ever u will give the begin index it will print from that side only anf stops at whatever the end index is given
		System.out.println(sentence.substring(5, sentence.length()));

	}

}
