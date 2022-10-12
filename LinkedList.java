package com.Bridgelabz.LinkedList_Day14;

public class LinkedList<D> {
    public Node<D> headNode = null;
    public Node<D> tailNode = null;
    public Node<D> tempNode = null;
    private Node<D> prevNode = null;

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
//
    public void pop(D dataToBeRemoved) {
        if (headNode == null && tailNode == null && tailNode == null) {
            return;
        }
        Node<D> currNode = headNode;
        prevNode = headNode;

        if (dataToBeRemoved == currNode.getData()) {
            headNode = currNode.getNextNode();
            currNode.setNextNode(null);
        }

        while (dataToBeRemoved != currNode.getData()) {
            prevNode = currNode;
            currNode = currNode.getNextNode();
        }

        prevNode.setNextNode(currNode.getNextNode());
        currNode.setNextNode(null);

    }


    //method for insert in between

    public void insert(Node<D> newNodeToBeInserted, int position) {
        int index = 0;

        Node<D> currNode = headNode;

        while (index < position -2) {
            currNode = currNode.getNextNode();
            index++;
        }

        Node<D> nextNode = currNode.getNextNode();

        newNodeToBeInserted.setNextNode(nextNode);

        currNode.setNextNode(newNodeToBeInserted);
    }

}
