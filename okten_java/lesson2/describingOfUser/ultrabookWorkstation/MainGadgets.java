package okten_java.lesson2.describingOfUser.ultrabookWorkstation;

public class MainGadgets {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook(256, 16, "INTEL", 6, "Black",
                true);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation(512, 21, "Intel Core I7",
                9, "vasya", false, new Laptop(128, 21, "CELERON",
                8));
        System.out.println(workstation);



    }
}
