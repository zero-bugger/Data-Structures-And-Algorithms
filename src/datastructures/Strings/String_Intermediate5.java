package datastructures.Strings;
//Longest repeating substring

public class String_Intermediate5 {
	
	static int r [] [] = new int [100][100];
	static int longestrepSub(String a,String b,int m,int n) {
		
		
		if(m  == 0 || n == 0) {
			return 0;
		}
		
		if(a.charAt(m-1) == b.charAt(n-1) && m!=n) {
			
			return 1+ longestrepSub(a,b,m-1,n-1);
		}
		else {
			return Math.max(longestrepSub(a, b, m, n-1), longestrepSub(a, b, m-1, n));
		}
		
		
		
	}

	static int longrecurringsubmemo(String a,String b,int m,int n) {
		
		if( m == 0 || n == 0) {
			return 0;
		}
		
		if(r[m][n] != -1) {
			return r[m][n];
		}
		
		if(a.charAt(m-1) == b.charAt(n-1) && m != n) {
		    r[m][n] = 1+ longrecurringsubmemo(a, b, m-1, n-1);
			return longrecurringsubmemo(a, b, m-1, n-1);
		}
		else {
			
			r[m][n] = Math.max(longrecurringsubmemo(a, b, m, n-1), longrecurringsubmemo(a, b, m-1, n));
			return Math.max(longrecurringsubmemo(a, b, m, n-1), longrecurringsubmemo(a, b, m-1, n));
		}
		
	}
	
	static int longestRepeatSubDP(String a,String b, int m, int n) {
		
		int t[][] = new int [m+1][n+1];
		
		for(int i =0;i< m+1;i++) {
			for(int j=0;j< n+1 ; j++) {
				if( i == 0 || j== 0) {
					t[i][j] = 0;
				}
			}
		}
		
		for(int i=1 ; i< m+1;i++) {
			for(int j=1;j<n+1;j++) {
				
				if(a.charAt(i-1) == b.charAt(j-1) && i!=j) {
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
		String s ="aab";
		String t = "aab";
		int m = s.length();
		int n = t.length();
		for(int i=0;i<r.length;i++) {
			for(int j=0;j<r.length;j++) {
				r[i][j]=-1;
			}
		}
		int result = longestRepeatSubDP(s,t,m,n);
		System.out.println(result);
	}

}
