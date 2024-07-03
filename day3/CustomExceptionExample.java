class CustomExceptionExample{
    public static void main(String...args) throws Exception
    {
        // try{
            throw new CustomException("Custom Exception");
        // }catch(CustomException cs){
        //     System.out.print(cs.getMessage());   
        // }
    }
}
class CustomException extends Exception{
   
    CustomException(String message){
        super(message);
      
    }

}
