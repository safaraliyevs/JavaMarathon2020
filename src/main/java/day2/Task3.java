package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число 'a' : ");
        int a = scan1.nextInt();
        System.out.println("Введите число 'b' : ");
        int b = scan1.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (a < b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
            a = a + 1;
        }
    }
}
