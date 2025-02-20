package org.example;

public class Main {

    public static void main(String[] args) {
      /* print();
        sum();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(7, 9));
        checkNumber(9);
        isPositive(-2);
        printString("Hello", 4);
        System.out.println((isLeapYear(2019) ? "true" : "false"));*/
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 1};
        printArray(array);
    }

    static void print() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void sum() {
        checkSumSing();
    }

    static void checkSumSing() {
        int a = 10;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 36;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 13;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным.");
        } else {
            System.out.println("Число " + number + " является отрицательным.");
        }
    }

    public static void isPositive(int number) {
        System.out.println((number >= 0) ? "true" : "false");
    }

    public static void printString(String str, int number) {
        for (int i = 0; i < number; i = i + 1) {
            System.out.println(str);
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}