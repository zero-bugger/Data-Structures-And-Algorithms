package datastructures.Arrays;



public class Array_basic8 {

	static void countDigits(int a[] , int n) {
		 int zero=0;
		 int one=0;
		 int two=0;
		 int b[] = new int [n];
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				zero++;
			}
			else if(a[i]==1) {
				one++;
			}
			else {
				two++;
			}
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		for(int i=0;i<zero;i++) {
			b[i]=0;
		}
		for(int i=zero;i<zero+one;i++)
		{
			b[i]=1;
		}
		for(int i=zero+one;i<n;i++)
		{
			b[i]=2;
		}
		for(int i:b) {
			System.out.print(i+",");
		}
	}
	
//	static void printArr(int a[],int n) {
//		
//		
//	}
	public static void main(String[] args) {

		int a[]  = {1,0,1,0,1,0,2,0,1,2,2,2,0};
		countDigits(a, a.length);

	}
	
}
