package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDateOfProd(1965);
        car.setColor("white");
        car.setModel("Pobeda");

        Motorbike motorbike=new Motorbike(2018,"red", "Kawasaki");
        car.info();
        motorbike.info();

        System.out.println("Разница годами производства автомобилья :"+car.yearDifference(1900));
        System.out.println("Разница годами производства мотоцикля :"+motorbike.yearDifference(2020));
    }
}