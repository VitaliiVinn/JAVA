package automationJava.homework9;

import java.util.*;

public class ColMap {
    /*    Написати метод який виведе значення коллекції Map<?, String> в консоль у вигляді:
     *  key1=value1
     *          key2=value2
     *   keyn=valuen
     *  Висновок повинен бути відсортований в алфавітному порядку за value.
     */
    private static Map<String, String> map1 = new HashMap<>();

    public ColMap() {
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
    }

    public static void printMap() {
        for (Map.Entry o : map1.entrySet()) {
            System.out.println("Owner " + o.getKey() + " = " + o.getValue());
        }
        Map<String, String> treeMap = new TreeMap<>(map1);
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println("Car owner is " + entry.getKey() + " with " + entry.getValue());
        }
    }
}
