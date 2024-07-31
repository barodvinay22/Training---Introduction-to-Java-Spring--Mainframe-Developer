import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemoWithCustomClass{
    static public void main(String...a){
        Map<Student,Integer> studentMap=new LinkedHashMap<>();
        studentMap.put(new Student(1,"Shyam"), 20);
        studentMap.put(new Student(2,"Ram"), 25);
        studentMap.put(new Student(1,"Shyam"), 30);
        // Traversing through the HashMap
        for (Map.Entry<Student, Integer> e : studentMap.entrySet())
                System.out.println(e.getKey() + " "
                                   + e.getValue());
    }
}
class Student{
    private Integer id;
    private String name;
    Student(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
       
        return String.format("Student id=%s, name=%s",id,name);
    }
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     Student student = (Student) o;
    //     return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    // }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}