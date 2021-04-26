package datastructures.Arrays;

public class Array_basic9 {
	
	static void randDiff(int a[] ,int n) {
		int max=a[0];
		int min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}

		System.out.println(max+","+min+","+(max-min));
		//return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-3,3,47,21,91};
		randDiff(a, a.length);
	}

}
