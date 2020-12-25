package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 'а' : ");
        int a = scan.nextInt();
        System.out.println("Введите число 'b' : ");
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = a; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
