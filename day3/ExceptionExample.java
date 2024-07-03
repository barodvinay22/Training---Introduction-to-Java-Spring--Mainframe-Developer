public class ExceptionExample {
  public static void main(String args[]) {
    try {
      // code that may raise exception
      int dividend=Integer.parseInt(args[0]);
      int data = 100 /dividend ;
      System.out.println("Inside Try block");
     } 
    //  finally{
    //    System.out.println("Inside finally block");
    //  }
     catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
     }
    //catch(Exception ex){
    //   System.out.println("Inside Parent Exception block");
    // } 
   
    // rest code of the program
    // System.out.println("Out of Try Catch Block");
  }
}

// try catch finally throw throws