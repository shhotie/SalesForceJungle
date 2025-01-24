package abstraction;

public class Tester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red", 5.0, 3.0);

        System.out.println("Color of Rectangle = "+ rectangle.getColor());
        System.out.println("Type of Shape = " + rectangle.types);
        System.out.println("Sides of Shape = " + rectangle.sides);
        rectangle.calculateArea();
    }
}
