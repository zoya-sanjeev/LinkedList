package com.bridgelabz.linkedlist;

public class MyNodeMain {

	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode(56);
		MyNode<Integer> secondNode = new MyNode(30);
		MyNode<Integer> thirdNode = new MyNode(70);
		LinkedList linkedList= new LinkedList();
		linkedList.add(firstNode);
		linkedList.append(thirdNode);
		linkedList.insert(firstNode, secondNode);;
		linkedList.printNodes();
		MyNode<Integer> newNode = new MyNode(40);
		SortedLinkedList<Integer> sortedLinkedList= new SortedLinkedList<Integer>();
		sortedLinkedList.add(firstNode);
		sortedLinkedList.add(secondNode);
		sortedLinkedList.add(thirdNode);
		sortedLinkedList.add(newNode);
		sortedLinkedList.printNodes();
	}

}