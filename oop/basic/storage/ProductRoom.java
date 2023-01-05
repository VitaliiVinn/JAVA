package oop.basic.storage;

import java.util.Arrays;
import java.util.Scanner;

public class ProductRoom {
    private Product[][][] products;
    Scanner scanner = new Scanner(System.in);

    public ProductRoom() {
        System.out.println("Enter amount of rooms");
        int amountOfRooms = scanner.nextInt();
        products = new Product[amountOfRooms][][];
        for (int i = 0; i < amountOfRooms; i++) {
            System.out.println("How much shelves in the room? " + i);
            int amountOfShelves = scanner.nextInt();
            Product[][] shelves = new Product[amountOfShelves][];
            for (int j = 0; j < amountOfShelves; j++) {
                System.out.println("How much cells in each shelf " + j);
                int cellAmount = scanner.nextInt();
                Product[] products1 = new Product[cellAmount];
                shelves[j] = products1;
            }
            products[i] = shelves;
        }
        for (int k = 0; k < products.length; k++) {
            System.out.println("Room with number " + k);
            for (int l = 0; l < products[k].length; l++) {
                System.out.println(Arrays.toString(products[k][l]));
            }
        }
        menu();
    }
    public void add() {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                for (int n = 0; n < products[i][j].length; n++) {
                    if (products[i][j][n] == null) {
                        System.out.println("Add your product title");
                        String title = scanner.next();
                        System.out.println("Add your product price");
                        int price = scanner.nextInt();
                        System.out.println("Add yout product amount");
                        int amount = scanner.nextInt();
                        Product product = new Product(title, price, amount);
                        products[i][j][n] = product;
                        System.out.println("Your product is on the " + i + " room, " + j + " shelf, " + n + " cell");
                    } else {
                        System.out.println("There is no empty place");
                    }
                }
            }
        }
    }
    public void findProduct() {
        System.out.println("Enter a title of product");
        String titleOfProduct = scanner.next();
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                for (int n = 0; n < products[i][j].length; n++) {
                    if (products[i][j][n] != null && products[i][j][n].getTitle().equals(titleOfProduct) &&
                            products[i][j][n].getAmount() != 0){
                        System.out.println("Your product is on the " + i + " room, " + j + " shelf; " + n + " cell" +
                                 " with amount " + products[i][j][n].getAmount());
                    } else if (products[i][j][n].getAmount() == 0) {
                        System.out.println("There is not appropriate products because of empty shelf");
                    }
                }
            }
        }
    }
    public void takeProduct() {
        System.out.println("Enter name of product");
        String nameProduct = scanner.next();
        System.out.println("How much do you want to take");
        int quantity = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                for (int n = 0; n < products[i][j].length; n++) {
                    if (products[i][j][n] != null && products[i][j][n].getTitle().equals(nameProduct) &&
                            products[i][j][n].getAmount() >= quantity) {
                        System.out.println("Take your product is on the " + i + " room, " + j + " shelf; " + n + " cell");
                        products[i][j][n].setAmount(products[i][j][n].getAmount() - quantity);
                    }
                    else if (products[i][j][n] != null && products[i][j][n].getTitle().equals(nameProduct) &&
                            products[i][j][n].getAmount() < quantity) {
                        int rest = quantity - products[i][j][n].getAmount();
                        products[i][j][n].setAmount(0);
                        System.out.println("The cell is empty. Find " + rest + " pieces in another shelf");
                    }
                    return;
                }
            }
        }
        System.out.println("There is no product");
    }
    public void menu() {
        System.out.println("Make your choice: \n1 - add product; \n2 - find product; \n3 - take product; \n4 - exit");
        int choice = scanner.nextInt();

        if (choice == 1) {
            add();
        }
        if (choice == 2) {
            findProduct();
        }
        if (choice == 3) {
            takeProduct();
        }
        if (choice == 4) {
            System.exit(0);
        }
        menu();
    }
}
