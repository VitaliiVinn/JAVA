package oop.basic.dispenser;

import oop.basic.dispenser.Dispenser;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DispenserMethods {
    private Product[] products;
    private String title;
    private int moneyForChange = 5000;
    private int amountOfCola = 10;
    private int amountOfCoockies = 50;
    private int amountOfBeer = 15;
    private int amountOfHamburger = 100;
    private int priceCola = 2;
    private double priceCookies = 0.5;
    private double priceBeer = 1.8;
    private int priceHamburger = 2;

    Scanner scanner = new Scanner(System.in);

    public DispenserMethods() {
        products = new Product[4];
        Product cola = new Product("Cola", 25, 2);
        Product coockies = new Product("Roshen", 100, 1.8);
        Product beer = new Product("Obolon", 80, 2);
        Product hamburger = new Product("Beef", 15, 1.5);
        products[0] = cola;
        products[1] = coockies;
        products[2] = beer;
        products[3] = hamburger;
    }

    public void buyProduct() {
        for (int i = 0; i < products.length; i++){


            products[i].info();

        }
//        0lllllll


//        int counter = 0;
//        int restOfProduct = 0;
//        if (products >= priceCola && amountOfCola > 0) {
//            counter++;
//            System.out.println("Take Cola");
//            restOfProduct = amountOfCola - counter;
//            System.out.println(restOfProduct);
//        } else if (money >= priceHamburger && amountOfHamburger > 0) {
//            counter++;
//            System.out.println("Take Hamburger");
//            restOfProduct = amountOfHamburger - counter;
//            System.out.println(restOfProduct);
//            System.out.println("Take Hamburger");
//
//        } else if (money >= priceCookies && amountOfCoockies > 0) {
//            System.out.println("Take Cookies");
//        } else if (money >= priceBeer && amountOfBeer > 0) {
//            System.out.println("Take Beer");
//        } else {
//            System.out.println("Put more money");
//        }
    }
//    public void takeChosenProduct(){
//        System.out.println("Choose product: \n1 - Cola; \n2 - ");
//
//    }

//    public void change(int putMoney) {
//        int change = 0;
//        if (putMoney > priceCola){
//            change = putMoney - priceCola;
//            if (change)
//        }
//
//    }


//    public void chooseProduct() {
//        System.out.println("What is your choice? \n1 - Cola; \n2 - Cookies; \n3 - Beer; \n4 - Hamburger; \n5 - exit");
//        int choice = scanner.nextInt();
//        if (choice == 1) {
//            putMoneyAndChooseProduct();
//        }
//        if (choice == 2) {
//            putMoneyAndChooseProduct();
//        }
//        if (choice == 3) {
//            putMoneyAndChooseProduct();
//        }
//        if (choice == 4) {
//            putMoneyAndChooseProduct();
//        }
//        chooseProduct();
//    }
}
