package datastructures.Strings;
//check if string c is interleaving of string a and string b
public class Strings_Intermediate3 {
		
	static boolean isShuffle(String a,String b,String c) {
		boolean result = true;
		
		if(c.length() != a.length()+b.length()) {
			return false;
		}
		int i = 0,j=0,k=0;
		while(k!=c.length()) {
			
			if(i<a.length() &&a.charAt(i) == c.charAt(k)) {
				i++;
			}
			else if (j<b.length()&&b.charAt(j) == c.charAt(k)) {
				j++;
			}
			else {
				result =false;
			}
			k++;
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String A = "AB";
	        String B = "CD";
	        String C = "ACBDQ";
	        System.out.println(isShuffle(A, B, C));
	}

}
