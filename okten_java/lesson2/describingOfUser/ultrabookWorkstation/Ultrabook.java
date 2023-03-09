package okten_java.lesson2.describingOfUser.ultrabookWorkstation;

public class Ultrabook extends Laptop {
    String color;
    boolean usb;

    public Ultrabook(int memory, int screenSize, String processor, int amountOfGadgets, String color, boolean usb) {
        super(memory, screenSize, processor, amountOfGadgets);
        this.color = color;
        this.usb = usb;
    }

    @Override
    public String toString(){
        return "Ultrabook {" +
                "\n'color': " + color +
                "\n'usb': " + usb + "\n}" + super.toString();
    }
}
