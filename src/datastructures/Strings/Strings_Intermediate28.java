package datastructures.Strings;

public class Strings_Intermediate28 {

	
	static int search(int i,int j,String word,char board[][],int size,int index) {
		int found = 0;
		
		
		if(i>=0 && j>=0 && i<6 && j<6 && word.charAt(index) == board[i][j]) {
			char temp = word.charAt(index);
			board[i][j]=0;
			index+=1;
			if(index == size) {
				found =1;
			}
			else {
				found+= search(i+1, j, word, board, size, index);
				found+= search(i-1, j, word, board, size, index);
				found+= search(i, j+1, word, board, size, index);
				found+= search(i, j-1, word, board, size, index);
			}
			board[i][j] = temp;
		}
			return found;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char board[][]  = {
	                        {'D','D','D','G','D','D'},
	                        {'B','B','D','E','B','S'},
				            {'B','S','K','E','B','K'},
				            {'D','D','D','D','D','E'},
				            {'D','D','D','D','D','E'},
				            {'D','D','D','D','D','G'}
	           };
		String word = "GEEKS";
		int ans = 0;
		for(int i = 0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
					ans+= search(i,j,word,board,word.length(),0);
				
			}
		}
			System.out.println("Count "+ans);
	}

}
