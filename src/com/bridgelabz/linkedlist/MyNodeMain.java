package com.bridgelabz.linkedlist;

public class MyNodeMain {

	public static void main(String[] args) {
		MyNode<Integer> firstNode=new MyNode(56);
		MyNode<Integer> secondNode=new MyNode(30);
		MyNode<Integer> thirdNode=new MyNode(70);
		
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);

		boolean result=firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		System.out.println(result);
	}

}