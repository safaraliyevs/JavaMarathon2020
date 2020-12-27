package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.print("Введите имя города: ");
            String cityName = scan.nextLine();
            if (cityName.equalsIgnoreCase("Stop")) {
                break;
            }
            for (int j = 0; j < 1; j++) {
                switch (cityName) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        System.out.print("Страна: Россия");
                        break;

                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.print("Страна: Италия");
                        break;

                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.print("Страна: Англия");
                        break;

                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        System.out.print("Страна: Германия");
                        break;

                    default:
                        System.out.print("Неизвестная страна");
                }
                System.out.println(" ");
            }
        }

    }
}
