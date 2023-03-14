package okten_java.lesson4.zooclub;

import automationJava.homework6.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//
public class ZooClub {
//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
// В зооклубі створити методи, та застосувати їх
//1) додати учасника в клуб;
//2) додати тваринку до учасника клубу.
//3) видалити тваринку з власника.
//4) видалити учасника клубу.
//5) видалити конкретну тваринку з усіх власників.
//6) вивести на екран зооклуб.
//Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку
    private Map <Person, List<Pet>> club;

    public static <K, V> Map<K, V> map (K[]keys, V[]values){
        if(keys.length != values.length) {
            throw new IllegalArgumentException("Numbers are different");
        }
            Map<K, V> map = new HashMap<>();
            for (int i = 0; i < keys.length; i++) {
                K key = keys[i];
                V value = values[i];
                map.put(key, value);
            }
            return map;
        }
    }

