import java.util.*;

class HashTableDemo {
    public static void main(String args[])
    {
       
        Hashtable<Integer, String> ht = new Hashtable<>();


        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
        
        

        // Print mappings to the console
        System.out.println("Mappings of ht : " + ht);
         Set<Integer> keySet=   ht.keySet();
         Iterator<Integer> itertor=keySet.iterator();
         while(itertor.hasNext()){
             Integer key=itertor.next();
            System.out.println(key+" "+ht.get(key));
         }

        // ht.keySet().stream().forEach(h->{
        //     System.out.println(ht.get(h));
        // });
       
        

    }
}
