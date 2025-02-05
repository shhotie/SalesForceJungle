package constr;

public class Tester {
    public static void main(String[] args) {
        Teacher techer1 = new Teacher("Smith");
        Teacher techer2 = new Teacher("Smith", "English");

        //Default Ctor
        Employee emp1 = new Employee();

        //Parametrized Ctor
        Employee emp2 = new Employee("Akshay", 101);

        //Copy Ctor
        Employee emp3 = new Employee(emp2);

        emp1.display();
        emp2.display();
        emp3.display();


    }
}
