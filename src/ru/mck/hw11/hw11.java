package ru.mck.hw11;

import java.time.LocalDate;

public class hw11 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача №1");
        int year = 2024;
        determineYear(year);

    }

    public static void determineYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    public static void task2() {
        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        determineVersion(clientOS, clientDeviceYear);
    }

    public static void determineVersion(int oS, int year) {
        int limitYear = LocalDate.now().getYear();
        if (oS == 0 && year >= limitYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oS == 0 && year < limitYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oS == 1 && year >= limitYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача №3");
        int deliveryDistance = 101;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        printDevileryDays(deliveryDays);
    }

    public static int calculateDeliveryDays(int distance) {
        int result = 1;
        if (distance > 20) {
            result++;
        }
        if (distance > 60) {
            result++;
        }
        if (distance > 100) {
            result = -1;
        }
        return result;
    }


    public static void printDevileryDays(int devileryDays) {
        if (devileryDays < 1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + devileryDays);

        }
    }

}
