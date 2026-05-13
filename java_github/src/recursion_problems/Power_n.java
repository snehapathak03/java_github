package recursion_problems;

public class Power_n {

	public static void main(String[] args) {
		//n^x(stack height = n)
		int x=2 , n=5;
		int ans = calculate_power(x , n);
		System.out.println(ans);

	}
	
	public static int calculate_power(int x, int n) {
		
		if(x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		int xPower_nm1 = calculate_power(x, n-1);
		int xPower_n = x * xPower_nm1;
		return xPower_n;
		
	}

}
