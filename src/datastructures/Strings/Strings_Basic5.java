package datastructures.Strings;
//Reverse a string
public class Strings_Basic5 {
	
	static void reverseString(String str) {
		
		char [] input = new char[str.length()];
		int j=0;
		for(int i=str.length()-1;i>=0;i--) {
			input[j++]=str.charAt(i);
		}
		
		System.out.println(new String(input));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "krunal";
			reverseString(str);
	}

}
