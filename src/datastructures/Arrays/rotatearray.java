package datastructures.Arrays;

public class rotatearray {

	void rotateleft(int a[],int n , int d) {
		for (int i=0;i<d;i++) {
			leftrotatearr(a,n);
		}
	}
	void leftrotatearr(int a[],int n) {
		int temp;
		temp = a[0];
		for(int i=0;i<n-1;i++) {
			a[i]=a[i+1];
		}
		a[n-1]=temp;
	}
	
	void printarr(int a[]) {
		for(int i:a) {
			System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotatearray a = new rotatearray();
		int b[] = {1,2,3,4,5};
		a.rotateleft(b, b.length, 2);
		a.printarr(b);
		
	}

}
