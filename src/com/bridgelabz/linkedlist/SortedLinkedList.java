package com.bridgelabz.linkedlist;

public class SortedLinkedList<K extends Comparable<K>> {	
	private INode<K> head;
	private INode<K> tail;
	
	public SortedLinkedList() {
		this.head=null;
		this.tail=null;
		
	}
	
	public void add(INode<K> newNode) {
		if (head== null) {
			head = newNode;
			tail = newNode;
		} else if (head.getKey() == tail.getKey()) {
			if (head.getKey().compareTo(newNode.getKey()) > 0) {
				newNode.setNext(head);
				head = newNode;
			} else {
				head.setNext(newNode);
				tail = newNode;
			}
		} else {
			INode<K> temp = head;
			while (temp.getNext() != null && ( temp.getKey().compareTo(newNode.getKey())) < 0) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
			
	}
	
	public void printNodes() {
		INode<K> tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.getKey()+"->");
			tempNode=tempNode.getNext();
		}
		System.out.println("null");
	}

}
