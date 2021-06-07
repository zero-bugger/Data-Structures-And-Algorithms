package datastructures.LinkedList;
//Create doubly linked list
public class LinkedList_basic8 {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		
		
		Node(int d){

			data =d;
<<<<<<< HEAD

=======
			
>>>>>>> 5ac128055ee20802ac9b22c4384912459c6f92b9
		}
	}
	
	
	public void insert(int d)
    {
        Node n = new Node(d);
        n.prev=null;
        n.next = head;
        
        if(head!=null) {
        	head.prev = n;
        }
        head = n;
    }
	public void addAtBegin(int d) {
		Node n = new Node(d);
<<<<<<< HEAD

		
		n.prev = null;
		n.next = head;

		Node temp = head;
=======
		n.prev = null;
		n.next = head;
>>>>>>> 5ac128055ee20802ac9b22c4384912459c6f92b9
		
		if(head!=null){
		    head.prev = n;
		}
<<<<<<< HEAD

		
		head = n;
	}

=======
		head = n;
	}
	
	public void insertAtStart(int d){
		Node n = new Node(d);
		
		n.prev = null;
		n.next =head;
		
		head = n;
			
	}
	
>>>>>>> 5ac128055ee20802ac9b22c4384912459c6f92b9
	public void show() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		LinkedList_basic8  list = new LinkedList_basic8();
		list.insert(12);

		list.insert(32);
		list.insert(43);
		list.insert(122);
		list.addAtBegin(34);

		list.insert(223);
		list.insert(32);
		list.insert(34);
		list.insert(56);

		list.show();
	}
}
