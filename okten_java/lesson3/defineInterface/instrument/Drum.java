package okten_java.lesson3.defineInterface.instrument;

public class Drum implements MusicalInstrument{
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Now it's playing drum with " + size + " cm size");
    }
}
