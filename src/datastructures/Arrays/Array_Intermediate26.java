package datastructures.Arrays;
//Count row with maximum one's
public class Array_Intermediate26 {
	
	static int count1s(int a[][]) {
		
		int sum =0;
		int max_sum = Integer.MIN_VALUE;
		int row=0;
		for(int i=0;i<4;i++) {
			for(int j =0;j<4;j++) {							
				sum = sum + a[i][j];
				if(sum>max_sum) {
					row=i;
					max_sum = sum;
				}
			}
			sum=0;
			
		}
		return row;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 1, 1, 1 },
				{ 0, 1, 1, 1 },
				{ 0, 1, 1, 1 },
				{ 0, 0, 0, 0 } };
	
		int result =count1s(a);
		System.out.println("Index "+result);

	}

}
