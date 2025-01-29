package association;

public class Car {
    private Engine engine;

    public Car(String engineType){
        this.engine = new Engine(engineType);
    }

    public void showDetails(){
        System.out.println("Car has a engine of type: " + engine.getType());
    }
}
