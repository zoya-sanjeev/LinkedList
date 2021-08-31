package com.bridgelabz.linkedlist;

public class MyNodeMain {

	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode(56);
		MyNode<Integer> secondNode = new MyNode(30);
		MyNode<Integer> thirdNode = new MyNode(70);
		LinkedList linkedList= new LinkedList();
		linkedList.append(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.printNodes();
	}

}