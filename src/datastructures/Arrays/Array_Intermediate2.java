package datastructures.Arrays;

public class Array_Intermediate2 {
	
	static void rotateArr(int a[],int n) {
		int temp =a[n-1];
		for(int i=n-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0] = temp;
		
		for(int i:a) {
			System.out.print(" "+i);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		rotateArr(a, a.length);
	}
}
