package day7;

public class Airplane {
    private String producer;
    private int year, length, weight, fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getLength() {
        return length;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * public void setFuel(int fuel) {
     * this.fuel = fuel;
     * }
     **/

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }
    // “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”

    public void info() {
        System.out.println("Изготовитель: " + producer + "\nГод выпуска: " + year + "\nДлина: " + length +
                "\nВес: " + weight + "\nОбъем топлива в баке: " + fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
