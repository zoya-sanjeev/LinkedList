package com.bridgelabz.linkedlist;

public class LinkedList<K> {
	
	private INode head;
	private INode tail;

	public LinkedList() {
		this.head=null;
		this.tail=null;
	}
	public void add(INode newNode) {
		if(tail==null)
			this.tail=newNode;
		if(head==null)
			this.head=newNode;
		else
			newNode.setNext(head);
			head=newNode;
	}
	
	public void append(INode newNode) {
		if(this.head==null)
			this.head=newNode;
		if(this.tail==null)
			this.tail=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
			
	}
	
	public void insert(INode myNode, INode newNode) {
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public INode pop() {
		INode tempNode=this.head;
		this.head=this.head.getNext();
		return tempNode;
	}
	
	public INode popLast() {
		INode tempNode=this.head;
		while(!tempNode.getNext().equals(this.tail))
			tempNode=tempNode.getNext();
		this.tail=tempNode;
		tempNode=tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
		
	}
	public int search(K key) {
		INode tempNode=this.head;
		int index=0;
		while(!tempNode.equals(this.tail)) {
			if(tempNode.getKey().equals(key))
				return index;
			tempNode=tempNode.getNext();
			index++;
		}
		return index;	
		
	}
	
	public void printNodes() {
		INode tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.getKey()+"->");
			tempNode=tempNode.getNext();
		}
		System.out.println("null");
	}

}
