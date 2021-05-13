package datastructures.Strings;

//rearrange string with adjacent element not same
public class String_Intermediate9 {

	static void rearrangeandPrint(String output,String input) {
		
		
		if(input.length() == 0 ) {
			System.out.println(output);
			return;
		}
	
		
		
		for(int i=0;i<input.length();i++) {
			int outputlength = output.length();
			if(output.charAt(outputlength-1) != input.charAt(i)) {
				rearrangeandPrint(output+input.charAt(i), input.substring(0,i)+input.substring(i+1,input.length()));			
				return ;
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		String s = "aaabb";
		rearrangeandPrint(""+s.charAt(0), s.substring(1,s.length()));
	}
}
