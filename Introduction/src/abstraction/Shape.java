package abstraction;

public abstract class Shape {
    // Private data member (accessible through getter and setter methods)
    private String color;

    // Protected data member (accessible in subclasses)
    protected int sides;

    // Public data member
    public String type;

    // Constructor to initialize the shape
    public Shape(String color, int sides, String type) {
        this.color = color;
        this.sides = sides;
        this.type = type;
    }

    // Getter for the private data member
    public String getColor() {
        return color;
    }

    // Setter for the private data member
    public void setColor(String color) {
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    public abstract void calculateArea();
}
