package datastructures.Arrays;

import java.util.*;

public class Array_Intermediate18 {

	static void biktimesArr(int a[],int n,int k) {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		int times = n/k;
		int flag=0;
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, Integer> value = iterator.next();
			
			if(value.getValue() > times) {
				list.add(value.getKey());
				flag=1;
			}
			
		}
		
		if(flag==0) {
			System.out.println("Elements with more than "+times+" times occurence is not present");
		}
		for(Object i:list.toArray()) {
			
			System.out.print(" "+i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 4, 4, 3, 5, 3, 4, 4, 6, 4, 3, 3, 8 };
		
		biktimesArr(arr, arr.length, 1);

	}

}
