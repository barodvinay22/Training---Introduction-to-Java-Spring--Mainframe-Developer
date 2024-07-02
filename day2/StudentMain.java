public class StudentMain {
    public static void main(String args[]) {
        Student s=new Student();
        s.setId(1L);
        s.setFirstName("Vinay");


        System.out.println(s);
    }
}

class Student {
    private Long id;
    private String firstName;
    private String lastName;
    Student(){ }
    Student(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return String.format("id = %s, firstName = %s, lastName = %s", id, firstName, lastName);
    }
}