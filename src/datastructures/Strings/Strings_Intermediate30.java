package datastructures.Strings;

import java.util.*;

public class Strings_Intermediate30 {

//	static boolean wordBreak(List<String> list, String word) {
//		boolean[] dp = new boolean[word.length()+1];
//		
//		dp[0] = true;
//		for(int len = 1;len<word.length();len++) {
//			for(int i=0;i<=len;i++) {
//				if(dp[i] && list.contains(word.substring(i,len-i))) {
//					dp[len] = true;
//					break;
//				}
//			}
//		}
//				return dp[word.length()];
//	}
	static boolean wordBreak2(String word,List<String > list) {
		 int size = word.length();
         
	     
	        if (size == 0)
	        return true;
	         
	        for (int i = 1; i <= size; i++)
	        {
	   
	            if (list.contains(word.substring(0,i)) &&
	                    wordBreak2(word.substring(i,size),list))
	            return true;
	        }
	         
	        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> st = new ArrayList<>();
		String a[] = {"c","od","e","xy"};
		for(String b:a) {
			st.add(b);
		}
		String word = "code";
		boolean value =wordBreak2(word,st);
		System.out.println(value);
	}

}
