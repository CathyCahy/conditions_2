public class Main {
    public static void main(String[] args) {

        // Задача 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Установите версию приложения для iOS по ссылке");

        // Задача 2
        int clientDeviceYear = 2013;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            }
        }

        // Задача 3
        int year = 2019;
        if (year >= 1584) {
            if ((year % 4 == 0) && (year % 100 !=0)) {
                System.out.println(year +" год является високосным");
            }
            else System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 25;
        int days = 1;
        if (deliveryDistance<=100) {
            if (deliveryDistance<=20) {
                System.out.println("Потребуется дней: " + days);
            }
            days = days+1;
            if (deliveryDistance>20 && deliveryDistance<=60) {
                System.out.println("Потребуется дней: " + days);
            }
            days = days+1;
            if (deliveryDistance>60 && deliveryDistance<=100) {
                System.out.println("Потребуется дней: " + days);
            }
        }
        else System.out.println("Доставки нет.");

        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case (1):
                System.out.println(monthNumber + "-й месяц принядлежит сезону зима");
                break;
            case (2):
                System.out.println(monthNumber + "-й месяц принядлежит сезону зима");
                break;
            case (3):
                System.out.println(monthNumber + "-й месяц принядлежит сезону весна");
                break;
            case (4):
                System.out.println(monthNumber + "-й месяц принядлежит сезону весна");
                break;
            case (5):
                System.out.println(monthNumber + "-й месяц принядлежит сезону весна");
                break;
            case (6):
                System.out.println(monthNumber + "-й месяц принядлежит сезону лето");
                break;
            case (7):
                System.out.println(monthNumber + "-й месяц принядлежит сезону лето");
                break;
            case (8):
                System.out.println(monthNumber + "-й месяц принядлежит сезону лето");
                break;
            case (9):
                System.out.println(monthNumber + "-й месяц принядлежит сезону осень");
                break;
            case (10):
                System.out.println(monthNumber + "-й месяц принядлежит сезону осень");
                break;
            case (11):
                System.out.println(monthNumber + "-й месяц принядлежит сезону осень");
                break;
            case (12):
                System.out.println(monthNumber + "-й месяц принядлежит сезону зима");
                break;
            default: System.out.println("Месяца с номером " + monthNumber + " не существует");
        }

    }
}