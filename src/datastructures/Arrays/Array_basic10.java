package datastructures.Arrays;

public class Array_basic10 {
	
	static int partitionArr(int a[],int low,int high) {
		
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
	
	static void sortArr(int a[],int low, int high) {
		int pi = partitionArr(a, low, high);
		
		if(low<pi-1) {
			sortArr(a,low,pi-1); 
		}
		if(high>pi+1) {
			sortArr(a,pi+1,high);
		}
		
		}
	public static void main(String[] args) {
		int a[] = {-1,3,3,4,-2,21,91};
		sortArr(a, 0, a.length-1);
		for(int i:a) {
			System.out.print(" "+i);
		}

	}

}
