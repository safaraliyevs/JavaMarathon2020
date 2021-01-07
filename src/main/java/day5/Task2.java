package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike=new Motorbike(2010, "Army", "Газель");
        System.out.println("Дата производства мотоцикла : " + motorbike.getManufactureDate()+"\n"+
                "Цвет мотоцикла : "+motorbike.getColor()+"\n"+
                "Модель мотоцикла : "+motorbike.getModel());
    }
}
