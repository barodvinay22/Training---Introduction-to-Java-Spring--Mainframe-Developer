// is  a relationship
// Association 
// Aggregation 

class Main{
    public static void main(String args[]){
        Person person=new Student("Vinay","Barod",1,"CS");
        System.out.println(person);
    }
}

class Person{  // Base Class 
    private String firstName;
    private String lastName;
    Person(){
        System.out.println("Person Constructor");
    }
    Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
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
    
}
class Student extends Person{ // Derived Class
    private int studentId;
    private String courseEnrolled;
    Student(){
        // super();
        System.out.print("Student Constructor");
    }
    public Student(String firstName, String lastName, int studentId, String courseEnrolled){
        //super(firstName, lastName);
        this.studentId=studentId;
        this.courseEnrolled=courseEnrolled;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getCourseEnrolled() {
        return courseEnrolled;
    }
    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }
    @Override // Java 5 
    public String toString() {
        return "Student firstName "+ getFirstName()+" lastName"+ getLastName()+" studentId "+studentId+" coruseEnrollerd "+ courseEnrolled;
    }
}
// class Faculty extends Person{
//     private int facultyId;
//     private String specialization;
//     public int getFacultyId() {
//         return facultyId;
//     }
//     public void setFacultyId(int facultyId) {
//         this.facultyId = facultyId;
//     }
//     public String getSpecialization() {
//         return specialization;
//     }
//     public void setSpecialization(String specialization) {
//         this.specialization = specialization;
//     }
    
// }