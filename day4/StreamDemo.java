import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


class StreamDemo{

    public static void main(String args[]){
        
        // List<String> strings=Arrays.asList(args);
        // System.out.println(strings);
        
        // Long count=strings.stream().map(s-> Integer.parseInt(s)).filter(s-> s%2==0).sorted((s1,s2)->s2-s1).collect(Collectors.counting());
        // System.out.println(count);

        List<Student> students=Arrays.asList(new Student(10,"Akash"),new Student(20,"Rahul"),new Student(1,"Aman"));
        List<String> studentName=students.stream().map(Student::getName).sorted().collect(Collectors.toList());
        students.stream().groupingBy(Student::getId,Function.identity());
        //System.out.println(mapStudent);
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

}