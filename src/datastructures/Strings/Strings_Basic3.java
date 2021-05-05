package datastructures.Strings;
//Remove all spaces from string
public class Strings_Basic3 {
	
	static void removeWhite(String str) {
		
		str=str.replaceAll("\\s","");
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " i love coding";
		removeWhite(str);

	}

}
