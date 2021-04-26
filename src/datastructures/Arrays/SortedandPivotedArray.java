package datastructures.Arrays;

public class SortedandPivotedArray {
	
	static int pivotBinarysearch(int a[],int n ,int k ) {
		int pivot = findpivot(a,0,n-1);
		if(pivot == k) {
			return pivot;
		}
		if(pivot == -1) {
			binaryS(a,0,n-1,k);
		}
		if(a[0]<= k) {
			return binaryS(a,0,pivot-1,k);
		}
		
		return binaryS(a,pivot+1,n-1,k);
	}
	
	static int findpivot(int a[],int low,int high) {
		//int pivot=0;
		int mid = (low+high)/2;
		
		if(low>high) {
			return -1;
		}
		if(high==low) {
			return low;
		}
		if(mid<high && a[mid]>a[mid+1]) {
			return mid;
		}
		if(mid>low && a[mid]<a[mid-1]) {
			return mid-1;
		}
		if(a[low]>=a[mid]) {
			return findpivot(a,low,mid-1);
		}
		return findpivot(a,mid+1,high);
		
		//return pivot;
	}
	
	static int binaryS(int a[],int low,int high,int k) {
		
		int mid = (low+high)/2;
		
		if(low>high) {
			return -1;
		}
		if(k==a[mid]) {
			return mid;
		}
		if(k>a[mid]) {
			return binaryS(a,mid+1,high,k);
		}
		return binaryS(a,low,mid-1,k);
	}
	public static void main(String[] args) {
			int a[] = {3,4,5,6,7,8,1,2};
			System.out.println("Element is at index :"+pivotBinarysearch(a,a.length,1));
	}
}
