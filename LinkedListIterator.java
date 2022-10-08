package com.Bridgelabz.LinkedList_Day14;
//
public class LinkedListIterator<D> {

    public void iterateLinkedList(LinkedList<D> linkedList) {

        Node<D> tempNode = linkedList.headNode;

        while(tempNode != null){

            System.out.print(tempNode.getData()+ " -> ");
            tempNode = tempNode.getNextNode();
        }

    }
}
