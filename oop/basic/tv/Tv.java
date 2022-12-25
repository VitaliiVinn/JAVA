package oop.basic.tv;

public class Tv {
    private double size = 15.6;
    private String brand = "Sony";
    private boolean wifi;
    private long serialNumber = 651455551489012L;
    private double price = 50000.50;

    public Tv(boolean wifi, double initPrice, long serialNumber, String initBrand, double  size){
        System.out.println("this = " + this);
        this.info();
        brand = initBrand;
        this.wifi = wifi;
        this.size = size;
        price = initPrice;
        this.serialNumber = serialNumber;
    }

    public Tv(double price, String brandName, boolean internet){
        this.price = price;
        this.brand = brandName;
        this.wifi = internet;
    }
    public Tv(){
        brand = "Panasonic";
    }

    public String getBrand (){
        return brand;
    }

    public double getSize (){
        return size;
    }

    public boolean isWifi(){
        return wifi;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }


    public void info(){
        System.out.println(brand + " " + size + " " + wifi + " " + serialNumber + " " + price);
    }



}
