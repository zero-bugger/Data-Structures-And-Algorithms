package datastructures.Strings;

import java.util.*;

public class Strings_Basic2 {

	static void getOccurence(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] input = str.toCharArray();
		for(char i : input) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				 map.put(i, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> s = map.entrySet();
		Iterator<Map.Entry<Character, Integer>> i = s.iterator();
		while(i.hasNext()) {
			Map.Entry<Character, Integer> index = i.next();
			System.out.println(index.getKey()+"=>"+index.getValue());
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IwriteCodeandloveprogramming";
		getOccurence(str);
	}

}
