package com.ds.linkedlist;

public class LinkedList {
	private int length = 0;
	ListNode head;

	public LinkedList() {
		length = 0;
	}

	public synchronized ListNode getHead() {
		return head;

	}

	// insertion in link list at head.
	public void insertAtHead(ListNode newNode) {
		newNode.setNext(head);
		head = newNode;
		length++;
	}

	//insert at given position.
	public void insertAtPosition(ListNode newNode,int position) {
		
		if(position <= 0) {
			position = 0;
			insertAtHead(newNode);
		}
		if(head == null) {
			head = newNode;
		} else {
			ListNode previousNode = head;
			for(int i=1 ;i < position;i++) {
				previousNode = previousNode.getNext();
			}
			newNode.setNext(previousNode.getNext());
			previousNode.setNext(newNode);
			length++;
		}
	}
	//insert the element at the end of the list.
	public void insertAtEnd(ListNode newNode) {
		if(head == null) {
			head = newNode;
		} else {
			ListNode currentNode = head,previousNode = null;
			while(currentNode != null) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previousNode.setNext(newNode);
			newNode.setNext(null);
			length++;
		}
	}
	
	public String toString() {
		String result = "[";
		
		return null;
		
		
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ListNode n = new ListNode(12);
		ListNode n1 = new ListNode(13);
		n.setNext(n1);
		
		ll.head = n;
		
		ListNode n2 = new ListNode(14);
		// n1.setNext(n2);

		ll.insertAtPosition(n2,0);

		System.out.println(getLength(ll.head));
		System.out.println(ll.length);

	}

	// get length of the link list
	public static int getLength(ListNode headNode) {
		int length = 0;
		ListNode currentNode = headNode;
		while (currentNode != null) {
			length++;
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
		return length;
	}

	
}
