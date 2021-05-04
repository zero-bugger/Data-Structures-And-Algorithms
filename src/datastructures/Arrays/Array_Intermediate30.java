package datastructures.Arrays;
//Implement 2 stacks in one array

public class Array_Intermediate30 {
	static int size;
	static int a [];
	static int top1,top2;
	
	public  Array_Intermediate30(int n) {
		size = n;
		a = new int[n];
		top1 = -1;
		top2= n-1;
	}
	
	 void push1(int x) {
		
	if(top1 < top2-1) {
		top1++;
		a[top1]=x;
	}
	else {
		System.out.println("Overflow");
		System.exit(1);
	 }
   }
	 void push2(int x) {
		if(top1< top2-1) {
			top2--;
			a[top2] = x;
		}
		else {
			System.out.println("Overflow");
			System.exit(1);
		}
	}
		
	 int pop1() {
		if(top1>0) {
			int x = a[top1];
			top1--;
			return x;
		}
		else {
			
			System.out.println("Overflow");
			System.exit(1);
		}
		return -1;
	}
	 int pop2() {
		if(top2<size){
			int x = a[top2];
			top2++;
			return x;
		}
		else {
			System.out.println("Overflow");
			System.exit(1); 
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Intermediate30 obj = new Array_Intermediate30(5);
		obj.push1(2);
		obj.push1(3);
		obj.push2(4);
		System.out.println(obj.pop1());
		System.out.println(obj.pop2());
		System.out.println(obj.pop2());

	}

}
