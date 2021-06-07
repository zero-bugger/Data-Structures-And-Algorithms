package datastructures.LinkedList;
//Find min and max element from doubly linked list
public class DoublyLL_Op3 {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node (int d){
			data=d;
		}
	}

	public void insertNOde(int d) {
		Node n = new Node(d);
		n.next= null;
		n.prev=head;
		if(head !=null) {
			n.next=head;
		}
		head = n;
	}
	public void findNthNode( int n) {
		Node node = head;
		int data = 0;
		int count = 1;
		 while(node!=null) {
			 if(count == n) {
				 data = node.data;
			 }
			 else {
				
				 node=node.next;
			 }			 
			 count++;
		 }
		 System.out.println();
		 System.out.println("Nth node is "+data);
	}
	public void minandmax() {
		
		Node n = head;
		int min = n.data;
		int max = n.data;
		while(n!=null) {
			if(n.data>max) {
				max = n.data;
			}
			else if(n.data<min) {
				min = n.data;
			}
			n=n.next;
		}
		System.out.println("Minimum element is "+min);
		System.out.println("Maximum element is "+max);
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
		DoublyLL_Op3 list = new DoublyLL_Op3();
		for(int i = 1;i<=10;i++) {
			list.insertNOde(i);
		}
		list.show();
		list.findNthNode(10);
		list.minandmax();
	}

}
