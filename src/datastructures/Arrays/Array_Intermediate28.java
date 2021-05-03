package datastructures.Arrays;

public class Array_Intermediate28 {
	
	static void printSpiralMatrix(int a[][],int n) {
		
		int top =0 ,down = n-1;
		int left = 0 , right = n-1;
		int direction =0;
		
		while(left<=right && top<=down) {
			
			if(direction == 0) {
				for(int i=left ; i<=right;i++) {
					System.out.print(" "+a[top][i]);
				}
				top+=1;
			}
			else if(direction==1) {
				for(int i=top; i<=down;i++) {
					System.out.print(" "+a[i][right]);
				}
				right-=1;
			}
			else if(direction==2) {
				for(int i=right;i>=left;i-- ) {
					System.out.print(" "+a[down][i]);
				}
				down-=1;
			}
			else if(direction == 3) {
				for(int i=down;i>=top;i--) {
					System.out.print(" "+a[i][left]);
				}
				left+=1;
			}
			
			direction = (direction+1)%4;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};
		
		printSpiralMatrix(matrix,matrix.length);
	}

}
