package oop.basic.dispenser;

public class Product {
    private String title;
    private int amount;
    private int price;

    public Product(String title, int amount, int price){
        this.title = title;
        this.amount = amount;
        this.price = price;
    }
    public void info(){
        System.out.println("Product - " + title + " , Price - " + price + " $, Available - " + amount + " pc/pcs");
    }
    public int getAmount(){
        return amount;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
    public void setAmount(int newAmount){
        this.amount = newAmount;
    }
}
