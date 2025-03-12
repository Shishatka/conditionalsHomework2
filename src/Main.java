//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int year = 2014;
        if (year < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (year < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (year >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else if (year >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int year2 = 2000;
        if (year2 % 400 == 0) {
            System.out.println("Данный год является вискокосным");
        }
        else if (year2 % 100 == 0) {
            System.out.println("Данный год не является високосным");
        }
        else if (year2 % 4 == 0) {
            System.out.println("Данный год является високосным");
        }

        int deliveryDistance = 95;
        System.out.print("Потребуется дней: ");
        if (deliveryDistance <= 20) {
            System.out.println("1");
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("2");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("3");
        }
        else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 12;

        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Зима");
                case 2:
                    System.out.println("Зима");
                case 3:
                    System.out.println("Весна");
                case 4:
                    System.out.println("Весна");
                case 5:
                    System.out.println("Весна");
                case 6:
                    System.out.println("Лето");
                case 7:
                    System.out.println("Лето");
                case 8:
                    System.out.println("Лето");
                case 9:
                    System.out.println("Осень");
                case 10:
                    System.out.println("Осень");
                case 11:
                    System.out.println("Осень");
                case 12:
                    System.out.println("Зима");
            }
        }
        else {
            System.out.println("Ошибка, месяц неправильно выбран");
        }
    }
}