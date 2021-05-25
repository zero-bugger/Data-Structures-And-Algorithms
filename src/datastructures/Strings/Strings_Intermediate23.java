package datastructures.Strings;

public class Strings_Intermediate23 {
	
	
	static int rotateString(String s) {
		
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		int called =0;
		char c [] =rotate(s.toCharArray(),n);
		
		for(int i=0;i<n;i++) {				
			sb.append(c);
			if(s.equals(sb.toString())) {
				called = i+1;
				break;
			}
			else
				sb = new StringBuilder();
				rotate(c,n);		
		}
			return called;
	}
	
	static char [] rotate(char c[],int n) {
		
			char temp = c[n-1];
			for(int i=n-1;i>0;i--) {
				c[i] =c[i-1];
			}
			c[0] = temp;
			
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		System.out.println(rotateString(s));

	}

}
