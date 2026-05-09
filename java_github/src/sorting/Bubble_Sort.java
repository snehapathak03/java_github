package sorting;

public class Bubble_Sort {

	public static void main(String[] args) {
		// time complexity = O(n^2)
		int arr[] = {7,5,4,8,9,1,2,3,6};
		// bubble sort
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		print(arr);
		
	}
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

}
