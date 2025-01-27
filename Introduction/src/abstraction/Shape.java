package abstraction;

public abstract class Shape {
    // data members // instance var // fields // attributes // properties
    private String color;
    protected int sides;
    public String types;

    // constructor doesn't have return type
    public Shape(String color, int sides, String types){
        this.color = color;
        this.sides = sides;
        this.types = types;
    }

    // getter for private var
    public String getColor(){
        return color;
    }

    //setter
    public void setColor(String color){
        this.color = color;
    }

    public abstract void calculateArea();
}
