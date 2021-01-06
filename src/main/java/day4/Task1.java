package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int razmerMassiva = scan.nextInt();

        Random random = new Random();
        random.nextInt(10);

        int[] massiv = new int[razmerMassiva];


        for (int i = 0; i < massiv.length; i++)
            massiv[i] = random.nextInt(10); // massiv[i]=(int) (Math.random()*10);

        System.out.println("Содержимое массива : " + Arrays.toString(massiv));
        System.out.println("Длина массива : " + massiv.length);

        int counter8 = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > 8)
                counter8++;
        }
        System.out.println("Количество чисел больше 8 : " + counter8);

        int counter1 = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 1)
                counter1++;
        }
        System.out.println("Количество чисел равных 1 : " + counter1);


        int counterEven = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 0)
                counterEven++;
        }
        System.out.println("Количество четных чисел : " + counterEven);

        int counterOdd = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0)
                counterOdd++;
        }
        System.out.println("Количество нечетных чисел : " + counterEven);

        int sum = 0;
        for (int i = 0; i < massiv.length; i++) {
            sum += massiv[i];
        }
        System.out.println("Сумма всех элементов массива : " + sum);
    }
}