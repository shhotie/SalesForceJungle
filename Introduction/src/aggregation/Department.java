package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Teacher> teachers;

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.teachers = new ArrayList<>();
    }

    public void addTeachers(Teacher teacher){
        teachers.add(teacher);
    }

    public void showDetails(){
        System.out.println("Department: "+ departmentName);
        System.out.println("Teachers in the department: ");
        for(Teacher obj : teachers){
            System.out.println("- " + obj.getName());
        }

//        for (Teacher object : teachers){ // teacher = [John, Smith, Ram ]
//            John // Smith // Ram
//        }

    }

}
