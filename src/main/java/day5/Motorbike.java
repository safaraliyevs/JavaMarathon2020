package day5;

public class Motorbike {
    private int manufactureDate;
    private String color;
    private String model;

    public Motorbike(int manufactureDate, String color, String model) {
        this.manufactureDate=manufactureDate;
        this.color=color;
        this.model=model;
    }

    public int getManufactureDate() {
        return manufactureDate;
        }

    public String getColor() {
        return color;
        }

    public String getModel() {
        return model;
    }
}
