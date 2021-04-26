package datastructures.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;



public class Array_Intermediate5 {
	
	static void findDup(int a[], int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		
		map.entrySet().forEach(entryset->{
			if(entryset.getValue()>1) {
				ar.add(entryset.getKey());
			}
		
		});
		
		
		
			if(ar.size()>0) {
				
				for(int i=0;i<ar.size();i++) {
					System.out.print(" "+ar.get(i));
				}
			}
			else {
			
				System.out.println(-1);
				
			}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,3,1,2};
	    findDup(a, a.length);
		
	}

}
