package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int ary[] = {7,5,4,8,9,1,2,3,6};
		//insertion sort
		for(int i=0; i<ary.length;i++) {
			int curr = ary[i];
			int j = i-1;
			while(j>= 0 && curr < ary[j]) {
				ary[j+1] = ary[j];
				j--;
			}
			//placement 
			ary[j+1] = curr;
			
		}
		
		print_ary(ary);

	}
	
	public static void print_ary(int ary[]) {
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i]+",");
		}
	}

}
