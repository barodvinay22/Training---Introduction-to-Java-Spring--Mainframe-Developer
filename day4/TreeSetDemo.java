// Java program to demonstrate the
// working of a TreeSet
import java.util.*;

public class TreeSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        Set<Student> ts = new TreeSet<>();

        ts.add(new Student(10,"Rajesh"));
        ts.add(new Student(1,"Akash"));
        ts.add(new Student(2,"Suresh"));
        ts=new HashSet<>();
        ts.add(new Student(10,"Rajesh"));
        ts.add(new Student(1,"Akash"));
        ts.add(new Student(2,"Suresh"));
        // Traversing elements
        Iterator<Student> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
public class Student implements Comparable<Student>{

    private Integer id;
    private String name;
    @Override
    public int compareTo(Student o) {
      
        return 0;
    }
    Student(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {

        return "Student = "+id+" "+name;
    }
}