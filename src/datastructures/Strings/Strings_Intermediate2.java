package datastructures.Strings;

import java.util.*;
//Remove duplicate in string
public class Strings_Intermediate2 {
	
	static void removeDuplicate(String s) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		Iterator<Character> i1 = set.iterator();
		while(i1.hasNext()) {
			System.out.print(" "+i1.next());
		}
		
	 }	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "helloworld";
			removeDuplicate(s);
	}

}
