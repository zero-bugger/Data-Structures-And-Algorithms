package datastructures.Arrays;

import java.util.*;

public class Array_Intermediate29 {
	
	static boolean ifSubset(int a[] ,int b[]) {
		boolean result = false;
		int flag=0;
		int count =0;
		if(a.length>b.length) {
			flag=1;
			count = b.length;
		}else {
			flag=0;
			count = a.length;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i< a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		for(int i=0;i<b.length;i++) {
			if(map.containsKey(b[i])) {
				map.put(b[i], map.get(b[i])+1);
			}else{
				map.put(b[i], 1);
			}
		}
		Set<Map.Entry<Integer,Integer>> s = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> i = s.iterator();
		while(i.hasNext()) {
			
			Map.Entry<Integer, Integer> index = i.next();
			if(flag == 0 && index.getValue() == 2) {
				count --;
			}
			else if(flag ==1 && index.getValue() == 2) {
				count --;
			}
		}
		
		if(count == 0) {
			
			result= true;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {1,2,4,5,6};
		int a2[] = {11, 3, 2, 1};
		System.out.println(ifSubset(a1, a2));

	}

}
