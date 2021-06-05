package datastructures.LinkedList;
//Create doubly linked list
public class LinkedList_basic8 {
	
	Node head;
	static class Node{
		Node next;
		Node prev;
		int data;
		Node(int d){
			data =d;
			
		}
	}
	
	public void insert(int d) {
		Node n = new Node(d);
		n.prev = null;
		n.next = head;
		
		if(head!=null){
		    head.prev = n;
		}
		head = n;
	}
	
	public void insertAtStart(int d){
		Node n = new Node(d);
		
		n.prev = null;
		n.next =head;
		
		head = n;
			
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
		LinkedList_basic8 list = new LinkedList_basic8();
		list.insert(12);
		list.insert(223);
		list.insert(32);
		list.insert(34);
		list.insert(56);
		list.show();

	}

}
