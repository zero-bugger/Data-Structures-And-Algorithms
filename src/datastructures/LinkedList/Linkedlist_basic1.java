package datastructures.LinkedList;

public class Linkedlist_basic1 {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next = null;
		}
	}
	
	public void insertAtEnd(int data) {
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
		}
		else {
			Node node = head;
			while(node.next!=null) {
				node = node.next;
			}
			node.next = n;
			
		}
	}
	public void insertAtStart(int data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
		}
		else {
			n.next = head;
			head = n;
		}
	}
	public void length() {
		Node n = head;
		int length=0;
		while(n !=null) {
			length++;
			n=n.next;
		}
		System.out.println(length);
	}
	public void insertAfter(Node prev , int data) {
		if(prev == null) {
			System.out.println("Previous node is null");
		}
		
		Node n = new Node(data);
		n.next = prev.next;
		prev.next = n;
	}
	public void show() {
		Node n = head;
		while(n.next != null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.println(n.data);
	}
	public static void main(String[] args) {
			
		Linkedlist_basic1 obj = new Linkedlist_basic1();
		obj.insertAtEnd(12);
		obj.insertAtEnd(1112);
		obj.insertAtEnd(10);
		obj.insertAtStart(123);
		obj.insertAfter(obj.head.next, 20);
		obj.show();
		obj.length();
		
	}
}
