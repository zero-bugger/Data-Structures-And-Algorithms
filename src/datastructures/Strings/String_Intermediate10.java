package datastructures.Strings;

import java.util.*;

public class String_Intermediate10 {
	
	static int findMinWindow(String s) {
		
		HashSet<Character> set = new HashSet<>();
		HashMap<Character,Integer> map = new HashMap<>();
		int i=0,j=0;
		String str = "";
		for(int k = 0;k<s.length();k++) {
			set.add(s.charAt(k));
		}
		int count = set.size();
		System.out.println(count);
		str = str+set.toString();
		for(Character ch :str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
	
		while(j < s.length()) {
			if(map.containsKey(s.charAt(j))) {	
				map.replace(s.charAt(j), map.get(s.charAt(j))-1);
				
				int elementcount = map.get(s.charAt(j));
				System.out.println(elementcount);
				if(elementcount == 0) {
					count--;
					System.out.println("Count"+count);
				}
			
			}
			
			if(count == 0 ) {
				while(i< j && count ==0) {
					if(map.containsKey(s.charAt(i))) {
						map.replace(s.charAt(i), map.get(s.charAt(i))+1);	
						int elementcount = map.get(s.charAt(j));
						if(elementcount > 0) {
							count++;
						}
					}
					i++;
				}
			}
			j++;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AABBBCBBAC";
		System.out.println(findMinWindow(s));
	}

}
