package datastructures.Arrays;

public class Array_Intermediate3 {
	
	static int findMissing(int a[],int size) {
		int n = a.length;
	
		int summation= size*(size+1)/2;
	
		int  sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		
		
		
		return summation-sum;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7,8,10,4};
		System.out.println(findMissing(a,10));
	}
}
