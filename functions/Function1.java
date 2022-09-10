package functions;

import java.util.Arrays;

public class Function1 {
    // ф-я принимает 2 инта и создает массив с числами от первого до второго, даже если они и наоборот
    public static void createArray(int a, int b) {
        int length;
        int[] array = new int[b - a + 1];

        for (int v = 0; v <= array.length; v++) {
            length = b - a + 1;

        }
        System.out.println(Arrays.toString(array));
    }

    //1) ф-я принимает инт   и находит сумму его цифр
    public static void sum(int y) {
        int num = 0;
        while (y / 10 != 0) {
            num += y % 10;
            y /= 10;// y = y/10
        }
        System.out.println("Сумма цифр числа y " + (y + num));
    }

    // 2)ф-я принимает 2д-массив и создает его копию

    public static void copy2d(int[][] array2d) {
        int[][] copy2d = new int[array2d.length][];

        for (int q = 0; q < array2d.length; q++) {
            copy2d[q] = new int[array2d[q].length];
            for (int e = 0; e < array2d[q].length; e++) {
                copy2d[q][e] = array2d[q][e];
            }
        }
        for (int j = 0; j < copy2d.length; j++) {
            for (int l = 0; l < copy2d[j].length; l++) {
                System.out.print(copy2d[j][l] + " ");
            }
            System.out.println();
        }
    }

    //ф-я принимает целое и находит количество в нем цифр. И наибольшую цифру с него
    public static void quantity(int a) {

        int number1 = 0;
        int max = Integer.MIN_VALUE;

        for (; a != 0; a /= 10) {
            number1++;
            int data = a % 10;
            if (data > max) {
                max = data;
            }
        }
        System.out.println("цифр в числе " + number1);
        System.out.println("наибольшее число " + max);
    }

    //1) принимаем целое  число и определяем или оно простое
    public static void plain(int a) {
        boolean prime = true;
        for (int b = 2; b < a; b++) {
            if (a % b == 0) { // условие для не простого числа
                prime = false;
                break;
            }
        }
        if (prime == true) {
            System.out.println(a + " Число простое");
        } else {
            System.out.println(a + " Число сложное");
        }
    }

    //2 принимаем 2д массив и 2 инта - номера  столбцов, значения которых надо обменять
    public static void swap(int[][] ar2d, int e, int f) {
        for (int s = 0; s < ar2d.length; s++) {
            for (int h = 0; h < e; h++) {
                int temp = ar2d[s][e];
                ar2d[s][e] = ar2d[s][f];
                ar2d[s][f] = temp;
            }
        }
        for (int c2 = 0; c2 < ar2d.length; c2++) {
            for (int g = 0; g < ar2d[c2].length; g++) {
                System.out.print(ar2d[c2][g] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("before function");
        print();
        System.out.println("after function");
        print();
        print("vasya", 6);
        createArray(2, 5);
        sum(2935);

        int[][] array2d = {{3, 6, 4, 1},
                {68, -75, -6, 7},
                {-50, -1, 2, 7},
                {-8, 21, 58, 0}};
        copy2d(array2d);
        quantity(58469);
        plain(9);
        int[][] ar2d = {{53, -27, 4, 1},
                         {68, -75, -6, 7},
                         {18, 1, 2, 78},
                         {8, 21, 58, 0, 89}};
        swap(ar2d, 1, 3);
    }

    public static void print() {
        for (int i = 0; i < 4; i++) {
            System.out.println("hello");
        }
    }

    public static void print(String text, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(text);
        }
    }
}
