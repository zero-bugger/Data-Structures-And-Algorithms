package datastructures.Arrays;

import java.util.*;
//Two times recurring element in array
public class Array_Intermediate23 {

	static int [] twoRecurringElem(int a[],int n) {
		int result []  = new int[2];
		int j=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> i = set.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, Integer> item = i.next();
			
			if(item.getValue() == 2) {
				result[j] = item.getKey();
				j++;
			}
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1,2,1,3,4,3};
		int result[] = twoRecurringElem(array, array.length+2);
		for(int i:result) {
			System.out.println(i);
		}
	}

}
