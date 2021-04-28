package datastructures.Arrays;

public class Array_Intermediate20 {
	 static int maxProfit(int price[], int n,int k)
	    {
	      int profits[][] = new int [k+1] [n];
	      for(int t=0;t<k+1;t++) {
	    	  for(int d=0;d<n;d++) {
	    		  profits[t][d]=0;
	    	  }
	      }
	
	      for(int t=1;t<k+1;t++) {
	    	  int  maxThusfar = Integer.MIN_VALUE;
	    	  for(int d=1;d<n;d++) {
	    		  maxThusfar = Math.max(maxThusfar, profits[t-1][d-1] - price[d-1]);
	    		  profits[t][d]=Math.max(profits[t][d-1], maxThusfar+price[d]);
	    	  }
	      }
	      
	  
	      return profits[k][n-1];
	      
	    }
	 
	public static void main(String[] args) {
		
		 int price[] = { 2, 30, 15, 10, 8, 25, 80 };
	        int n = price.length;
	        System.out.println("\nMaximum Profit = "
	                           + maxProfit(price, n,2));

	}

}
