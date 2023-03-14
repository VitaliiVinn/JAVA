package okten_java.lesson3.defineInterface.instrument;

public class Trumpet implements MusicalInstrument{
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Now it's playing trumpet with " + diameter + " cm diameter");

    }
}
