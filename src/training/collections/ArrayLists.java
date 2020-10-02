package training.collections;

import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {

        // Array List
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Mango");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");

        // Java ArrayList class can contain duplicate elements.
        System.out.println("ArrayList class can contain duplicate elements. Example:");
        arrayList.add("Apple");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        arrayList.remove(arrayList.size()-1);

        System.out.println("\n---------\n");

        // Java ArrayList class maintains insertion order.
        System.out.println("ArrayList class maintains insertion order. Example:");
        System.out.println("Before add 'Watermelon'");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        System.out.println("After add 'Watermelon'");
        arrayList.add("Watermelon");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\n---------\n");

        // Java ArrayList allows random access because array works at the index basis.
        System.out.println("ArrayList allows random access because array works at the index basis. Example:");
        System.out.println("Fetch the element 2");
        System.out.println(arrayList.get(2));

        System.out.println("\n---------\n");

        // ArrayList is better for storing and accessing data.
    }
}
