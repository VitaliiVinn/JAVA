package okten_java.lesson3.defineInterface;

import okten_java.lesson3.defineInterface.classBook.Book;
import okten_java.lesson3.defineInterface.classBook.Magazine;
import okten_java.lesson3.defineInterface.instrument.Drum;
import okten_java.lesson3.defineInterface.instrument.Guitar;
import okten_java.lesson3.defineInterface.instrument.MusicalInstrument;
import okten_java.lesson3.defineInterface.instrument.Trumpet;

import java.util.ArrayList;

public class MainInterface {
    public static void main(String[] args) {
        //а) Определить интерфейс Printable, содержащий метод void print().
        OfficePaper officePaper = new OfficePaper("Paper for print", 36);
        officePaper.print();
        //б) Определить класс Book, реализующий интерфейс Printable.
        Book book = new Book("Jack London", "Clark");
        book.print();
        //в) Определить класс Magazine, реализующий интерфейс Printable.
        Magazine magazine = new Magazine("Fitness", 65, 1000);
        magazine.print();
        //г) Создать массив типа Printable, который будет содержать книги и журналы.

        ArrayList<Printable> arrayList = new ArrayList<>();
        arrayList.add(book);
        arrayList.add(magazine);
        for (Printable e : arrayList) {
            System.out.println(e);
        }
        //Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
        //Интерфейс Инструмент содержит метод play()
        //Гитара содержит переменные класса количествоСтрун,
        //Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
        //В цикле вызвать метод play() для каждого инструмента,
        //который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
        ArrayList<MusicalInstrument> musicalInstruments = new ArrayList<>();
        musicalInstruments.add(new Drum(400));
        musicalInstruments.add(new Guitar(7));
        musicalInstruments.add(new Trumpet(30));
        for (MusicalInstrument e: musicalInstruments){
            e.play();
        }
    }
}
