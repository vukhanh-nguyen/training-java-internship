package training.collections;

import java.util.*;

public class LinkedLists {

    public static void main(String[] args) {

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Mango");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Grapes");

        // Java Linkedlist class can contain duplicate elements.
        System.out.println("Linkedlist class can contain duplicate elements. Example:");
        linkedList.add("Apple");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
        linkedList.remove(linkedList.pollLast());

        System.out.println("\n---------\n");

        // Java Linkedlist class maintains insertion order.
        System.out.println("Linkedlist class maintains insertion order. Example:");
        System.out.println("Before add 'Watermelon'");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
        System.out.println("After add 'Watermelon'");
        linkedList.add("Watermelon");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 	LinkedList internally uses a doubly linked list to store the elements so LinkedList is better for manipulating data.
    }

}
