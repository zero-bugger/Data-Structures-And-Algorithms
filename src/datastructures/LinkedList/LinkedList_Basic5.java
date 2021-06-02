package datastructures.LinkedList;
//Find occurence of given element
import java.util.*;

public class LinkedList_Basic5 {
	
	Node head;
	static class Node{
		Node next;
		int data;
		
		Node(int d){
			data=d;
			next = null;
		}
		
	}
	public void insert(int d) {
		Node n = new Node(d);
		if(head == null) {
			head = n;
		}
		else {
			Node node = head;
			while(node.next!=null) {
				node=node.next;
			}
			node.next = n;
		}
	}
	
	public void show() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	
	public int findOccurence(int data) {
		int count = 0;
		Node n = head;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(n!=null) {
			if(map.containsKey(n.data)) {
				map.put(n.data, map.get(n.data)+1);
			}
			else {
				map.put(n.data, 1);
			}
			
			n=n.next;
		}
		
		
		Set<Map.Entry<Integer, Integer>> st = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> it = st.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> v = it.next();
			if(v.getKey() == data) {
				count = v.getValue();
			}
		}
		
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Basic5 list = new LinkedList_Basic5();
		list.insert(1);
		list.insert(2);
		list.insert(1);
		list.insert(3);
		list.insert(2);
		list.insert(3);
		list.insert(1);
		list.insert(3);
		list.insert(3);
		int find =3;
		list.show();
		System.out.println();
		System.out.println("Occurence  of element "+find+" is "+list.findOccurence(find));
		
		
	}

}
