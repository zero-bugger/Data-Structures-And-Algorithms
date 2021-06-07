package datastructures.LinkedList;
//Find an element in doubly linked list
public class DoublyLL_Operation1 {
	
	Node head;
	static class Node{
		Node next;
		Node prev;
		int data;
		Node (int d){
			data=d;
		}
	}
	
	public void insert(int d) {
		Node n = new Node(d);
		n.next = null;
		n.prev = head;
		
		if(head!=null) {
			n.next = head;
		}
		head = n;
	}
	public void addAtStart(int d) {
		Node n = new Node(d);
		
		n.prev =null;
		n.next=head;
		head = n;
	}
	public void addAtEnd(int d) {
		Node n = new Node(d);
		Node node = head;
		while(node.next!=null) {
			node= node.next;
		}
		node.next=n;
		n.prev=node;
	}
	
	public int findElement(int find) {
		int index = 0;
		
		Node n = head;
		if(find == n.data) {
			return 1;
		}
		while(n !=null) {
			if(find == n.data) {
				return index;
			}
			index++;
			n=n.next;
		}
		return -1;
	}
	public void show() {
		Node n = head;
		while(n.next!=null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.println(n.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLL_Operation1 list = new DoublyLL_Operation1();

		for(int i = 1;i<=10;i++) {
			list.insert(i);
		}
		list.addAtStart(3);
		list.addAtEnd(12);
		list.show();
		int a=list.findElement(12);
		System.out.println("Element is found at index "+a);
		
	}

}
