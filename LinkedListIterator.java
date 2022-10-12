package com.Bridgelabz.LinkedList_Day14;
//
public class LinkedListIterator<D> {

    public void iterateLinkedList(LinkedList<D> linkedList) {

        Node<D> tempNode = linkedList.headNode;

        int count  = 0;

        while(tempNode != null){

            System.out.print(tempNode.getData()+ " -> ");
            tempNode = tempNode.getNextNode();
            count++;
        }
        System.out.println();
        System.out.println("The size of LinkedList is " +count);
        //
    }
}
