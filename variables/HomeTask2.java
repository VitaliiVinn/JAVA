package variables;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целых три числа");

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        int b1 = 2;

        double d = Math.pow(b,b1) - 4 * a * c;
        if (d > 0) {
            System.out.println("x = " + ((-b + Math.sqrt(d))/(2 * a)));
            System.out.println("x = " + ((-b - Math.sqrt(d))/(2 * a)));
        }
        if (d == 0) {
            System.out.println("x = " + (- b/2 * a));
        } if (d < 0) {
            System.out.println("Нет решения");
        }





    }
}
