package oop.basic.dispenser;

public class Product {
    private String title;
    private int amount;
    private double price;

    public Product(String title, int amount, double price){
        this.title = title;
        this.amount = amount;
        this.price = price;
    }
    public void info(){
        System.out.println("Product - " + title + " , Price - " + price + " $, Available - " + amount + " pc/pcs");
    }
}
