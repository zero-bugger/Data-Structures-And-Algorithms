package datastructures.LinkedList;

public class LinkedList_Basic3 {
	
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int d){
			data=d;
			next = null;
		}
	}
	
	public void insert(int data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
		}
		else {
			Node node = head;
			while(node.next!= null) {
				node = node.next;
			}
			node.next = n;
		}
	}
	
	public void deleteElement(int data) {
		Node n = head;
		Node prev = null;
		
		if(n.data == data) {
			head = head.next;
		}
		
		while(n != null && n.next!=null) {
			
			if(n.next.data == data) {
				n.next = n.next.next;
			}else {
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
	int val = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Basic3 list = new LinkedList_Basic3();
		System.out.println(list.val);
//		list.insert(20);
//		list.insert(23);
//		list.insert(12);
//		list.insert(124);
//		//list.show();
//		list.deleteElement(12);
//		list.show();
		
	}

}
	