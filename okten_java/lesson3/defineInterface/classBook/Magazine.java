package okten_java.lesson3.defineInterface.classBook;

import okten_java.lesson3.defineInterface.Printable;

public class Magazine implements Printable {
    String nameOfMagazine;
    int pagesOfMag;
    int copies;

    public Magazine(String nameOfMagazine, int pagesOfMag, int copies) {
        this.nameOfMagazine = nameOfMagazine;
        this.pagesOfMag = pagesOfMag;
        this.copies = copies;
    }

    @Override
    public void print() {
        System.out.println("\nThe magazine is " + nameOfMagazine + " with " + pagesOfMag + " pages and has " + copies +
                " copies");
    }
    @Override
    public String toString(){
        return nameOfMagazine + ", " + pagesOfMag + ", " + copies;
    }
}
