package datastructures.Strings;

<<<<<<< HEAD
=======
//Seperate 0's and 1's and find the substring 
>>>>>>> 88a3f17dc5c09a3cb07eee919748a58e0134e053
public class String_Intermediate8 {
	
	static int countSubstring(String s) {
		int result = 0;
		int countzero = 0;
		int countone =0;
		for(int i = 0 ;i<s.length();i++) {
			if(s.charAt(i) == '0'){
				countzero ++;
			}
			else {
				countone++;
			}
			if(countzero == countone) {
				result++;
			}
		}
		
	
		return result;	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0100110101";
		System.out.println(countSubstring(s));
	}

}
