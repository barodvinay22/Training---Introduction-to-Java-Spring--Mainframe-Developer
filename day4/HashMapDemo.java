// Java program to demonstrate the
// working of a HashMap
import java.util.*;

public class HashMapDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating HashMap and
        // adding elements
        Map<Integer, String> hm
            = new HashMap<Integer, String>();

        hm.put(1, "Vinay");
        hm.put(2, "Rahul");
        hm.put(3, "Sachin");
        hm.put(1, "Ram");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
}
