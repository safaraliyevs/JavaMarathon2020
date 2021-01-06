package day5;

public class Car {
    private int dateOfProd;
    private String color;
    private String model;

    public void setDateOfProd(int dateOfProd) {
        if (dateOfProd< 0) {
            System.out.println("Недопустимое дата производсто автомобилья");
        } else {
            this.dateOfProd = dateOfProd;
        }
    }
    public int getDateOfProd() {
        return dateOfProd;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Укажите цвет автомобилья");
        } else {
            this.color = color;
        }
    }
    public String getColor(){
        return color;
    }

    public void setModel (String model) {
        if (model.isEmpty()) {
            System.out.println("Укажите модел автомобилья");
        }
        else {
            this.model = model;
        }
    }
    public String getModel() {
        return model;
    }
}
