package automationJava.homework6;

public class Person implements Callable {
    //    Зробити клас Person у классі вказати чотири поля: ім'я, прізвище, місто, телефон
    private String name;
    private String surname;
    private String city;
    private String phoneNumber;

    public Person(String name, String surname, String city, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String call(String name, String surname, String city, String phoneNumber) {
       return "Зателефонувати громадянину " + name + " " + surname + " із міста " + city +
               " можна за номером " + phoneNumber;
    }

    @Override
    public String call(Person person){
        if (person == this){
            return "Неможливо телефонувати самому собі";
        }
        return "Громадянин " + name + " " + surname + " телефонує громадянину " + person.name + " " + person.surname +
                " на номер " + person.phoneNumber;
    }

    //    Створити інтерфейс Callable()з методом call()
//    Імплементувати метод у класі.
//    Всередині методу формувати рядок у форматі:
//    Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//    Метод має повертати String
//    У main-методі зробити три виклики методу call, щоразу передаючи нову людину;
//    Повинен вийти висновок такого типу:
//    Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//    Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//    Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.
//    Перевантажити метод call у інтерфейсі який буде також приймати Класс  Person результат якого буде наступний
//    якщо це та сама персона то повернути текст "неможливо телефонувати самому собі
//    або громадянин Will Smith телефонує громадянину Sherlock Holmes на номер 37742123513
//    також створити клас спадкоємещь який буде оперувати додатковими полями і який буде виводити удосконаленне повідомлення, на ваш розсуд
//    можете додавати додаткову логіку для удосконалення навичок з ООП (опціонально)

}
