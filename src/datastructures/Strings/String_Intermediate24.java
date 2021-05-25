package datastructures.Strings;

import java.util.*;

public class String_Intermediate24 {
	
	static void repeatedWord(String s[]) {
		
		HashMap<String,Integer> mp = new HashMap<>();
		
		for(int i=0;i<s.length;i++) {
			if(mp.containsKey(s[i])) {
				mp.put(s[i],mp.get(s[i])+1);
			}
			else {
				mp.put(s[i], 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> set = mp.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> v = it.next();
			if(v.getValue() == 2) {
				System.out.println(v.getKey());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
		repeatedWord(arr);
	}

}
