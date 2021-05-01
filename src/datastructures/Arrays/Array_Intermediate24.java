package datastructures.Arrays;

import java.util.*;

public class Array_Intermediate24 {
	
	
	static void printTrip(int a[],int n,int k) {
		HashSet<Integer> map = new HashSet<Integer>();
		
		for(int i=0;i<n-2;i++) {
			
			int diff= k-a[i];
			for(int j=i+1;j<n;j++) {
				int diff2=diff-a[j];
				if(map.contains(diff2)) {
					System.out.println("Triplets are "+ a[i] + " " + a[j] + " "+diff2);
				}
				map.add(a[j]);
			}
			
		}
	}
	
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
				int temp = a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
			
			
		}
		return low;
	}
	
	static void recurringQuick(int a[],int low,int high) {
		int pivot = partitionArr(a,low,high);
		
		if(low<pivot-1) {
			recurringQuick(a, low, pivot-1);
		}
		if(high>pivot+1) {
			recurringQuick(a, pivot+1, high);
		}
			
		
	}
	
	static void printArr(int a[]) {
		for(int i:a) {
			System.out.print(" "+i);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 4, 45, 6, 10 ,8};
		recurringQuick(a,0,a.length-1);
		printArr(a);
		System.out.println();
		printTrip(a, a.length, 13);
	}

}
