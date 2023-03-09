package oop.basic.collections;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Vasya");
        list.add("John");
        list.add("Petr");
        list.add("Misha");
        list.add("Lesya");

        System.out.println(list);
        System.out.println(list.size());

        Collections.addAll(list, "Ford", "KIA", "Dodge", "Hyundai", "Fiat");
        System.out.println(list);
        for (int i= 0; i < list.size(); i++){
            list.get(3);
        }

        list.add(0, "Dima");
        list.add(null);
        System.out.println(list);

        String oldValue = list.set(4, "Masha");
        System.out.println(list);
        System.out.println(oldValue);

        int number = list.indexOf("Hyundai");
        System.out.println(number);

        boolean definition = list.contains("Jim");
        System.out.println(definition);

        list.remove("Dodge");
        System.out.println(list);
        list.remove("Ferrari");
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        String find = list.get(5);
        System.out.println(find);

        for (int i = 0; i < list.size(); i++){
            String value = list.get(i);
            System.out.println(value);
        }
        // есть лист с интами, удалить все отрицательные элементы (в разных местах)

        ArrayList<Integer> values = new ArrayList<>();
        Collections.addAll(values,-6,25,-2,0,14,-3,0,-18,77,-5);
        System.out.println(values);
        for (int i = 0; i < values.size(); i++){
            int s = values.get(i);
            if (s < 0){
                values.remove(i);
            }
        }
        System.out.println(values);
        System.out.println("ForEach");

        // распечатать столбец с помощью форич и цикла вайл
        values.forEach((n) -> System.out.println(n));
        System.out.println("Variant2");
        values.forEach(System.out::println);
        System.out.println("While");

        int count = 0;
        while(values.size() > count){
            System.out.println(values.get(count));
            count++;
        }
        System.out.println("safdsfaf");

        // сделать зеркальный лист (отобразить зеркально)

        List<Integer> givenList = Arrays.asList(1, 2, 3, 4 ,5);
        Random rand = new Random();

        int numberOfElements = 3;

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(givenList.size());

            System.out.println(randomIndex);
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        ArrayListTest obj = new ArrayListTest();
//        int numberOfElements = 3;
        System.out.println(obj.getRandomElement(list1, numberOfElements));
    }

    public List<Integer> getRandomElement(List<Integer> list, int totalItems) {
        Random rand = new Random();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {
            int randomIndex = rand.nextInt(list.size());
            newList.add(list.get(randomIndex));
//            list.remove(randomIndex);
        }
        return newList;
    }

}




