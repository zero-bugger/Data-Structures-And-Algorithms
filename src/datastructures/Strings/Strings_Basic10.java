package datastructures.Strings;
//Check if palindrome
 
public class Strings_Basic10 {
	
	static boolean isPalindrome(String s) {	
		
		boolean result = false;
		StringBuilder sb = new StringBuilder(s);
		String toCompare = sb.reverse().toString();
		if(s.equals(toCompare)) {
			result = true;
		}

		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aibohphobia";
		System.out.println(isPalindrome(s));
				

	}

}
