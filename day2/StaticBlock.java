// static block
class Main{
    public static void main(String... a){
        for(int i=0;i<5;i++){
            Employee employee=new Employee();
        }
    }
}

class Employee{
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Block");
    }
}