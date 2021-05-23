package datastructures.Strings;

import java.util.* ;

public class Strings_Intermediate20 {
	
	

		
		 static long minSwap(String s)
		    {
		        char[] chars = s.toCharArray();
		         
		   
		        int countLeft = 0, countRight = 0;
		      
		        int swap = 0 , imbalance = 0;
		         
		        for(int i =0; i< chars.length; i++)
		        {
		            if(chars[i] == '[')
		            {
		                countLeft++;
		                if(imbalance > 0)
		                {
		                   
		                    swap += imbalance;
		           
		                    imbalance--;    
		                    System.out.println("Imbalance "+imbalance);
		                }
		            } else if(chars[i] == ']' )
		            {
		                countRight++;
		               
		                imbalance = (countRight-countLeft);
		                System.out.println("Imbalance Count"+imbalance);
		            }
		        }
		        return swap;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " []][][";
		System.out.println(minSwap(s));
	}	

}
