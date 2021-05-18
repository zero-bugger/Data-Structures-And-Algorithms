package datastructures.Strings;
//number of substrings with count each character as k
import java.util.*;

public class String_Intermediate11 {
	
	static void allsubstrings(String input) {
		int count = 0;
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<=input.length();j++) {
				String s = input.substring(i,j);
				System.out.println(s);
				int value = countOccurence(s);
				count = count+value;
				System.out.println(value);
			}
		}
		System.out.println(count);
		
	}
	static int countOccurence(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		int sum=0;
		int flag =0;
		for(Character ch : s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Character, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> v = it.next();
			sum = sum+v.getValue();
			
		}
		if(sum% 2 == 0) {
			flag=1;
		}
			map.clear();
			if(flag == 1) {
				return 1;
			}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="aabbcc";
		allsubstrings(input);
	}

}
