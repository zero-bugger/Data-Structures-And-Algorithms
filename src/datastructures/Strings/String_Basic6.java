package datastructures.Strings;

import java.util.*;

public class String_Basic6 {
	
	static boolean checkAnagrams(String s1,String s2) {
		
		boolean result =false;
		int flag =0;
		if(s1.length() != s2.length()) {
			return result;
		}
		
		HashMap<Character,Integer> map = new HashMap<>();
		String input = s1 + s2;
		char [] c = input.toCharArray();
		for(char i : c) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
				
			}
			else{
				map.put(i,1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> s = map.entrySet();
		Iterator<Map.Entry<Character, Integer>> i = s.iterator();
		while(i.hasNext()) {
			
			Map.Entry<Character, Integer> index = i.next();
			if(index.getValue() %2 !=0) {
				flag =1;
			}
			System.out.println(index.getKey()+"->"+index.getValue());
		}
		if(flag == 0) {
			result = true;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "xxxxyz";
		String s2 = "xxyz";
		//xxxxyz xxyz
		System.out.println(checkAnagrams(s1, s2));

	}

}
