package com.Bridgelabz.LinkedList_Day14;

public class Main {
    public static void main(String[] args) {
        System.out.println("************Linked List**********");
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);


        //UC5 delete first element 56

        //linkedList.pop(56);

        //UC6 delete last element 70

        linkedList.pop(70);

        LinkedListIterator<Integer> linkedListIterator = new LinkedListIterator<>();
        linkedListIterator.iterateLinkedList(linkedList);


    }

}
