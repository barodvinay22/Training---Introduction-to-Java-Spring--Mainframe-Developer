class SimpleInterface{
    public static void main(String... a){
        Simple simple=new SimpleClass();
        simple.display();
    }
}
interface Simple{
    void display();
    void print();
}
class SimpleClass implements Simple{
    public void display(){
        System.out.print("Display Method");
    }
    public void print(){
        System.out.print("Print Method");
    }
}