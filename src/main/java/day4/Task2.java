package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[100];

        Random random = new Random();
        for (int i = 0; i < massiv.length; i++)
            massiv[i] = random.nextInt(10000);

        System.out.println(Arrays.toString(massiv));

        int max = 0;         // наибольший элемент массива
        for (int element : massiv) {
            if (element > max)
                max = element;
        }
        System.out.println("Наибольший элемент массива : "+max);

        int min = 10000;    // наименьший элемент массива
        for (int element : massiv) {
            if (element < min)
                min = element;
        }
        System.out.println("Наименьший элемент массива : "+min);

        int counter = 0;           // Количество элементов оканчивающихся  на 0 ;
        for (int element : massiv) {
            if (element % 10 == 0)
                counter++;
        }
        System.out.println("Количество элементов оканчивающихся  на 0 : "+counter);

        int sum = 0;           // Сумма элементов оканчивающихся  на 0 ;
        for (int element : massiv) {
            if (element % 10 == 0)
                sum += element; // sum=sum+element;
        }
        System.out.println("Сумма элементов массива оканчивающихся  на 0 : "+sum);

    }
}
