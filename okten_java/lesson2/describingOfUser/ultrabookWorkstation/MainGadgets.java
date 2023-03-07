package okten_java.lesson2.describingOfUser.ultrabookWorkstation;

public class MainGadgets {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook(256, 16, "Intel I5", "Black", true);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation(512, 21, "Intel Core I7",
                "Mac", false, new Laptop(12));
        System.out.println(workstation);



    }
}
