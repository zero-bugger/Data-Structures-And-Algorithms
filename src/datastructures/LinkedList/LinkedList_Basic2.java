package datastructures.LinkedList;
//Create Singly Linkedlist and search element in it
public class LinkedList_Basic2 {
	
	Node head;
	
	static class Node{
		Node next;
		int data;
		Node(int d){
			data= d;
			next =null;
		}
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next = node;
		}
	}
	
	public boolean  searchElement(int data) {
		Node n = head;
		if( n.data == data) {
			return true;
		}
		while(n !=null) {
			if(n.data == data) {
				return true;
			}
			n=n.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Basic2 list = new LinkedList_Basic2();
		list.insert(20);
		list.insert(24);
		list.insert(23);
		list.insert(34);
		list.insert(32);
		
		System.out.println(list.searchElement(32));
	}

}
