package constr;

public class Employee {
    private String name;
    private int id;

    public Employee() {
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(Employee e){
        this.name = e.name;
        this.id = e.id;
    }

    void display(){
        System.out.println("Name= " + name + ", ID=" + id);
    }
}
