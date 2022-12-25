package oop.basic.tv;

public class MainTv {
    public static void main(String[] args) {
        Tv sony;
        int i;
//        new Tv();
//        System.out.println(new Tv());
//        sony = new Tv();
//        System.out.println("sony = " + sony);
//        Tv lg = new Tv();
//        Tv apple = new Tv();
//        System.out.println("lg = " + lg + "\n apple = " + apple);
//        apple = lg;
//        System.out.println("lg = " + lg + "\n apple = " + apple + "\n sony = " + sony);
//        lg = null;
//        apple = null;
//        System.out.println("lg = " + lg + "\n apple = " + apple + "\n sony = " + sony);
//        sony.info(); //методы
//        Tv philips = new Tv();
//        philips.info();

        Tv berezka = new Tv(true, 25000, 253456792122L, "Berezka", 43.0);
        berezka.info();
        System.out.println("Berezka " + berezka);


//        Tv elektron = new Tv(false, 13050, 845564965112L, "Elektron", 15.6);
//        elektron.info();

        Tv akai = new Tv(10800, "Akai", false);
        akai.info();

        Tv panasonic = new Tv();
        panasonic.info();
        String u = panasonic.getBrand();
        System.out.println(u);
        double x = panasonic.getSize();
        System.out.println(x);
        boolean v = panasonic.isWifi();
        System.out.println(v);

        panasonic.setPrice(501);
        double p = panasonic.getPrice();
        System.out.println(p);

        panasonic.setBrand("Apple");
        panasonic.info();

    }
}
