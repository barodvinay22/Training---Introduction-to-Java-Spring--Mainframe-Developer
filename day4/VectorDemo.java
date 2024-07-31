
import java.io.*;
import java.util.*;

class VectorDemo {

  
    public static void main(String[] args)
    {

    
        Vector<Integer> v = new Vector<Integer>();

      
        for (int i = 1; i <= 5; i++)
            v.add(i);

      
        System.out.println(v);

       
        v.remove(3);

        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
