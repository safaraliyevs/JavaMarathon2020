package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите число 'x' : ");
        double x = scan2.nextDouble();
        double y;
        if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
            System.out.println("Значение y : " + y);
        } else if (x >= 5) {
            y = (x * x - 10) / (x + 7);
            System.out.println("Значение y : " + y);
        } else {
            y = 420;
            System.out.println("Значение y : " + y);
        }
    }
}
