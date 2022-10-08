package com.Bridgelabz.LinkedList_Day14;

public class LinkedList<D> {
    public Node<D> headNode = null;
    public Node<D> tailNode = null;
    public Node<D> tempNode = null;

    //create methode for adding data in node

    public void add(Node<D> newNode) {
        if (headNode == null && tailNode == null && tempNode == null) {
            headNode = newNode;    // headnode =  fistnode value store
            tailNode = newNode;    // tailNode = fistnode value store
            tempNode = newNode;    // tempnode = fistnode value store

        } else {   // for second or next node
            tempNode.setNextNode(newNode);
            tailNode = newNode;
            tailNode.setNextNode(null);
            tempNode = newNode;

        }

        System.out.println("HeadNode Data = " +headNode.getData());
        System.out.println("TailNode Data = " +tempNode.getData());

    }
}
