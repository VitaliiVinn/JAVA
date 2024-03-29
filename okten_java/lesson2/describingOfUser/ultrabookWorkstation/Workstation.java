package okten_java.lesson2.describingOfUser.ultrabookWorkstation;

public class Workstation extends Laptop {
    String name;
    boolean portable;
    Laptop laptop;

    public Workstation(int memory, int screenSize, String processor, int amountOfGadgets, String name,
                       boolean portable, Laptop laptop) {
        super(memory, screenSize, processor, amountOfGadgets);
        this.name = name;
        this.portable = portable;
        this.laptop = laptop;
    }


    @Override
    public String toString(){
        return "Workstation {" +
                "\n'name': " + name +
                "\n'portable': " + portable +
                "\n'amount': " + laptop.amountOfGadgets + "\n}" + super.toString();
    }

}
