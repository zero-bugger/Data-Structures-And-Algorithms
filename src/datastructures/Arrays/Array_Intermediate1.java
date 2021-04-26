package datastructures.Arrays;

public class Array_Intermediate1 {
	
	
	static void arrUnion(int a[] , int b[],int m,int n) {
		int i=0,j=0;
		
		while(i<n&&j<m) {
				if(a[i]<b[j]) {
					System.out.print(a[i]+" ");
					i++;
				}else if(a[i]>b[j]) {
					System.out.print(b[j]+" ");
					j++;
				}else {
					System.out.print(b[j]+" ");
					i++;
					j++;
				}
		}
		
		while(i<m) {
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<n) {
			System.out.print(b[j]+" ");
			j++;
		}
	}
	
	
	static void intersArr(int a[],int b[], int m,int n) {
		int i=0,j=0;
		
		while(i<m && j<n) {
			if(a[i]<b[j]) {
				i++;
			}
			else if(a[i]>b[j]) {
				j++;
			}
			else {
				System.out.print(b[j]+" " );
				i++;
				j++;
			}
		}
		
	}
	public static void main(String[] args) {
		    int arr1[] = { 3,2,2,6,4};
	        int arr2[] = { 3,2,8,2 };
	        int m = arr1.length;
	        int n = arr2.length;
	      //  arrUnion(arr1, arr2, m, n);
	        System.out.println();
	        intersArr(arr1, arr2, m, n);
	}

}
