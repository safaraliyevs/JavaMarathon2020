package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane=new Airplane("Boeing", 2000, 20, 30000);
        airplane.setYear(2010);
        airplane.setLength(30);

        airplane.fillUp(1500);
        airplane.fillUp(1500);

        airplane.info();

    }
}
