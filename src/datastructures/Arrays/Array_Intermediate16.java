package datastructures.Arrays;

import java.util.*;

public class Array_Intermediate16 {

	static int maxConsecutiveElement(int a[] , int n) {
		int max = 0;
		HashSet<Integer> hs = new HashSet<>();
		for(int i:a) {
			hs.add(i);
		}
	
		for(int i=0;i<hs.size();i++) {
			
			if(i+1<hs.size()) {
				int diff = Math.subtractExact((int)hs.toArray()[i+1] ,(int)hs.toArray()[i]);
				if(diff != 1) {
					
					max=(int)hs.toArray()[i];
					break;
					
				}
				
			}	
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,9,3,10,4,20,2};
		System.out.println(maxConsecutiveElement(a, a.length));
	}

}
