package sorting;

public class Merg_Sort {
	
	public static void conquer(int a[], int si, int mid, int ei) {
		
		int merge[] = new int [ei - si + 1];
		
		int idx1 = si;
		int idx2 = mid+1;
		int x =0;
		
		while(idx1 <= mid && idx2 <=ei) {
			if(a[idx1] <= a[idx2]) {
				merge[x++] = a[idx1++];
			}else {
				merge[x++] = a[idx2++];
			}
		}
		while(idx1 <= mid) {
			merge[x++] = a[idx1++];
		}
		while(idx2 <= ei) {
			merge[x++] = a[idx2++];
		}
		
		for (int i=0 , j=si; i<merge.length; i++, j++) {
			a[j] = merge[i];
		}
	}
	public static void divide(int a[], int si, int ei) {   //si= starting index and ei= ending index.
		
		if(si>= ei) {
			return;
		}
		int mid = si +(ei - si)/2; // (si+ei)/2 is formula is also correct but program can give  space complexity issue 
		divide(a, si, mid);
		divide(a, mid+1, ei);
		conquer(a, si, mid, ei); 
		
	}

		public static void main(String[] args) {
			int a[] = {7,5,4,8,9,1,2,3,6};
			int n= a.length;
			divide(a, 0, n-1);
			//print
			for(int i=0; i<n; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println(" ");
		}

}
