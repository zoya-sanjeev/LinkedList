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
		linkedList.insertAfter(secondNode, newNode);
		linkedList.printNodes();
		int newSize=linkedList.deleteNode(newNode);
		System.out.println("Size of Linked list after deletion "+newSize);
	}

}