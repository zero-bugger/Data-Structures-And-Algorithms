package datastructures.Arrays;

public class Array_basic_2 {

	static boolean findelement(int a[], int k, int n) {
			
		for(int i=0;i<n-1;i++) {
			
			if(a[i]==k) {
				return true;
			}
			
		}
		return false;
				
		
	}
	public static void main(String[] args) {
		int a [] = {1,23,4,5,6,7,78};
		boolean value = findelement(a,5, a.length);
		System.out.println(value);
	}
}
