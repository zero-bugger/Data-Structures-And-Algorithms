package datastructures.Arrays;

public class Array_Intermediate22 {
	static int jump(int a[],int n) {
		
		int l= a[0];
		int s = a[0];
		int jump=1;
		for(int i=1;i<n;i++) {		
			if(l==n-1) {
				return jump;
			}
			if(i+a[i] > l) {
				l=i+a[i];
			}
			s--;
			if(s==0) {
				jump++;
				s=l-i;
			}
		
		}
		return jump;
	}
	public static void main(String[] args) {
		int a[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(jump(a, a.length));

	}

}
