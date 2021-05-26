package datastructures.Strings;

import java.util.*;

public class Strings_Intermediate27 {

	static int minFlips(String s) {
		int flips = 0;
		
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		
		for(int i=1;i<s.length();i++) {
			char checker = st.peek();
			if(checker == s.charAt(i)) {
				flips++;
				if(s.charAt(i) == '0') {
					st.push('1');
				}else {
					st.push('0');
				}
			}
			else {
				st.push(s.charAt(i));
			}
		}
		
		Iterator<Character> it = st.iterator();
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		
		System.out.println();
		return Math.min(flips, s.length()-flips);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0001010111";
		System.out.println("Minimum number of flips required are "+minFlips(s));

	}

}
