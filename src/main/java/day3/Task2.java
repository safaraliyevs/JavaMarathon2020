package day3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите делимое число : ");
            double a = scan.nextDouble();
            System.out.println("Введите делитель : ");
            double b = scan.nextDouble();
            if (b == 0) {
                break;
            }
            System.out.println(a / b + "\n");
        }

    }
}
