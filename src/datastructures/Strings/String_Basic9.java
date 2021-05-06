package datastructures.Strings;
//reverse word in string
import java.util.Stack;

public class String_Basic9 {
	
	static void reverseWord(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				st.push(s.charAt(i));
			}
			else {
				while(st.empty() == false) {
					System.out.print(st.pop());
				}
			}
		}
		System.out.print(" ");
		while(st.empty()==false) {
			System.out.print(st.pop());
		}
	}
	public static void main(String[] args) {
		String s = "Hello World";
		reverseWord(s);
	}

}
