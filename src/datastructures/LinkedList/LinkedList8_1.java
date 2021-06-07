package datastructures.LinkedList;
//Created Doubly LinkedList with different operations
public class LinkedList8_1 {

	Node head;
	static class Node{
		Node next;
		Node prev;
		int data;
		Node(int d){
			data= d;
		}
	}
	
	public void insert(int d) {
		Node n =new Node(d);
		
		n.next = null;
		n.prev = head;
		
		if(head!=null) {
			n.next = head;
		}
		
		head = n;
	}
	
	public void insertATStart(int d) {
	
		Node node = new Node(d);
		
		node.prev=null;
		node.next=head;
		
		head = node;
		
	}
	public void insertAtEnd(int d) {
		Node n = head;
		Node node = new Node(d);
		
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
		node.prev=n;
	}
	public void show() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList8_1 list = new LinkedList8_1();
		list.insert(12);
		list.insert(21);
		list.insert(34);
		list.insert(54);
		list.insertAtEnd(322);
		list.insertATStart(45);;
		list.show();
	}

}
