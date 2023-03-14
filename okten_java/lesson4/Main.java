package okten_java.lesson4;

import okten_java.lesson4.hash.GenderForHash;
import okten_java.lesson4.hash.UserWithGender;
import okten_java.lesson4.makeClass.Cars;
import okten_java.lesson4.makeClass.Gender;
import okten_java.lesson4.makeClass.Skills;
import okten_java.lesson4.makeClass.User;
import okten_java.lesson4.sortList.Users;
import okten_java.lesson4.treeset.SkillsTreeSet;
import okten_java.lesson4.zooclub.Person;
import okten_java.lesson4.zooclub.Pet;
import okten_java.lesson4.zooclub.ZooClub;

import java.util.*;
import java.util.stream.Collectors;

import static okten_java.lesson2.describingOfUser.makeClass.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        //Створити List Юзерів
        //- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
        //- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("Petr", 25));
        usersList.add(new Users("Kolya", 67));
        usersList.add(new Users("Lee", 36));
        usersList.add(new Users("Inna", 41));
        usersList.add(new Users("Jeetu", 14));

        Collections.sort(usersList);
        System.out.println(usersList);
        usersList.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(usersList);
        usersList.sort(Comparator.comparingInt(u->u.getName().length()));
        System.out.println(usersList);

        //створити ArrayList зі словами на 15-20 елементів.
        //- відсортувати його за алфавітом .
        ArrayList<String> list = new ArrayList<>();
        list.add("Citrus");
        list.add("Change");
        list.add("Funny");
        list.add("Impact");
        list.add("Table");
        list.add("Barber");
        list.add("Student");
        list.add("Amount");
        list.add("Link");
        list.add("Museum");
        list.add("Nations");
        list.add("Organization");
        list.add("United");
        list.add("Of actions");
        list.add("Understandable");
        Collections.sort(list);
        System.out.println(list);

        //Створити клас котрий відповідає наступній моделі
        //{
        //    id: 1,
        //    name: 'vasya',
        //    surname: 'pupkin',
        //    email: 'asd@asd.com',
        //    age: 31,
        //    gender: 'MALE',
        //    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
        //    car: {model: 'toyota', year: 2021, power: 250}
        //}
        //Використати композицію/агрегацію та енуми в потрібному місці.
        Skills skills = new Skills("java", 10,
                "js", 20, "c++", 10);
        User user = new User(1, "Vasya", "Pupkin", "asd@asd.com",
                31, Gender.MALE, skills,
                new Cars("BMW", 2020, 252));
        System.out.println(user);

        //Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
        HashSet<UserWithGender> userWithGenders = new HashSet<>();
        userWithGenders.add(new UserWithGender("Petr", "Man"));
        userWithGenders.add(new UserWithGender("Kolya", "Man"));
        userWithGenders.add(new UserWithGender("Lee", "Man"));
        userWithGenders.add(new UserWithGender("Inna", "Woman"));
        userWithGenders.add(new UserWithGender("Jeetu", "Man"));
        userWithGenders.add(new UserWithGender("Dima", "Man"));
        userWithGenders.add(new UserWithGender("Jim", "Man"));
        userWithGenders.add(new UserWithGender("Barbara", "Woman"));
        userWithGenders.add(new UserWithGender("Lisa", "Woman"));
        userWithGenders.add(new UserWithGender("Misha", "Man"));

//        Iterator<UserWithGender> iterator = userWithGenders.iterator();
//        while (iterator.hasNext()){
//            UserWithGender next = iterator.next();
//            System.out.println(next);
//            if(next.equals("Man")){
//                iterator.remove();
//            }
//        }
//        System.out.println(userWithGenders);
        System.out.println(userWithGenders.removeIf(s->s.getSex().equals("Man")));

        for (UserWithGender gender : userWithGenders) {
            System.out.println(gender);
        }

        //Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
        TreeSet<SkillsTreeSet> skillsTreeSets = new TreeSet<>();
        skillsTreeSets.add(new SkillsTreeSet("Petr", 1));
        skillsTreeSets.add(new SkillsTreeSet("Kolya", 5));
        skillsTreeSets.add(new SkillsTreeSet("Lee", 3));
        skillsTreeSets.add(new SkillsTreeSet("Inna", 8));
        skillsTreeSets.add(new SkillsTreeSet("Jeetu", 5));
        skillsTreeSets.add(new SkillsTreeSet("Dima", 4));
        skillsTreeSets.add(new SkillsTreeSet("Jim", 11));
        skillsTreeSets.add(new SkillsTreeSet("Barbara", 15));
        skillsTreeSets.add(new SkillsTreeSet("Lisa", 8));
        skillsTreeSets.add(new SkillsTreeSet("Misha", 9));

        System.out.println(skillsTreeSets);

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
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Dog"));
        pets.add(new Pet("Tiger"));
        pets.add(new Pet("Lion"));
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasya"));
        people.add(new Person("Petr"));
        people.add(new Person("Jim"));
        }
    }

