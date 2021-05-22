package datastructures.Strings;

import java.util.Stack;

public class Strings_Intermediate19 {

	static boolean checkParanthesis(String s) {
		
		boolean result  =true;
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) =='(' || s.charAt(i) == '{' || s.charAt(i)=='[') {
				
				st.push(s.charAt(i));
			}
			else if (s.charAt(i) == ')' && st.pop() != '(' ) {
			    
				result = false;
						
			}
			else if (s.charAt(i) == ']' && st.pop() != '[' ) {
			    
				result = false;
						
			}
			else if (s.charAt(i) == '}' && st.pop() != '{' ) {
			    
				result = false;			
		    		
			}

		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()";
		System.out.println(checkParanthesis(s));
	}

}
