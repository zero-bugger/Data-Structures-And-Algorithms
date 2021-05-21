package datastructures.Strings;

//Conversion of input string 
// 1 . From Prefix to Infix
// 2 . From PostFix to Infix

import java.util.Stack;

public class String_Intermediate17 {

	static void prefixToInfix(String s) {
		
		
		Stack<String> st = new Stack<>();
		
		for(int i = s.length()-1 ; i >=0 ;i--) {
			
			if(s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '/' || s.charAt(i) == '%' 
					|| s.charAt(i) == '^') {
				String operand1 = st.pop();
				String operand2 = st.pop();
				
				String expression = "(" + operand1 + s.charAt(i) + operand2 +")";
				
				st.push(expression);
				
				
			}
			
			else {

				st.push(s.charAt(i)+"");
			}
			
		}
		
		
		
		System.out.println(st.pop());
		
	}
	static void postfixToInfix(String s) {
			
			
			Stack<String> st = new Stack<>();
			
			for(int i = 0 ; i <s.length() ;i++) {
				
				if(s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '/' || s.charAt(i) == '%' 
						|| s.charAt(i) == '^') {
					String operand1 = st.pop();
					String operand2 = st.pop();
					
					String expression = "(" + operand2 + s.charAt(i) + operand1 +")";
					st.push(expression);
					
					
				}
				
				else {
	
					st.push(s.charAt(i)+"");
				}
				
			}
			
    		System.out.println(st.pop());
			
		}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PostFix start loop from left to right and expression is B operator A
		//PreFix start loop from right to left and expression is A operator B
		prefixToInfix("*+ab/ef");
		postfixToInfix("abef*+");
		
	}

}
