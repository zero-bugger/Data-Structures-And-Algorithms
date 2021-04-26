package datastructures.Arrays;

public class Arrays_Intermediate12 {
		
	
	static boolean sumIsZero(int a[],int n) {
		int k=2;
		int sum=0;
						
		while(k<a.length) {
			
			for(int i=0;i<k;i++) {
				if(a[i]==0) return true;
				sum+=a[i];
			}
			int ws=sum;
			int size=k;
			for(int i=size;i<n;i++) {
				ws+=a[i]-a[i-size];
				if(ws == 0 || a[i] == 0) return true;
			}
			k++;
			sum=0;
		}
		return false;
	}
	public static void main(String[] args) {
		int a[] = { -3, 2, 3, 1, 0 };
		boolean result = sumIsZero(a, a.length);
		if(result) {
			System.out.println(result);
		}else {
			System.out.println("No subarray with sum 0");
		}
				
		
	}
}
