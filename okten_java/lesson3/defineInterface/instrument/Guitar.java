package okten_java.lesson3.defineInterface.instrument;

public class Guitar implements MusicalInstrument{
    private int amountOfString;

    public Guitar(int amountOfString) {
        this.amountOfString = amountOfString;
    }

    public int getAmountOfString() {
        return amountOfString;
    }

    public void setAmountOfString(int amountOfString) {
        this.amountOfString = amountOfString;
    }

    @Override
    public void play() {
        System.out.println("Now it's playing guitar with " + amountOfString + " strings");

    }
}
