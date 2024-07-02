public class VargArgs{
    static public void main(String args[]){
       // int float char and double -- primitive data type
        // Integer Float Char And Double
        int sum=0;
        for(String s:args){
            System.out.println(s.getClass());
            Integer i= Integer.parseInt(s);// AutoBoxing And Unboxing 
            
            int x=0;
          
            sum+=i;
        }
        System.out.println(sum);
    }

}