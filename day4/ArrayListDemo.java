
// import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class ArrayListDemo {

    // Main Method
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++)
        list.add(i);

        System.out.println(list);

        // Remove element at index 3
        list.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(list);

        // Printing elements one by one
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

        list = new LinkedList<Integer>();

        for (int i = 1; i <= 5; i++)
        list.add(i);

        // Printing elements
        System.out.println(list);

        list.remove(3);

        System.out.println(list);

        // Printing elements one by one
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
