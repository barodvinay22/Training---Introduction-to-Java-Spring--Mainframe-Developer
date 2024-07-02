 
class MethodOverridigWithUncheckedException{
    public static void main(String args[]) {    
        Parent p = new TestExceptionChild();    
        p.msg();    
       }
}


class Parent{   
  
  // defining the method   
  void msg() {  
    System.out.println("parent method");  
    }    
}    
    
public class TestExceptionChild extends Parent{    
  
  // overriding the method in child class  
  // gives compile time error  
  void msg() throws ArithmeticException {    
    System.out.println("TestExceptionChild");    
  }  
      
}    