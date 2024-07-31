import java.io.Serializable;
public class Student implements Serializable
{

    private Integer id;
    private String name;
    private Integer age;
    private  transient Long phoneNumber;
    private String courseEnrolled;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getCourseEnrolled() {
        return courseEnrolled;
    }
    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }
    @Override
    public String toString() {
        //return "Student Details Id "+id + " Name "+ name+" Age "+age+" "+" Phone Number"+ phoneNumber;
        return "Student Details Id "+id + " Name "+ name+" Age "+age+" "+" Phone Number"+ phoneNumber+" courseEnrolled "+courseEnrolled;
    }
}