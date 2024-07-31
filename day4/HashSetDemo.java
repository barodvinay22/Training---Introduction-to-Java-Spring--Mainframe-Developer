// Java program to demonstrate the
// working of a HashSet
import java.util.*;

public class HashSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        Set<String> hs = new HashSet<String>();

        hs.add("Hi");
        hs.add("Hi");
        hs.add("Hi");
        hs.add("Hi");
        hs.add("How");
        hs.add("Are");
        hs.add("You");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
