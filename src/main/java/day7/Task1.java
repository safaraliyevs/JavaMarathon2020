package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2000, 20, 30000);
        Airplane airplane2 = new Airplane("Boeing", 2000, 30, 30000);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}
