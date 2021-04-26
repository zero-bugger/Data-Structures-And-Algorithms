package datastructures.Arrays;

public class Array_Intermediate13 {
	
	
	static int maxSumSubArr(int a[],int n) {
		int k=2;
		int sum=0,total_sum=0;
		int max=0;
		for(int i=0;i<n;i++) {
			total_sum+=a[i];
		}
		while(k<n) {
			for(int i=0;i<k;i++) {
				sum+=a[i];
			}
			int ws=sum;
			int size=k;
			for(int i=size;i<n;i++) {
				ws+=a[i]-a[i-size];
				if(ws>max) {
					max=ws;
				}
			}
			k++;
			sum=0;
		}
		if(max>total_sum) {
			return max;
		}
		return total_sum;
	}
	static int kadaneAlgo(int a[],int n) {
		int max_so_far = Integer.MIN_VALUE , max_ending_here=0;
		System.out.println(Integer.MIN_VALUE);
		for(int i=0;i<n;i++) {
			max_ending_here = max_ending_here+a[i];
			if(max_ending_here>max_so_far) {
				max_so_far=max_ending_here;
			}
			if(max_ending_here<0) {
				max_ending_here=0;
			}
		}
		return max_so_far;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[] = {6, -3, -10, 0, 2};
			
			int result = kadaneAlgo(a, a.length);
			System.out.println(result);
//			if(result ==0) {
//				int max=a[0];
//				for(int i=0;i<a.length;i++) {
//					if(a[i]>max) max=a[i];
//				}
//				System.out.println(max);
//			}
//			else {
//				System.out.println(result);
//			}
	}

}
