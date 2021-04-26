package datastructures.Arrays;



public class Array_Intermediate8 {
	
	static void firstRecurring(int a[] , int n) {
		int flag=0;
		//System.out.println(j);
		for(int i=0;i<n;i++) {;
			for(int j=n; j>i;j--) {
				if(a[i]==a[j]) {
					flag=1;
					System.out.println(a[i]);
					
				}
				
			}
			if(flag ==1) {
				break;
			}
		}
		 
	}
	public static void main(String[] args) {
		
		int a[] = {1,4,2,3,5,4};
		//System.out.println(a.length);
		firstRecurring(a, a.length-1);
	}
	

}
