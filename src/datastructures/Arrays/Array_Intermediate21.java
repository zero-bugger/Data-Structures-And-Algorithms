package datastructures.Arrays;

import java.util.Arrays;

public class Array_Intermediate21 {
	
	static int minDiff(int a[] ,int n, int k) {
	
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
		}
		
		return (max-k)-(min+k);
	}
	static int minDiff2(int a[],int n,int k){
		int diff=0;
		
		for(int i=0;i<n;i++) {
			if(a[i]<k) {
				a[i]+=k;
			}
			else if(a[i]>k) {
				a[i]-=k;
				
			}else {
				a[i]+=k;
			}
		}
		Arrays.sort(a);
		diff=a[n-1] - a[0];
		return diff;
	}
	public static void main(String[] args) {
		int Arr[] = {1, 10, 14, 14, 14, 15};
		
		System.out.println(minDiff2(Arr, Arr.length	, 6));
	}
}
