package Abstraction;

import org.w3c.dom.ls.LSOutput;

//abstract class Shape with an abstract method calculateArea().
abstract class shape{
    abstract double calculateArea();
}
// subclass Circle
class circle extends shape{
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI*radius*radius ;
    }
}
// subclass Rectangle
class rectangle extends shape{
    private double height;
    private double width;
    public rectangle(double height,double width) {
        this.height=height;
        this.width=width;
    }

    @Override
    double calculateArea() {
        return width*height;
    }
}

public class calculateArea
{
    public static void main(String[] args) {
        shape circle=new circle(12.3);
        shape rectangle=new rectangle(12,45);

        System.out.println("Area of Circle ="+circle.calculateArea());
        System.out.println("Area of Rectangle ="+rectangle.calculateArea());
    }


}
