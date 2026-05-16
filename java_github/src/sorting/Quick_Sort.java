package sorting;

public class Quick_Sort {
	
	public static int partition(int ar[], int low, int high) {
		int pivot = ar[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(ar[j] < pivot) {
				i++;
				//swap
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		i++;
		int temp = ar[i];
		ar[i] = pivot;
		ar[high] = temp;
		return i; // i is pivot index	
	}
	
	public static void quickSort(int ar[], int low, int high) {
		
		if(low < high) {
			int pidx = partition(ar, low, high);
			
			quickSort(ar, low, pidx-1);
			quickSort(ar, pidx+1, high);
		}
		
	}

	public static void main(String[] args) {
		int ar[] = {7,5,4,8,9,1,2,3,6};
		int n= ar.length;
		
		quickSort(ar, 0, n-1);
		//print
		for(int i=0; i<n; i++) {
			System.out.print(ar[i]+ " ");
		}
		System.out.println();
		

	}

}
