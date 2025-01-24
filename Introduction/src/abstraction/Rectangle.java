package abstraction;

public class Rectangle extends Shape {

    private double length;
    private double width;


    //ctor
    public Rectangle(String color, double length, double width) {
        super(color, 4, "Rectangle"); // parent
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle is = " + length * width);
    }
}
