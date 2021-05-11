package datastructures.Strings;

public class String_Intermediate6 {

	static void printSubsequences(String input,String output) {
		StringBuilder out = new StringBuilder(output);
		StringBuilder inp = new StringBuilder(input);
		if(inp.length() == 0) {
			System.out.println(out.toString());
			return;
		}
		
		StringBuilder op1 = new StringBuilder(output);
		StringBuilder op2 = new StringBuilder(output);
		
		op2.append(input.charAt(0));
		inp.deleteCharAt(0);
		printSubsequences(inp.toString(),op1.toString());
		printSubsequences(inp.toString(), op2.toString());
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aab";
		String output = "";
		printSubsequences(input, output);
	}
	
}
