package training.collections;

import java.util.*;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        // Can't duplicate keys in HashMap. It will replace the value if we try to store duplicate key
        System.out.println("Before try add value with key 1 - Watermelon");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("After try add value with key 1 - Watermelon");
        map.put(1,"Watermelon");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
