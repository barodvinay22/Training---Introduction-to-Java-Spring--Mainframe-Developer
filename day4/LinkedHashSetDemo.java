// Java program to demonstrate the
// working of a LinkedHashSet
import java.util.*;

public class LinkedHashSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating LinkedHashSet and
        // adding elements
        Set<String> lhs
            = new LinkedHashSet<String>();

        lhs.add("Linked");
        lhs.add("Linked");
        lhs.add("Linked");
        lhs.add("Linked");
        lhs.add("hash");
        lhs.add("Set");
        lhs.add("Demo");
        lhs.add("Java");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
