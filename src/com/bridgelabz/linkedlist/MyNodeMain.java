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
		INode node=linkedList.pop();
		System.out.println(node.getKey()+" Popped");
		linkedList.printNodes();
		INode lastNode=linkedList.popLast();
		System.out.println(lastNode.getKey()+" Popped");
		linkedList.printNodes();
	}

}