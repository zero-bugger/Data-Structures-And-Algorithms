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
			next = null;
			prev = null;
		}
	}
	
	public void insert(int d) {
		Node n = new Node(d);
		Node temp = head;
		
		if(head == null) {
			head = n;
		}
		else {
			temp.next = n;
			n.prev = temp;
			temp = n;
		}
		
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
