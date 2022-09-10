package loops;

public class ForLoop {
    public static void main(String[] args) {
        // напечатать в одной строке все числа от -12 до 32 с шагом 4
        int i;

        for (i = -12; i <= 32; i = i + 4) {

            System.out.print(i + " ");
        }
        System.out.println();
        //от -3 до -32 шаг 3
        int a;

        for (a = -3; a >= -32; a = a - 3) {
            System.out.print(a + " ");
        }
        System.out.println();
        //числа от 43.6  до -5.35  шаг 4.4
        double b;
        for (b = 43.6; b >= -5.35; b = b - 4.4) {
            System.out.print(b);
        }
        System.out.println();
        double j = 4.63649567; // 4.636

        System.out.println(Math.round(j * 1000) / 1000.0);
        System.out.println(2.51 - 1.32);
        //цикл от -6 до 14 шаг 1, напечатать только числа -3   4   и 11

        for (i = -6; i <= 14; i++) {
            if (i == -3 || i == 4 || i == 11) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // тоже, но кроме  этих чисел
        for (i = -6; i <= 14; i++) {
            if (i != -3 && i != 4 && i != 11) {
                System.out.print(i + " ");
            }

            System.out.println();
            // цикл от -12 до 23 шаг 1. напечатать только кратные 3 числа


            for (i = -12; i <= 23; i++ ) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }

            }
            System.out.println();
            // цикл от 76 до -32 шаг 3. Напечатать только то, что не входит в диапазон от 50 до  -16

            for (i = 76; i >= -32; i = i - 3) {
                if (i > 50 || i < -16) { // вопрос || &&, & |
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            int z = 0;
            System.out.println(z != 0 && 34 / z > 5);
            System.out.println(3 < 10 || z==45);
            // цикл от -20 до 45 шаг 1. Напечатать все, что входит в диапазоны от -7 до 6   и от 23 до 41

            for (i = -20; i <= 45; i++) {
                if (i >= -7 && i <=6 || i >= 23 && i <= 41) { // перенести часть ответа
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        }
    }
}
