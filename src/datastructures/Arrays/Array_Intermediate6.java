package datastructures.Arrays;

public class Array_Intermediate6 {
	
	
	
	static int partition(int a[] , int low,int high) {
			
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
				a[high]= temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
		static void recursandSort(int a[],int low,int high) {
			int pi = partition(a, low, high);
			if(low<pi-1) {
				recursandSort(a, low, pi-1);
			}
			if(high>pi+1) {
				recursandSort(a, pi+1, high);
			}
		
	}
		
	static void print(int a[]) {
		for(int i:a) {
			System.out.print(" "+i);
		}
	}
	public static void main(String[] args) {
		int a[] = {0,3,1,2};
		recursandSort(a, 0, a.length-1);
		print(a);

	}

}
