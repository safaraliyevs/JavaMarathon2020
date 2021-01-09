package day8;

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

    @Override
    public String toString() {
        return "Изготовитель: " + producer + "\nГод выпуска: " + year + "\nДлина: " + length +
                "\nВес: " + weight + "\nОбъем топлива в баке: " + fuel;
    }

}
