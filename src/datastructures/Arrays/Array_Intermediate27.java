package datastructures.Arrays;

import java.util.*;

public class Array_Intermediate27 {
	static Object findMedian(int a[][],int r ,int c ) {
		List<Integer> hash = new ArrayList<>();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				hash.add(a[i][j]);
			}
		}
		Object arr[] = hash.toArray();
		Arrays.sort(arr);

		return arr[(r*c)/2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] = {{1, 3, 5}, 
					 {2, 6, 9}, 
					 {3, 6, 9}};
		System.out.println(findMedian(M, 3, 3));
	}

}
