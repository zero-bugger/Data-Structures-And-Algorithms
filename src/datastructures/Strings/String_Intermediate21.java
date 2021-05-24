package datastructures.Strings;

public class String_Intermediate21 {

	static int minReversal(String s) {
		
		int rev = 0;
		int countleft = 0;
		int countright = 0;
		int divide = s.length() / 2;
		
		if(s.length() % 2!=0) {
			return -1;
		}
		if(s.length() == 2 && ((s.charAt(0) == '{' && s.charAt(1) =='{') || (s.charAt(0)=='}' && s.charAt(1)=='}'))) {
			return 1;
		}
		
		for(int i =0;i<s.length();i++) {
			
			if(s.charAt(i)=='{') {
				countleft++;
			}
			else {
				countright++;
			}
		}
		
		if(countleft < countright) {
			rev+=diff(divide,countleft);
			countright+=rev;
			rev+=diff(countright,divide);		
		}
		else {
			rev+=diff(divide,countright);
			countleft+=rev;
			rev+=diff(countleft,divide);
		}
		
		return rev;
	}
	static int diff(int a , int b) {
		
		int difference = a - b;
		
		return difference;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="{{{{{{{}}}";
		System.out.println(minReversal(s));
	}

}
