package datastructures.Arrays;

public class Array_Intermediate17 {
	
	
	static int minArrRotated(int a[],int n) {
		int min=0;
		
		for(int i=0;i<n;i++) {
			if(a[i]<a[n-1-i]) {
				System.out.println(a[i]);
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50, 5, 7};
		
		System.out.println(minArrRotated(arr, arr.length));

	}

}
