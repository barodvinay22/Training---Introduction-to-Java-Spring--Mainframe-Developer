public class FunctionalInterfaceDemo{
    static public void main(String[] args){
        // Demo demo=new Demo(){
        //     @Override
        //     public void display(){
        //         System.out.println("Demo");
        //     }
        // };
        Demo demoLamda=(String message)-> System.out.println(message);
        demoLamda.display("Hello Lamda");

    }
}
@FunctionalInterface// Annotation 
interface Demo{
    void display(String message);

}
// class DemoImpl implements Demo{

//     @Override
//     public void display() {
//         System.out.println("Demo");
        
//     }
    
// }