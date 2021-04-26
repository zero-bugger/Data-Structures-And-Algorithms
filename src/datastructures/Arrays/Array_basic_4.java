package datastructures.Arrays;

public class Array_basic_4 {

	static void reverseArr(int a[],int n) {
		int b[] = new int [a.length];
		int start = 0;
		for(int i=n-1;i>=0;i--) {
			b[start]=a[i];
			start++;
		}
		
		for(int i:b) {
			System.out.print(+i+",");
		}
		
	}
	public static void main(String[] args) {
		int a[] = {1,2,34,5,67,8};
		reverseArr(a, a.length);

	}

}
