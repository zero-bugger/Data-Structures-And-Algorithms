package datastructures.LinkedList;

public class LinkedList_Basic4 {
	
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
		}else {
			Node node = head;
			while(node.next!=null) {
				node=node.next;
			}
			node.next = n;
		}
	}
	
	public void findNthElement(int index) {
		Node n = head;
		int count = 0;
		int l = length();
		System.out.println(l);
		if(index >= l) {
			System.out.println("Index out of bound");
			return;
		}
		while(n != null && count!=index ) {
			n =n.next;
			count++;
		}
		
		System.out.println();
		System.out.println(n.data);
		
		
	}
	public int length() {
		Node n = head;
		int length=0;
		while(n != null) {
			length++;
			n=n.next;
		}
		return length;
	}
	public void show() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		LinkedList_Basic4 list = new LinkedList_Basic4();
		list.insert(10);
		list.insert(24);
		list.insert(23);
		list.insert(26);
		list.show();
		list.findNthElement(3);
		
	}
}
