package com.bridgelabz.linkedlist;

public class MyNode<K> implements INode<K>{
	

	private K key;
	private INode next;
	
	public MyNode(K key){
		this.key=key;
		this.next=null;
		
	}
	
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	@Override
	public INode getNext() {
		return next;
	}
	@Override
	public void setNext(INode next) {
		this.next = next;
	}

}
