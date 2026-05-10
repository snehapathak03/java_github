package sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		// time complexity = O(n^2)
		int a[] = {7,5,4,8,9,1,2,3,6};
		//selection sort
		for(int i=0; i<a.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[smallest] > a[j]) {
					smallest = j;
				}
			}
			
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
		}
		
		printArr(a);

	}
	
	public static void printArr(int a[]) {
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
	}

}
