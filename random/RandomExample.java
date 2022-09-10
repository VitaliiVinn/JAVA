package random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rnd = new Random();
        // 20 случ  чисел от -10 до 10. Сколько нечетных?
        int counter = 0;
        for (int a = -10; a < 11; a++) {
            int b = rnd.nextInt(11 + 10) - 10;
            System.out.print(b + " ");
            if (b % 2 != 0) {
                counter = counter + 1;

            }
        }
        System.out.println("Нечетных " + counter);
        System.out.println();
        // сгенерить 22 случ  буленя. Кого больше - тру или фолс?
        int counter1 = 0;
        int counter2 = 0;
        for (int c = 0; c < 22; c++) {
            boolean d = rnd.nextBoolean();
            System.out.print(d + " ");
            if (d == true) {
                counter1++;

            } else if (d == false) {
                counter2++;

            }
        }
        if (counter1 > counter2) {
            System.out.println("True больше чем False и составляет " + counter1);
        } else if (counter1 == counter2) {
            System.out.println("False и True одинаково и составляет " + counter2);
        } else {
            System.out.println("False больше чем True и составляет " + counter2);
        }

        // 1( сгенерить 10 случ  чисел от -14 до 7. Найти следнее арифметическое всег чисел
        int sum2 = 0;
        for (int d = 0; d < 10; d++) {
            int e = rnd.nextInt(8 + 14) - 14;
            System.out.print(e + " ");
            sum2 += e;
        }
        System.out.println("Сумма " + sum2);
        float f = (float) sum2 / 10;
        System.out.println("Среднее арифметическое " + f);

        System.out.println();
        // 2) сгенерировать 20 случ  чисел от -13 до 14. Кого больше - отрицательных или нечетных?
        int counter3 = 0;// отрицательные числа
        int counter4 = 0;// нечетные числа

        for (int g = 0; g < 20; g++) {
            int h = rnd.nextInt(15 + 13) - 13;
            System.out.print(h + " ");
            if (h < 0) {
                counter3++;

            }
            if (h % 2 != 0) {
                counter4++;

            }

        }
        System.out.println("\nОтрицательных " + counter3 + " чисел");
        System.out.println("Нечетных " + counter4 + " чисел");
        if (counter3 > counter4) {
            System.out.println("Отрицательных чисел больше, чем нечетных");
        } else if (counter3 == counter4) {
            System.out.println("Нечетных и отрицательных чисел одинаковое количество");
        } else {
            System.out.println("Нечетных чисел больше, чем отрицательных");
        }

        System.out.println();
        // 3) сгенерировать 20 случайных букв. Сколько было гласных?
        counter = 0;

        for (int i = 0; i < 20; i++) {
            char j = (char) (rnd.nextInt(90 - 65) + 65);

            System.out.print(j + " ");
            if (j == 65 || j == 69 || j == 73 || j == 74 || j == 79 || j == 81 || j == 85 || j == 89) {
                counter++;
            }
        }

        System.out.println("\nБыло " + counter + " гласных");
        System.out.println();
        // 4) сгенерить 40 символов в диапазоне интов от 37 до 127. Сколько символов цифр выпадало?
        int counter6 = 0;

        for (int l = 0; l < 40; l++) {
            char m = (char) (rnd.nextInt(128 - 37) + 37);

            System.out.print(m + " ");
            if (m >= 48 && m <= 57) {
                counter6++;
            }
        }
        System.out.print("Выпало " + counter6 + " символов 'цифр'");
        //сгенерить 10 случайных чисел от 0 до 15 вайлом

            int h = 0;
            while (h < 10) {
                int c = rnd.nextInt(16);
                System.out.println(c + " ");
                h++;
            }


    }
}
