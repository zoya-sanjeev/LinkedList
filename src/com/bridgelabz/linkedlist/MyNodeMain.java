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
		int index=linkedList.search(30);
		if(index!=0)
			System.out.println("30 found at index "+index);
		else
			System.out.println("Key Not found");
	}

}