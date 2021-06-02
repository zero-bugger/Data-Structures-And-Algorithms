package datastructures.LinkedList;

public class LinkedList_basic6 {

	
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int d){
			data=d;
			next = null;
		}
	}
	
	
	public void insert(int d) {
		Node n = new Node(d);
		
		if(head == null) {
			head = n;
		}
		else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next=n;
		}
	}
	public void show() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	
	public void findMinandMax() {
	
		Node n = head;
		int max = n.data;
		int min = n.data;
		
		while(n != null) {
			if(n.data > max) {
				max = n.data;
			}
			else if(n.data<min) {
				min = n.data;
			}
			n=n.next;
		}

		System.out.println();
		System.out.println("Min "+min);
		System.out.println("Max "+max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_basic6 list = new LinkedList_basic6();
		list.insert(1212);
		list.insert(121212);
		list.insert(123);
		list.insert(23);
		list.insert(34);
		list.insert(1);
		list.show();
		
		list.findMinandMax();
	}

}
