package oop.basic.tv;

public class Car {
    private String brand;
    private String model;
    private String color;
    private String number;



    public Car(String brand, String model, String color, String number) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.number = number;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public String getNumber(){
        return number;
    }
//    public void setNumber(String newCarNumber){
//        this.number = newCarNumber;
//    }
    public void infoCar(){
        System.out.println("Car: " + brand + "\nModel: " + model + "\nColor: " + color + "\nMumber: " + number);
    }
}
