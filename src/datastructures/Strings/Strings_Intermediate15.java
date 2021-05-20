package datastructures.Strings;

public class Strings_Intermediate15 {	
	
	
	
	static int minInsertionDeletion(String a,String b,int m,int n) {
		int r[ ][] = new int [m+1][n+1];
		
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
		
		int LCS = r[m][n];
		int result = (m-LCS) + (n-LCS);
		return result;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "heap";
		String b = "pea";
		System.out.println(minInsertionDeletion(a, b, a.length(), b.length()));
	}

}
