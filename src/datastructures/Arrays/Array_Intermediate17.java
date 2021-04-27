package datastructures.Arrays;

public class Array_Intermediate17 {
	
	
	static int minArrRotated(int a[],int low,int high) {
	
		if(low>high) {
			return a[0];
		}
		if(high == low) return a[low];
		
		int mid = (low+high)/2;
		
		//System.out.println(mid);
		
		if(mid <high && a[mid] > a[mid+1]) {
			return a[mid+1];
		}
		if(mid >low && a[mid] < a[mid-1]) {
			return a[mid];
		}
		if(a[high]>a[mid]) return minArrRotated(a,low,mid-1);
		
		return minArrRotated(a, mid+1, high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50, 5, 9};
		
		System.out.println(minArrRotated(arr,0, arr.length-1));

	}

}
