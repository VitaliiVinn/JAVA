package okten_java.lesson2.describingOfUser.ultrabookWorkstation;

public class Laptop extends PC{
    int amountOfGadgets;

    public Laptop(int memory, int screenSize, String processor, int amountOfGadgets) {
        super(memory, screenSize, processor);
        this.amountOfGadgets = amountOfGadgets;
    }
}
