package scanner;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Input double");
        double n = m.nextDouble();
        System.out.println(n);
        System.out.println("Input text");
        String k = m.nextLine();
        System.out.println(k);
        guess();
        game();

    }

    public static void guess() {
        System.out.println("Отгадай число в диапазоне от 0 до 100");
        Random k = new Random();
        int number = k.nextInt(101);

        Scanner w = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {
            System.out.println("Введи число");
            int l = w.nextInt();
            if (l == number) {
                System.out.println("Угадал");
                break;

            }
            if (l < number) {
                System.out.println("Нужно ввести большее значение");
            } else {
                System.out.println("Введите меньшее значение");
            }
        }

    }

    public static void game() {
        System.out.println("Let's play the game");
        char[][] board = new char[2][2];
        char player =  new Random().nextBoolean() ? 'x' : '0';

        Scanner j = new Scanner(System.in);

        for (int a = 0; a < 9; a++){
            System.out.println("Введите координаты по вертикали " + player);
            int vert = j.nextInt();
            System.out.println("Введите координаты по горизонтали " + player);
            int horiz = j.nextInt();
            board[vert][horiz] = player;
            print(board);

        }
    }
    public static void print(char [][] b){
        for(int u = 0; u < b.length; u++){
            System.out.println(Arrays.toString(b[u]));
        }

    }
}
