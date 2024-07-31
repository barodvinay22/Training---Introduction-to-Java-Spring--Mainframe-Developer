// Java program to demonstrate the
// working of LinkedList
import java.util.*;

class LinkedListDemo {

    // Main Method
    public static void main(String[] args)
    {


        List<Integer> ll = new LinkedList<Integer>();


        for (int i = 1; i <= 5; i++)
            ll.add(i);

        // Printing elements
        System.out.println(ll);

       
        ll.remove(3);

        
        System.out.println(ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}
