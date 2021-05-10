package datastructures.Strings;
//Longest Common substring using Dynamic programming
public class LongestCommonSubstring {

	static int DPLCS (String a, String b, int m , int n) {
		int t [] [] = new int [ m+1][n+1];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				if( i == 0 || j == 0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i = 1 ;i < m+1;i++) {
			for(int j = 1; j<n+1 ; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					t[i][j] = 1 + t[i-1][j-1];
				}
				else {
					t[i][j] =0;
				}
			}
		}
		for(int i=0;i<m+1;i++) {
		for(int j=0;j<n+1;j++) {
			if(t[i][j]>max) {
				max = t[i][j];
			}
		}
	}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = "abcde";
			String b = "abfce";
			System.out.println(DPLCS(a, b, a.length(), b.length()));
	}

}
