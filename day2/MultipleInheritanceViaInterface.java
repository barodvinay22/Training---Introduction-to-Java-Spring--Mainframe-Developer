class MultipleInheritanceViaInterface{
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}

interface A{
    default void display(){
        System.out.print("A display");
    }
}
interface B{
    default void display(){
        System.out.print("B display");
    }
}
class C implements A,B{
    public void display(){
        System.out.print("C display");
    }
}