package datastructures.Arrays;

public class Array_basic5 {
	
	
	static int partition(int a[],int low,int high) {
		int pivot = a[(low+high)/2];
		while(low<=high) {
			while(a[low]<pivot) {
				low++;
			}
			while(a[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
	static void recursionandPrintarr(int a[],int low,int high) {
		int pivot = partition(a, low, high);
		if(low<pivot-1) {
			recursionandPrintarr(a, low, pivot-1);
		}
		if(high>pivot+1) {
			recursionandPrintarr(a, pivot+1, high);
		}
		
	}
	
	static void printArr(int a[]) {
		for(int i:a) {
			System.out.print(i+",");
		}
	}
	public static void main(String[] args) {

		int a [] = {1,-121213,121,1,3435,67889,31};
		recursionandPrintarr(a, 0, a.length-1);
		printArr(a);

	}

}
