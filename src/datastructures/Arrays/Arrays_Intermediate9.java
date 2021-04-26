package datastructures.Arrays;

import java.util.*;

public class Arrays_Intermediate9 {
	
	static int firstNonRecurrint(int a[] , int n) {
		int flag=0;
		int first=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i],1);
			}
		}
		Set<Map.Entry<Integer, Integer>> s = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> i = s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, Integer> m = i.next();
			if(m.getValue() == 1) {
				flag=1;
				first =m.getKey();
				break;
			}
		}
		if(flag == 0) {
			first =-1;
		}
		return first;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9 ,4 ,9 ,6 ,7 ,6};
		
		System.out.println(firstNonRecurrint(a, a.length));
		
	}

}
