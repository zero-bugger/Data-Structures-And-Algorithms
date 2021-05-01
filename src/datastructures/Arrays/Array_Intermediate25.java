package datastructures.Arrays;

import java.util.*;

public class Array_Intermediate25 {

	public void matrixmbyn() {
		System.out.println("Enter value of m ");
		Scanner sc  = new Scanner(System.in);
		int rows =sc.nextInt();
		System.out.println("Enter value of n");
		int columns = sc.nextInt();
		int arr[][] = new int [rows][columns];
		
		System.out.println("Enter the values for matrix");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix is :");
		System.out.println();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
			
				System.out.print(" "+arr[i][j]+ " ");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Intermediate25 obj = new Array_Intermediate25();
		obj.matrixmbyn();
	}

}
