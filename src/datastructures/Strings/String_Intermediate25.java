package datastructures.Strings;

public class String_Intermediate25 {
	
	
	
	static int repeatedElement(String output,String input) {
		
		int n = input.length();
		char ch ='\0';
		if(output.charAt(0) == input.charAt(0)) {
				ch = output.charAt(0);
			}else {
				return repeatedElement(output+input.charAt(0), input.substring(0, 1)+input.substring(0+1,n));
			}
		
		System.out.println(ch);
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcad";
		System.out.println(repeatedElement(" ", s));

	}

}
