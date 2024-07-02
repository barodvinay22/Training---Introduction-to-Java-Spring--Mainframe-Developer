// Interface Demo 
public class InterfaceDemo{
    public static void main(String... args){
        Bank d = new Dev3();
        System.out.println(d.bankName);
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}
// Level 1
interface Bank {
    String bankName="SBI";//final public 
    void deposit();// public abstract
    void withdraw();
    void loan();
    void account();
}

// Level 2
abstract class Dev1 implements Bank {
    @Override
    public void deposit()
    {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class Dev2 extends Dev1 {
    public void withdraw()
    {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// Level 3
class Dev3 extends Dev2 {
    public void loan() {}
    public void account() {}
}