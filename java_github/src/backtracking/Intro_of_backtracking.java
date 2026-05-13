package backtracking;

public class Intro_of_backtracking {

	public static void main(String[] args) {
		/*
		 * Backtracking : is to find all posible way 
		 * permutation = n!
		 * Supoose we have 3 students A,B,C the possible arrangements would be 6 that is factorial of 3 
		 * ABC, ACB, BAC , BCA, CAB  , CBA
		 */
		String str="ABC";
		print_Permutation(str," ", 0);
		
	}
	
	public static void print_Permutation(String str, String perm, int index) {
		if(str.length() ==0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i<str.length() ;i++) {
			
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			print_Permutation(newStr, perm + currChar, index+1);
			
		}
	}
	/*
	 * time complexity of this code is O(n*n!)
	 * where n! is the answer and n is the no. of steps 
	 */

}
