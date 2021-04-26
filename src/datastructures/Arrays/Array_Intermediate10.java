package datastructures.Arrays;

public class Array_Intermediate10 {

	static void firstThreelargest(int a[] , int n) {
		int m1=a[0],m2=a[0],m3=a[0];
		for(int i=0;i<n;i++) {
			if(a[i] > m1) {
				m3=m2;
				m2=m1;
				m1=a[i];
				
			}
			else if (a[i]>m2) {
				m3=m2;
				m2=a[i];
			}
			else if(a[i]>m3) {
				m3=a[i];
			}
		}
		System.out.println("Three largest elements are "+m1+" "+m2+ " "+m3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,4,3,50,23,90};
		firstThreelargest(a, a.length);

	}

}
