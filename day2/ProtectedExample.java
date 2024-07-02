class ProtectedExample{
    public static void main(String args[]){
        CsStudents csStudents=new CsStudents();
        
        System.out.print( csStudents.displayAge());
       
    }
}
class Person{
    protected int age=10;
    public int displayAge(){
        return age;
    }
}
class Student extends Person{
 
    public int displayAge(){
        return age;
    }
}
class CsStudents extends Student{//Mutiple

}