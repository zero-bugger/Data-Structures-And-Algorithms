package datastructures.Arrays;

public class Array_Intermediate15 {

	static int maxProd(int a[] , int n) {
		int prod=1;
		int startindex=0;
		if(a[0]==0) {
			startindex=1;
		}
			for(int i=startindex;i<n;i++) {
				
				if(a[i]!= 0 || (a[i]<0 &&(a[i+1]<0 || a[i+1]==0))) {
					prod = prod * a[i];
				}
				else {
					 break;
				}
			}
		
		return Math.abs(prod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,4,5,-1,0};
		System.out.println(maxProd(a, a.length));

	}

}
