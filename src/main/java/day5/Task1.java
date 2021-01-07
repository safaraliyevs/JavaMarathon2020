package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setDateOfProd(2005);
        car1.setColor("Black");
        car1.setModel("Niva");
        System.out.println("Дата производства автомобиля : "+car1.getDateOfProd()+"\n"+"Цвет автомобиля : "
                +car1.getColor()+"\n"+"Модель автомобиля : "+car1.getModel());

    }
}
