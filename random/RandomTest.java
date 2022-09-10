package random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean i = rnd.nextBoolean();
        System.out.println(i);

        int a = rnd.nextInt(5); //0...4
        System.out.println(a);
        //(max - min) + min
        // -10  ....7
        int s = rnd.nextInt(7 + 10) - 10;
        System.out.println(s);
        // сгенерить 20 случайных чисел от 3 до 17


        for (int j = 0; j < 20; j++) {
            int q = rnd.nextInt(17 - 3) + 3;

            System.out.print(q + " ");
        }
        // 26 случ  чисел от -32 до 15. Напечатать только нечетные
        System.out.println();
        for (int w = 0; w < 26; w++) {
            int t = rnd.nextInt(15 + 32) - 32;
            if (t % 2 != 0)
                System.out.print(t + " ");

        }
        System.out.println();


        //сгенерить 140 случ чисел от 0 до 170. Если число кратно 3 товывести  это число и что оно кратно 3. Тоже для 5 и 15, НО
        //если  число кратно 15, то выводить что оно кратно 3 и 5 не надо.

        for (a = 0; a < 140; a++) {
            int f = rnd.nextInt(170) + 1;
            if (f % 15 == 0) {
                System.out.println("Число " + f + " кратно 15");
//                continue;
            } else if (f % 3 == 0) {
                System.out.println("Число " + f + " кратно 3");
            } else if (f % 5 == 0) {
                System.out.println("Число " + f + " кратно 5"); //когда выпадает 0, тоже пишет кратность
            }
        }


        System.out.println();


        // генрить случайные числа от -34 до 41 пока не выпадет 0
        int r;
        for (r = -123; r <= 5; r--) {
            int b = rnd.nextInt(41 + 34) - 34; // не останавливается при выпадении 0 и не генерирует последнее число 41
            System.out.print(b + " ");
            if (b == 0) {
                break;
            }

        }
        System.out.println();
        System.out.println();

        //  сгенерить 26 случайных букв

        for (int m = 0; m < 26; m++) {
            int l = rnd.nextInt(2);
            if (l <= 0) {
                char str = (char) (rnd.nextInt(90 - 65) + 65);

                System.out.print(str);
            } else {

                char str = (char) (rnd.nextInt(122 - 97) + 97);
                System.out.print(str);
            }
        }
        System.out.println();

        for (int m = 0; m < 26; m++)
            System.out.print((char) (rnd.nextInt(2) <= 0 ? rnd.nextInt('z' - 'a') + 'a' : rnd.nextInt('Z' - 'A') + 'A'));

        System.out.println();
        System.out.println();

        // сгенерить 20 случ  чисел от -12 до 18. Найти максимум и минимум
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int o = 0; o < 20; o++) {
            int k = rnd.nextInt(18 + 12) - 12;
            System.out.print(k + " ");
            if (k < min)
                min = k;

            if (k > max)
                max = k;
        }
        System.out.print("Maximum is " + max + " ," + " Minimum is " + min + " ");
        System.out.println();
        System.out.println();


// сгенерировать 29 случ  буленей в пропорции 1 к 3 (1 тру на 3 фолс)


        for (int z = 0; z < 29; z++) {

            System.out.print(" " + (rnd.nextInt(3) == 0));
        }

        System.out.println();
        for (int z = 0; z < 29; z++) {
            int t = rnd.nextInt(3);
            boolean f3times = rnd.nextBoolean();

            if (t == 0) {
                f3times = true;

                System.out.print(true);

            } else {
                System.out.println(false);
            }

        }

        System.out.println();
        System.out.println();
//  сгенерить 30 случ  чисел от -34 до 29. Напечатать только то, что не входит в диапазоны от -28 до -14  и диапазон от 10 до 20

        for (int v = 0; v <= 30; v++) {
            int d = rnd.nextInt(29 + 34) - 34;
            if (d <= -28 || d >= -14 && d <= 10 || d >= 20) {
                System.out.print(d + " ");
            }
        }


        for (int z = 0; z <= 10; z++) {
            int q = rnd.nextInt(11);
            System.out.println(q);
        }
        System.out.print((int) (Math.random() * 10));
    }
}











