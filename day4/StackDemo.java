
import java.util.*;
public class StackDemo {

    // Main Method
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Hi");
        stack.push("How");
        stack.push("Are");
        stack.push("You");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}
