package automationJava.homework9;

import java.util.*;
import java.util.stream.Stream;

public class MainColMap {
    public static void main(String[] args) {
        /*    Написати метод який виведе значення коллекції Map<?, String> в консоль у вигляді:
         *  key1=value1
         *          key2=value2
         *   keyn=valuen
         *  Висновок повинен бути відсортований в алфавітному порядку за value.
         */
        Map<String, String> map1 = new HashMap<>();
        map1.put("Jack", "BMW");
        map1.put("Bob", "KIA");
        map1.put("Ken", "Nissan");
        map1.put("Lewis", "Hyundai");
        map1.put("Mick", "Suzuki");
        map1.put("George", "Chevrolet");
        map1.put("Yan", "MG");
        map1.put("Masha", "Ford");
        map1.put("Lyuba", "Mercedes");
        map1.put("Kira", "AUDI");

        map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
