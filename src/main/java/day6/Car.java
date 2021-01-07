package day6;

public class Car {
    private int dateOfProd;
    private String color;
    private String model;

    public void setDateOfProd(int dateOfProd) {
        this.dateOfProd = dateOfProd;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDateOfProd() {
        return dateOfProd;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        if (inputYear < 0) {
        } else {
            System.out.println("Недопустимое значение");
        }
        // return Math.abs(inputYear - dateOfProd);
        return inputYear - dateOfProd;
    }
}


