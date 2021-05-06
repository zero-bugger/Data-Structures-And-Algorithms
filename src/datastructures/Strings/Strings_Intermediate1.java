package datastructures.Strings;

public class Strings_Intermediate1 {
	
	
	static boolean isRotatedString(String s1, String s2) {
		
		boolean result = false;
		
		String s = s1+s1;
		
		if(s1.length() != s2.length()) {
			return result;
		}
		
		if(s.indexOf(s2) != -1) {
			System.out.println(s.indexOf(s2));
			result =true;
		}
					
		return result;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCD";
		String s2 = "CDAB";
		System.out.println(isRotatedString(s1, s2));

	}

}
