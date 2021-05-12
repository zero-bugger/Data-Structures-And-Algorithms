package datastructures.Strings;
//print all permutations of string
public class String_Intermediate7 {
	
	static void printPermutationcom(String output,String input) {
		
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		for(int i=0;i<input.length();i++) {
			printPermutationcom(output+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABC";
		printPermutationcom("", s);
	
	}

}
