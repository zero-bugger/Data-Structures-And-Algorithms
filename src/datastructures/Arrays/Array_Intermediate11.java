package datastructures.Arrays;

import java.util.*;

public class Array_Intermediate11 {
	
	static void rearrangeArr(int a[] , int n) {
		ArrayList<Integer> neg = new ArrayList<>();
		ArrayList<Integer> pos = new ArrayList<>();

		int flag=0,l=0,m=0;

		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				pos.add(a[i]);
			}
			else {
				neg.add(a[i]);
			}
		}
		Object [] neg1 = neg.toArray();
		Object [] pos1 = pos.toArray();
		
		for(int i=0;i<n;i++) {
			if(flag==0 && l<neg1.length) {
				a[i] = (int) neg1[l];
				flag=1;
				l++;
			}
			else if(flag ==1 && m<pos1.length) {
				a[i]=(int) pos1[m];
				flag=0;
				m++;
				
			}
			else {
				a[i] = (int)pos1[m];
				m++;
				
			}
		}
		System.out.println();
		for(int i:a) {
			System.out.print(" "+i);
		}
	}

	

	private static int neg1(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,-3,1,6};
		rearrangeArr(a, a.length);
	}

}
