package constr;

import encapsulation.Student;

public class Teacher {
    private String name;
    private String subject;

    //default ctor
    public Teacher() {
    }

    public Teacher(String name){
        this.name = name;
    }

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    // copy ctor
    public Teacher(Teacher teacher){
        this.name = teacher.name;
        this.subject= teacher.subject;
    }

    public String getName(){
        return name;
    }

}
