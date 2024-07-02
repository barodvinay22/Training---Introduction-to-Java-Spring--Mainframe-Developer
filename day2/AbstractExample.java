// Abstract Class Example

class Main{
    public static void main(String... a){
        Shape s=new Circle();
        s.display();
        System.out.println(s.area(3));
        s=new Rectangle();
        s.display();
        System.out.println(s.area(5,10));
    }
}

abstract class Shape{
    private String shapeName;
    Shape(String name){
        shapeName=name;
    }
    abstract double area(double... dimension);
    void display(){
        System.out.println("Shape = " +  shapeName);
    }
}
class Circle extends Shape{
    Circle() {
        super(Circle.class.getName());
    }

    // double area(double... d){
    //     return 2*3.14*d[0];
    // }
}
class Rectangle extends Shape{
    Rectangle(){
        super(Rectangle.class.getName());
    }
    double area(double... d){
        return d[0]*d[1];
    }
}