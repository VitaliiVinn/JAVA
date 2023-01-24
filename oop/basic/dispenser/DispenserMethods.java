package oop.basic.dispenser;

import oop.basic.dispenser.Dispenser;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DispenserMethods {
    private Product[] products;
    private String title;

    Scanner scanner = new Scanner(System.in);

    public DispenserMethods() {
        products = new Product[4];
        Product cola = new Product("Cola", 25, 2);
        Product coockies = new Product("Roshen", 100, 1);
        Product beer = new Product("Obolon", 80, 2);
        Product hamburger = new Product("Beef", 15, 3);
        products[0] = cola;
        products[1] = coockies;
        products[2] = beer;
        products[3] = hamburger;
        menu();
    }

    public void buyProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getAmount() > 0) {
                System.out.print(i + " ");
                products[i].info();
            }
        }
        System.out.println("What do you need?");
        int number = scanner.nextInt();
        System.out.println("Put money");
        int money = scanner.nextInt();
        if (money >= products[number].getPrice()) {
            int rest = products[number].getAmount() - 1;
            System.out.println("Rest of product " + rest);
            int restMoney = money - products[number].getPrice();
            System.out.println("Rest of money is " + restMoney);
            change(restMoney);
        }
    }
    private void change(int restMoney){
        System.out.println("Take your change");
        int amount = restMoney/100;
        if(amount > 0){
            System.out.println("Take " + amount + " 100$");
            restMoney = restMoney - amount * 100;
            if(restMoney == 0){
                return;
            }
        }
        amount = restMoney/50;
        if (amount > 0){
            System.out.println("Take " + amount + " 50$");
            restMoney = restMoney - amount * 50;
            if (restMoney == 0){
                return;
            }
        }
        amount = restMoney/20;
        if(amount > 0){
            System.out.println("Take " + amount + " 20$");
            restMoney = restMoney - amount * 20;
            if(restMoney == 0){
                return;
            }
        }
        amount = restMoney/5;
        if(amount > 0){
            System.out.println("Take " + amount + " 5$");
            restMoney = restMoney - amount * 5;
            if(restMoney == 0){
                return;
            }
        }
        if(amount > 0){
            System.out.println("Take " + amount + " 1$");
        }
    }

//    public void change(int putMoney) {
//        int change = 0;
//        if (putMoney > priceCola){
//            change = putMoney - priceCola;
//            if (change)
//        }
//
//    }


    private void menu() {
        System.out.println("What is your choice? \n1 - Buy; \n2 - Exit"); //пополнить запасы
        int choice = scanner.nextInt();
        if (choice == 1) {
            buyProduct();
        }
        if (choice == 2) {
            System.exit(0);
        }
    }
}
