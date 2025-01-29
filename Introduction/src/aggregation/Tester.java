package aggregation;

public class Tester {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Raj");
        Teacher teacher2 = new Teacher("Ravi");

        Department department = new Department("Computer Science");
        department.addTeachers(teacher1);
        department.addTeachers(teacher2);

        department.showDetails();
    }
}
