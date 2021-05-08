package datastructures.Strings;


public class String_Intermediate5 {
	
	static int longestRepeatingSub(String a) {
		
		int count = 0;
		String b = a;
		int i =0,j=0,n=a.length();
		
		while(i<n && j<n) {
			
			if(a.charAt(i) == b.charAt(j) && a.charAt(i) == b.charAt(j+1)) {
				System.out.println(a.charAt(i));
				System.out.println(b.charAt(j+1));
				i+=2;
				j+=2;
				count++;
			}
			else if(a.charAt(i) == b.charAt(j) && a.charAt(i)!= b.charAt(j+1)) {
				char ch = a.charAt(i);
				int matchfound =positionMatch(j, ch, b);	
				
				if(matchfound !=0) {
					i=matchfound;
					j=matchfound;
					count++;
				}
				else {
					i++;
					j++;
				}
			}
		
		}
				
		return count;
		
		
	}
	
	static int positionMatch(int j,char ch,String s) {
		int flag = 0;
		for(int i=j+1;i<s.length();i++) {
			if(ch == s.charAt(i)) {
				flag=i;
				break;
			}
		}
			
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="AAB";
		int result = longestRepeatingSub(s);
		System.out.println(result);
	}

}
