package datastructures.Strings;

public class String_Intermediate12 {
	
	static int r[][] = new int [20][20];
	static int longestCommonSubsequence(String a,String b,int m,int n) {
		
		if(m==0 || n == 0) {
			return 0;
		}
		
		if(a.charAt(m-1) == b.charAt(n-1)) {
			return 1 + longestCommonSubsequence(a, b, m-1, n-1);
		}
		else {
			return Math.max(longestCommonSubsequence(a, b, m, n-1), longestCommonSubsequence(a, b, m-1, n));
		}
		
		
	}
	
	static int memoizedLCS(String a,String b, int m,int n) {
		
		if(m ==0 || n == 0) return 0;
		if(r[m][n] != -1) {
			return r[m][n];
		}
		
		if(a.charAt(m-1) == b.charAt(n-1)) {
			return	r[m][n] =  1 + memoizedLCS(a, b, m-1, n-1);
		}
		else {
			return r[m][n] = Math.max(memoizedLCS(a, b, m, n-1), memoizedLCS(a, b, m-1, n));
		}
	}
	
	static int DPLCS(String a,String b,int m, int n) {
		int t[][] = new int [m+1][n+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				if(i == 0 || j == 0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i=1;i<m+1;i++) {
			for(int j =1;j<n+1;j++) {
				
				if(a.charAt(i-1) ==b.charAt(j-1)) {
					t[i][j] = 1 + t[i-1][j-1];
				}
				else {
					t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
				}
			}
		}
		return t[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = "ABC";
			String b = "AC";
			for(int i=0;i<r.length;i++) {
				for(int j=0;j<r.length;j++) {
					r[i][j] = -1;
				}
			}
			System.out.println(DPLCS(a, b, a.length(), b.length()));
	}

}
