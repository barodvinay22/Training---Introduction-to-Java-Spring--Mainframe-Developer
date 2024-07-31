import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class IntegerArrayList{
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(2,3,1,5,10,4,9);
        Collections.sort(list);
        System.out.println(list);
        List<Student> students=Arrays.asList(new Student(3,"rahul","CS"),new Student(1, "akash", "IT"),
        new Student(2,"shyam","EE"));
        Collections.sort(students);
        System.out.println(students);
    }
}

class Student implements Comparable{
    private Integer id;
    private String name;
    private String courseEnrolled;
    
    @Override
    public int compareTo(Object o) {
        Student student=(Student) o;
        return (student.name).compareToIgnoreCase(this.name);
    }
    Student(Integer id, String name,String courseEnrolled){
        this.id=id;
        this.name=name;
        this.courseEnrolled=courseEnrolled;
    }
    public String toString(){
        return String.format("Student id = %s, name = %s, courseEnrolled = %s",id,name,courseEnrolled);
    }
}