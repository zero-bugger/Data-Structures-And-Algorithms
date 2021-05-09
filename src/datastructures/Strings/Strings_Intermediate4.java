package datastructures.Strings;
//Longest palindrome substring
public class Strings_Intermediate4 {
	
	static void printLongestSubstring(String s) {
		
		int n = s.length();
		boolean [][] result = new boolean[n][n];
		int start =0;
		int maxlength = 1;
		
		for(int i=0;i<n;i++) {
			result[i][i] = true;
		}
		
		for(int i=0;i<n-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				result[i][i+1] = true;
				maxlength = 2;
				start =i;
			}
		}
		
		
		for(int i=3;i<=n;++i) {
			for(int j = 0 ;j < n-i+1 ; ++j) {
				int k = j+i -1;				
				if(s.charAt(j) == s.charAt(k) && result[j+1][k-1]) {
					result[j][k] = true;
					if(i>maxlength) {
						maxlength = i;
						start = j;
					}
				}
			}
		}
		
		System.out.println(s.substring(start, start+maxlength-1+1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "forgeeksskeegfor";
	        printLongestSubstring(str);
	}

}
