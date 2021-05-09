package datastructures.Strings;
//Longest common subsequence
public class LCS {
		
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcdehr";
		String b = "abcgeh";
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t.length;j++) {
					t[i][j] = -1;
			}
		}
		System.out.println(longestCommonSubsequence(a, b, a.length(), b.length()));

	}

}
