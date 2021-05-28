package datastructures.Arrays;

public class TrappingWater {

	
	static int trappedWater(int a[]) {
		int sum =0;
		int[] mxl = new int [a.length];
		int[] mxr = new int [a.length];
		int[] water = new int[a.length]; 
		
		mxl[0] = a[0];
		mxr[a.length-1] = a[a.length-1];
		
		for(int i=1;i<a.length;i++) {
			mxl[i] = Math.max(mxl[i-1], a[i]);
		}
		for(int i=a.length-2;i>=0;i--) {
			mxr[i] = Math.max(mxr[i+1], a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			water[i] = Math.min(mxl[i], mxr[i]) - a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			sum+=water[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,0,0,2,0,4};
		System.out.println(trappedWater(arr));

	}

}
