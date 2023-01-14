package oop.basic.dispenser;

public class Dispenser {

//    private
//    private int moneyForChange = 5000;
    private int amountOfCola = 10;
    private int amountOfCoockies = 50;
    private int amountOfBeer = 15;
    private int amountOfHamburger = 100;
    private int priceCola = 2;
    private double priceCookies = 0.5;
    private double priceBeer = 1.8;
    private int priceHamburger = 2;


    public int getAmountOfCola() {
        return amountOfCola;
    }
    public int getAmountOfCoockies() {
        return amountOfCoockies;
    }
    public int getAmountOfBeer() {
        return amountOfBeer;
    }
    public int getAmountOfHamburger() {
        return amountOfHamburger;
    }

    public void setAmountOfCola(int newAmount) {
        this.amountOfCola = newAmount;
    }




//    public Dispenser(int priceCola, int priceHamburger, double priceBeer, double priceCookies){
//        this.priceCola = priceCola;
//        this.priceHamburger = priceHamburger;
//        this.priceBeer = priceBeer;
//        this.priceCookies = priceCookies;
//    }
}
