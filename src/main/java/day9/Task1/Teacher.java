package day9.Task1;

import day9.Task1.Human;

public class Teacher extends Human {
    private String subjectName;
    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName=subjectName;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот человек с именем "+getName());
        System.out.println("Этот преподователь с именем "+getName());
    }
}
