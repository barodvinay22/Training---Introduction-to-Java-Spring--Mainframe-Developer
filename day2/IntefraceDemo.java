// Interface Demo 
public class InterfaceDemo{
    public static void main(String... args){
        SbiBank sbiBank = new SbiBank();
        System.out.println(d.sbiBank);
        sbiBank.account();
        sbiBank.loan();
        sbiBank.deposit();
        sbiBank.withdraw();
    }
}
// Level 1
interface Bank {
    String bankName="SBI";
    void deposit();
    void withdraw();
    void loan();
    void account();
}

// Level 2
abstract class SbiDepositeBankUnit implements Bank {
    public void deposit()
    {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class SbiDepositeWithdrawUnit extends Dev1 {
    public void withdraw()
    {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// Level 3
class SbiBank extends SbiDepositeWithdrawUnit {
    public void loan() {}
    public void account() {}
}