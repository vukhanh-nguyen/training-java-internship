package training.collections;

import java.util.*;

public class HashSets {

    public static void main(String[] args) {

        //HashSet contains unique elements only.
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("HashSet contains unique elements only and ignoring duplicate elements. Example");
        System.out.println("Before Add element 'Two'");
        for (String str : set) {
            System.out.println(str);
        }
        System.out.println("After Add element 'Two'");
        set.add("Two");
        for (String str : set) {
            System.out.println(str);
        }
    }
}
