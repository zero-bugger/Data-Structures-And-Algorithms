package datastructures.Strings;
//Longest common subsequence
public class LCS {
		//Longest Common Subsequence
	
	static int t[][] = new int [100][100];
	
	static int longestCommonSubsequence(String a,String b,int m, int n) {
		
		if(m == 0 || n == 0) return 0;
		
		if(t[m][n] != -1) {
			return t[m][n];
		}
		
		if( a.charAt(m-1) == b.charAt(n-1) ) {
			t[m][n]= 1+ longestCommonSubsequence(a, b, m-1, n-1);
			return 1+ longestCommonSubsequence(a, b, m-1, n-1);
		}
		else {
			t[m][n]=Math.max(longestCommonSubsequence(a, b, m, n-1),longestCommonSubsequence(a, b, m-1, n));
			return Math.max(longestCommonSubsequence(a, b, m, n-1),longestCommonSubsequence(a, b, m-1, n));
		}
		
		
	}

	static int longestCommonSubseqDP(String a, String b , int m, int n) {
		
		int [][] r = new int [m+1][n+1];
		
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				if( i == 0 || j == 0) {
					r[i][j] = 0;
				}
			}
			
		}
		
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					r[i][j] = 1 + r[i-1][j-1];
				}
				else {
					r[i][j] = Math.max(r[i][j-1], r[i-1][j]);
				}
			}
		}
		
				return r[m][n];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcdehr";
		String b = "abcgeh";
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t.length;j++) {
					t[i][j] = -1;
			}
		}
		System.out.println(longestCommonSubseqDP(a, b, a.length(), b.length()));

	}

}
