package datastructures.Strings;

public class Strings_Intermediate25 {

//	static void firstReapeated(String output,String input) {
//		
//		for(int i=0;i<input.length();i++) {
//			int outputlength = output.length();
//			if(output.charAt(outputlength-1) != input.charAt(i)) {
//				System.out.println(input);
//				System.out.println(input.charAt(i));
//				firstReapeated(output+input.charAt(i), input.substring(0,i)+input.substring(i+1,input.length()));			
//				return ;
//			}
//			else {
//				System.out.println("ans "+output.charAt(outputlength-1));
//			}
//		}
//		
//		
//	}
	static int checkRepeat(String str) {
		
        int checker = 0;
      
        for (int i = 0; i < str.length(); ++i)
        {
            int val = (str.charAt(i)-'a');
            System.out.println("val "+val);
     
            if ((checker & (1 << val)) > 0) {
            	System.out.println("expression "+checker * (1<<val));
                return i;
            }
            checker |= (1 << val);
            System.out.println("checker "+checker);
        }
      
        return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcdefc";
	
		checkRepeat(s);
	
		}
	}


