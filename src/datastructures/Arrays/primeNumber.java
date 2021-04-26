package datastructures.Arrays;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=2;i<=n/2;i++) {
			if(n%i != 0 ) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not prime");
			}
		}
	}

}
