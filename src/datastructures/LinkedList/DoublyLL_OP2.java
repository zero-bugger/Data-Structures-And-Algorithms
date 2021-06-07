package datastructures.LinkedList;
//Delete element from Doubly Linked List
public class DoublyLL_OP2 {
	
	Node head;
	static class Node{
		Node next;
		Node prev;
		int data;
		Node(int d){
			data=d;
		}
	}
	
	public void insert(int d) {
		Node n = new Node(d);
		n.prev = head;
		n.next=null;
		
		if(head!=null) {
			n.next=head;
		}

		head= n;
	}
	
	public int length() {
		int length=0;
		Node n = head;
		while(n!=null) {
			length++;
			n=n.next;
		}
		return length;
	}
	public void deleteElement(int d) {
		Node n = head;
		if(d == n.data) {
			head = head.next;
		}
		while(n != null && n.next!=null) {
			if(n.data == d) {
				n.prev.next = n.next;
				n.next.prev = n.prev;			
			}
			else {
				n=n.next;
			}
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
		DoublyLL_OP2 list = new DoublyLL_OP2();
		for(int i=1;i<=10;i++) {
			list.insert(i);
		}
		//list.show();
		list.deleteElement(2);
		list.show();
	}

}
