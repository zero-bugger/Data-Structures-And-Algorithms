package datastructures.Arrays;

public class Array_Intermediate4 {
	
	static int countPair(int a[] , int n,int k) {
		int count = 0;
		int diff = 0;
			for(int i =0 ;i<n;i++) {
				diff=k-a[i];
				
				if(diff>0) {
					int j=i+1;
					
					while(j<n) {
						if(a[j]==diff ) {
							
							count++;
							
						}
						j++;
					}
				}
			}
		
		
		return count;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 1};
		System.out.println("Pair "+countPair(arr, arr.length, 2));
	}
}
