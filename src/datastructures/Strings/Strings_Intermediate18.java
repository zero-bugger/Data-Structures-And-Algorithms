package datastructures.Strings;

public class Strings_Intermediate18 {

	static void printKeypadString(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			
			
			if(s.charAt(i)== 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') {
				
				if(s.charAt(i) == 'A') 
					sb.append("2");
				else if(s.charAt(i) == 'B') 
					sb.append("22");
				else 
					sb.append("222");
			}
			else if(s.charAt(i) == 'D'|| s.charAt(i) == 'E' || s.charAt(i) == 'F') {
				if(s.charAt(i) == 'D') 
					sb.append("3");
				else if(s.charAt(i) == 'E') 
					sb.append("33");
				else 
					sb.append("333");
			}
			else if(s.charAt(i) == 'G'|| s.charAt(i) == 'H' || s.charAt(i) == 'I') {
				if(s.charAt(i) == 'G') 
					sb.append("4");
				else if(s.charAt(i) == 'H') 
					sb.append("44");
				else 
					sb.append("444");
			}
			else if(s.charAt(i) == 'J'|| s.charAt(i) == 'K' || s.charAt(i) == 'L') {
				if(s.charAt(i) == 'J') 
					sb.append("5");
				else if(s.charAt(i) == 'K') 
					sb.append("55");
				else 
					sb.append("555");
			}
			else if(s.charAt(i) == 'M'|| s.charAt(i) == 'N' || s.charAt(i) == 'O') {
				if(s.charAt(i) == 'M') 
					sb.append("6");
				else if(s.charAt(i) == 'N') 
					sb.append("66");
				else 
					sb.append("666");
			}
			else if(s.charAt(i) == 'P'|| s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) =='S') {
				if(s.charAt(i) == 'P') 
					sb.append("7");
				else if(s.charAt(i) == 'Q') 
					sb.append("77");
				else if( s.charAt(i) =='R')
					sb.append("777");
				else {
					sb.append("7777");
				}
			}
			else if(s.charAt(i) == 'T'|| s.charAt(i) == 'U' || s.charAt(i) == 'V') {
				if(s.charAt(i) == 'T') 
					sb.append("8");
				else if(s.charAt(i) == 'U') 
					sb.append("88");
				else 
					sb.append("888");
			}
			else if(s.charAt(i) == 'W'|| s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i)=='Z') {
				if(s.charAt(i) == 'W') 
					sb.append("9");
				else if(s.charAt(i) == 'X') 
					sb.append("99");
				else if(s.charAt(i) == 'Y') 
					sb.append("999");
				else 
					sb.append("9999");
			}
			else if(s.charAt(i) == '*') {
				sb.append("*");
			}
			else if(s.charAt(i) == '#') {
				sb.append("#");
			}
			else if(s.charAt(i) == '1') {
				sb.append("1");
			}
			else {
				sb.append("0");
			}
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="I WRITE CODE";
		printKeypadString(s);
	}

}
