package okten_java.lesson2.describingOfUser.makeClass;

import static okten_java.lesson2.describingOfUser.makeClass.Gender.MALE;

public class MakeClass {
    public static void main(String[] args) {

        Skills skills = new Skills("java", 10, "js", 20, "c++", 10);
        User user = new User(1, "Vasya", "Pupkin", "asd@asd.com", 31, MALE, skills,
                 new Cars("BMW", 2020, 252));
        System.out.println(user);
    }

//    Skills skills = new Skills("java", 10)

//    Створити клас котрий відповідає наступній моделі
//        {
//            id: 1,
//                    name: 'vasya',
//                surname: 'pupkin',
//                email: 'asd@asd.com',
//                age: 31,
//                gender: 'MALE',
//                skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//            car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
}
