package datastructures.Strings;
//Find if the word exits in 2D grid and return its positions
import java.util.*;


public class Strings_Intermediate29 {
	
	static void search(int i,int j,char[][] grid,String word,int size,int index){
		HashMap<Integer,Integer> map = new HashMap<>();
		if(i>=0 && j>=0 && i<3 && j<4 && word.charAt(index) == grid[i][j] ) {
			char temp = grid[i][j];
			grid[i][j] = 0;
			if(index == 0) {
				map.put(i, j);
			}
			index+=1;
			if(size != index) {
				search(i, j+1, grid, word, size, index);
				search(i+1, j, grid, word, size, index);
				search(i, j-1, grid, word, size, index);
				search(i-1, j, grid, word, size, index);
				search(i+1, j+1, grid, word, size, index);
				search(i-1, j-1, grid, word, size, index);
			}
			grid[i][j] = temp;
			
		}
		
		
		Set<Map.Entry<Integer,Integer>> st = map.entrySet();
		Iterator<Map.Entry<Integer,Integer>> it = st.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> v = it.next();
			System.out.println("{"+v.getKey()+","+v.getValue()+"}");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] grid ={
		         {'a','b','a','b'},
		         {'a','b','e','b'},
		         {'e','b','e','b'}
		         };
		String word="abe";
		char [][] grid2={{'a','b','c'},{'d','r','f'},{'g','h','i'}};
		String word2 = "abc";
		
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid.length;j++) {

			   search(i,j,grid,word,word.length(),0);
			   search(i,j,grid2,word2,word2.length(),0);

			}
		}
	  
		
	}

}
