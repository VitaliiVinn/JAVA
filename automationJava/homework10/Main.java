package automationJava.homework10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* 1) Підрахуйте кількість фруктів, ім'я яких починається на "a"
         * 2) Виведить на екран фрукти, довжина ім'я яких >4
         * 3) Виведить на екран суму літер перших 3 фруктів
         */
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
        System.out.println(fruits.stream().filter(d->d.startsWith("a")).count());
        System.out.println();
        fruits.stream().filter(d->d.length()>4).forEach(System.out::println);
        System.out.println();
        System.out.println(fruits.stream().limit(3).collect(Collectors.summingInt(e->e.length())));
    }
}
