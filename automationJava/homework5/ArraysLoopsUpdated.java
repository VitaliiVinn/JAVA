package automationJava.homework5;

import java.util.Arrays;
import java.util.Random;

public class ArraysLoopsUpdated {
    public static void main(String[] args) {
        ArraysLoopsUpdated attempt = new ArraysLoopsUpdated();
        attempt.sin(0);

        int[] updatedArray = createArray(13); //created array to check
        System.out.println("\n" + Arrays.toString(updatedArray));
        int[] newArray = changeEvenNumber(updatedArray); //array with zero
        System.out.println(Arrays.toString(newArray));
        int[] arrayFinish = arrayWithoutZero(newArray);// array without zero (optional)
        System.out.println(Arrays.toString(arrayFinish));

        int[] countArray = allElementsInArray(10); // created array to check
        System.out.println("\n" + Arrays.toString(countArray));
        double number = averageArray(countArray); // counted for average
        System.out.println(number);
    }
    //    1 Написати програму, яка друкує таблицю значень sin(x), де x це кожні 10 градусів від 0 до 360
    public void sin(int degrees) {
        for (int i = 0; i <= 360; i = i + 10) {
            System.out.println("Sin(x) = " + i);
        }
    }
    //    2 Написати програму, яка в масиві випадкових чисел замінює всі парні числа на 0 і виводить отриманий масив на
//    екран. Для генерації випадкових чисел можна використовувати Random:
//    Random random = new Random;
//    int i = random.nextInt(100); //випадкове число до 100
    public static int[] createArray(int length) {
        Random random = new Random();
        int[] arrayRandom = new int[length];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(100);
        }
        return arrayRandom;
    }
    public static int[] changeEvenNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }
    public static int[] arrayWithoutZero(int[] someArray) {
        int counter = 0;
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] != 0) {
                counter++;
            }
        }
        int[] arrayCopy = new int[counter];
        for (int j = 0, k = 0; j < someArray.length; j++){
            if(someArray[j] != 0){
                arrayCopy[k++] = someArray[j];
            }
        }
        return arrayCopy;
    }
    //    3 Написати програму, яка вираховує середнє арифметичне всіх елементів у масиві з 10 випадкових чисел.
    public static int[] allElementsInArray(int length) {
        Random random = new Random();
        int[] countAverage = new int[length];
        for (int i = 0; i < countAverage.length; i++) {
            countAverage[i] = random.nextInt(100);
        }
        return countAverage;
    }
    public static double averageArray(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter += array[i];
        }
        double x = (double) counter / array.length;
        return x;
    }
}
