package com.bridgelabz.linkedlist;

public class MyNodeMain {

	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode(70);
		MyNode<Integer> secondNode = new MyNode(30);
		MyNode<Integer> thirdNode = new MyNode(56);
		LinkedList linkedList= new LinkedList();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.printNodes();
	}

}