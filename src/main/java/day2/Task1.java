package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число этажей: ");
        int a = scan1.nextInt();
        if (a >= 1 && a <= 4) {
            System.out.println("Это малоэтажный дом");
        } else if (a >= 5 && a <= 8) {
            System.out.println("Это среднеэтажный дом");
        } else if (a >= 9) {
            System.out.println("Это многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
