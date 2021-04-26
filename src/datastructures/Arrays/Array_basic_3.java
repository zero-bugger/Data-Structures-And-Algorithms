package datastructures.Arrays;

public class Array_basic_3 {

	
	static int max(int a[],int n) {
		int max=a[0];
	
		for(int i=0;i<n-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	

	static int min(int a[],int n) {
		int min=a[0];
	
		for(int i=0;i<n-1;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,5,12,7,8,9};
		System.out.println("Min "+min(a, a.length));
		System.out.println("Max "+max(a,a.length));
		
	}

}
