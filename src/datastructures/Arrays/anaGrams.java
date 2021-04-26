package datastructures.Arrays;

import java.util.*;

public class anaGrams {
	
	
	static int findDeleteCount(String s1, String s2) {
		int count =0;
		String input = s1+s2;
		char a[] = input.toCharArray();
		char b[] = s1.toCharArray();
		char c[] = s2.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character,Integer>	m = new HashMap<>();
		for(char i : b) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
		for(char i : c) {
			if(map1.containsKey(i)) {
				map1.put(i, map1.get(i)+1);
			}
			else {
				map1.put(i,1);
			}
		}
		for(char i:a) {
			
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			else {
				m.put(i,1);
			}
		}
		System.out.println(m);
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		Set<Map.Entry<Character, Integer>> set1 = map1.entrySet();
		Set<Map.Entry<Character, Integer>> set2 = m.entrySet();
		Iterator<Map.Entry<Character,Integer>> i = set.iterator();
		Iterator<Map.Entry<Character,Integer>> i1 = set1.iterator();
		Iterator<Map.Entry<Character,Integer>> itr = set2.iterator();
		while(i.hasNext() || i1.hasNext() || itr.hasNext()) {
			Map.Entry<Character, Integer> result = i.next();
			Map.Entry<Character, Integer> result1 = i1.next();
			//Map.Entry<Character, Integer> result2 = i2.next();
			//System.out.println(result.getKey()+"->"+result.getValue());
			//System.out.println(result1.getKey()+"->"+result1.getValue());
			//System.out.println(result2.getKey()+"->"+result2.getValue());
			
		
			if(result.getKey() == result1.getKey() && result.getValue()!=result1.getValue()) {
				count = Math.abs(result1.getValue() - result.getValue());
			}
			
			
		}
		
		if(count == 0) {
			count =-1;
		}
				
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		String s2 = "cde";
		//xxxxyz //xxyz
		
		System.out.println(findDeleteCount(s1, s2));
	}

}
