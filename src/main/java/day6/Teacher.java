package day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        // int randomMark = 2 + (int) (Math.random() * 4);

        String mark = "";
        switch (randomValue) {
            case 2:
                mark = "Неудовлетворительно";
                break;
            case 3:
                mark = "Удовлетворительно";
                break;
            case 4:
                mark = "Хорошо";
                break;
            case 5:
                mark = "Отлично";
                break;
        }


    System.out.println("Преподаватель "+this.fio+
            " оценил студента с именем "+student.getFio()+" по предмету " +this.subject+ " на оценку "+ mark);
    }
}