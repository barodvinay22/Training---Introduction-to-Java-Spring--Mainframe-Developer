import java.io.*;    
class MethodOverridigWithCheckedException{
    public static void main(String args[]) {    
        Parent p = new TestExceptionChild(); 
        try{
          p.msg();    
        } catch(Exception exception){
          System.out.print(exception.getMessage());
        }
       
       }
}


class Parent{   
  
  // defining the method   
  void msg() throws IOException{  
    System.out.println("parent method");  
    }    
}    
    
public class TestExceptionChild extends Parent{    
  
  // overriding the method in child class  
  // gives compile time error  
  void msg() {  
    
      System.out.println("TestExceptionChild");    
    
    
  }  
      
}    