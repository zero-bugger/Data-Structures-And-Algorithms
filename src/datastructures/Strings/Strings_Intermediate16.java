package datastructures.Strings;

//Next greater element with same set of digits.
import java.util.Arrays;

public class Strings_Intermediate16 {
	
	static void nextGreatestNumber(int s[]) {
		int low = 0;
		int index = 0;
		int swap = 0 ;
		int firstsmall= 0;
		

		for(int i = s.length-1;i>0;i--) {
			low=i;
			if(s[i-1] < s[i] ) {
				firstsmall = s[i-1];
				index = i-1;
				break;
			}
			
		}
		if(low == 1) {
			System.out.println("All elements are in descending order so not possible");
			return;
		}
		
		for(int i = index+1 ; i<s.length;i++) {
			if(s[i] > firstsmall) {
				swap = i;
			}
			else if (s[i] < firstsmall) {
				if(swap > firstsmall) {
					swapelement(s,swap,index);
					break;
				}
			}
			
		}
		swapelement(s,swap,index);
		
	    Arrays.sort(s,index+1,s.length);
	    for(int i:s) {
			System.out.print(" "+i);
		}

		
	}
	
	static void swapelement(int s[],int a,int b) {
			int temp = s[a];
			s[a]=s[b];
			s[b]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,1,8,7,6,5};
  		nextGreatestNumber(a);
	}

}
