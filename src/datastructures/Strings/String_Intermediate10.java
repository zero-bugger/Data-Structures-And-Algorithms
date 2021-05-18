package datastructures.Strings;
//Finding minimum window that contains all characters all string itself
import java.util.*;

public class String_Intermediate10 {
	
	static int findMinWindow(String s,String t) {
		int i=0;
		int j=0;
		int count=0;
		int ans =0;
		HashMap<Character,Integer> map = new HashMap<>();
		for(Character ch : t.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		count =map.size();
		System.out.println(count);
		while( j <s.length() && i < s.length()) {
			char chk = s.charAt(j);
			if(map.containsKey(chk)) {
				map.replace(chk, map.get(chk)-1);
				if(map.containsValue(0)) {
					count --;
				}
				//System.out.println(count);
			}
			
			if( count == 0) {
				
				ans=j - i ;
				while(count == 0) {
					char chki = s.charAt(i);
					if(map.containsKey(chki)) {
						map.replace(chki, map.get(chki)+1);
					}
					i++;
					if(map.containsValue(1)) {
						count++;
						
					}
					
				}
			}
			
			j++;
		}
		return ans;			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AABBBCBBAC";
		HashSet<Character> set = new HashSet<>();
		for(char ch:s.toCharArray()) {
			set.add(ch);
		}
		StringBuffer sb = new StringBuffer();
		Iterator<Character> i = set.iterator();
        while (i.hasNext())
          sb.append(i.next());
    	findMinWindow(s, sb.toString());
	}

}
