//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else {
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
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }



        year = 2000;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Данный год является вискокосным");
                } else {
                    System.out.println("Данный год не является високосным");
                }
            } else {
                System.out.println("Данный год является вискокосным");
            }
        } else {
            System.out.println("Данный год не является високосным");
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

        switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6: ;
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Ошибка, месяц неправильно выбран");
                    break;
        }
    }
}