package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Введите делимое : ");
            double a = scan.nextDouble();

            System.out.println("Введите делитель : ");
            double b = scan.nextDouble();

            System.out.println(a / b);

            if (b == 0) {
                System.out.println("Деление на 0 ");
                continue;
            }
        }

    }
}
