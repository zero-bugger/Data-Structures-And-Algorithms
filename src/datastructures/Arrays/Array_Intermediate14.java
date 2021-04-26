package datastructures.Arrays;

import java.math.BigInteger;

public class Array_Intermediate14 {
	
	static BigInteger factorial(int n) {
		BigInteger f = new BigInteger("1");
		for(int i=2;i<=n;i++) {
			f=f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(factorial(20));
	}

}
