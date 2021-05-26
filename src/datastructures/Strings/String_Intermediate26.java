package datastructures.Strings;


public class String_Intermediate26 {
	
	static void printallPalindrome(String a,String b,int m,int n) {
			
		int t[][] = new int[m+1][n+1];
		StringBuilder sb = new StringBuilder();
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<m+1;i++) {
			for(int j = 0;j<n+1;j++) {
				if(i == 0 || j == 0) {
					t[i][j] =0;
				}
			}
		}
		
		for(int i = 1;i<m+1;i++) {
			for(int j = 1;j<n+1;j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					t[i][j] = 1 + t[i-1][j-1];
				}
				else {
					t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
				}
			}
		}
		while(m>0 && n >0) {
			
			if(a.charAt(m-1) == b.charAt(n-1)) {
				sb.append(a.charAt(m-1));
				System.out.println(sb.toString());			
				m--;
				n--;
			}
			else {
				System.out.println(s.toString());	
				if(t[m][n-1] > t[m-1][n]) {
					s.append(b.charAt(n-1));
					System.out.println(s.toString());
					n--;
					
				}
				else {
					s.append(a.charAt(m-1));
					System.out.println(s.toString());
					m--;
				
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a =  "aabaab";
		StringBuilder sb = new StringBuilder(a);
		sb.reverse();
		String b = sb.toString();
		printallPalindrome(a, b, a.length(), b.length());
		
	}

}
