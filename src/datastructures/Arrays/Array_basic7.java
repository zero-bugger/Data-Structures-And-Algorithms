package datastructures.Arrays;

import java.util.HashMap;

public class Array_basic7 {

	static int occurArr(int a[],int n, int k) {
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i],1);
			}
		}
		
		return map.get(k);
		
	}
	public static void main(String[] args) {

		int a[]= {1,2,3,3,3,3,3,3,3,4,5,6,6};
		Integer occurence = occurArr(a, a.length, 3);
		System.out.println("Occurence "+occurence);
		

	}

}
