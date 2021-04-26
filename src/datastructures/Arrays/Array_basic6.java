package datastructures.Arrays;

public class Array_basic6 {
	
	static void kthlargest(int a[] ,int n,int k) {
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("kth Largest Element is "+a[i]);
				break;
			}
		}
		
	}
	
	static void kthsmallest (int a[],int n,int k) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("kth Smallest element is "+a[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,4,9,33,12};
		kthlargest(a, a.length, 4);
		kthsmallest(a, a.length, 4);
	}
}
