package datastructures.LinkedList;

public class LinkedList_basic8 {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		
		
		Node(int d){
			data=d;
			
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
		
		n.prev = null;
		n.next = head;
		
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
		LinkedList_basic8  list = new LinkedList_basic8();
		list.insert(12);
		list.insert(32);
		list.insert(43);
		list.insert(122);
		list.addAtBegin(34);
		list.show();
	}
}
