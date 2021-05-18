package datastructures.Strings;
// Number of Substring with count of each character as K
import java.util.*;

public class String_Intermediate11 {
	
	static int allsubstrings(String input , int k) {
		int count = 0;
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<=input.length();j++) {
				String s = input.substring(i,j);
				int value = countOccurence(s,k);
				count = count+value;
			}
		}
		return count;
		
	}
	static int countOccurence(String s,int k) {
		int flag =0;
		if(s.length() == 1) {
			return 0;
		}
		HashMap<Character ,Integer> map = new HashMap<>();
		for(char ch :s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Character, Integer>> ite = set.iterator();
		while(ite.hasNext()) {
			Map.Entry<Character, Integer> it = ite.next();
			if(it.getValue() % k != 0) {
				flag=1;
			}
		}
		map.clear();
		
		if(flag ==1) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="aabccc";
		int k =2;
		System.out.println(allsubstrings(input,k));
	}

}
