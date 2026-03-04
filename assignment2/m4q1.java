package assignment2;
abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    @Override
    double area() {
        return length * width;
    }
}
public class m4q1 {

    public static void main(String[] args) {
       Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
    
}
