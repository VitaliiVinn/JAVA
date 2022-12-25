package oop.basic.tv;

import java.util.Arrays;
import java.util.Scanner;

public class PlaceForCarInteractive {
    private Car[][] cars;
    private Scanner scanner = new Scanner(System.in);

    public PlaceForCarInteractive() {
        System.out.println("Enter quantity of floors");
        int size = scanner.nextInt();
        cars = new Car[size][];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter quantity of parking places on the floor");
            int places = scanner.nextInt();
            Car[] cars1 = new Car[places];
            cars[i] = cars1;
        }
        System.out.println(Arrays.deepToString(cars));
        menu();
    }

    public void addCar() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] == null) {
                    System.out.println("Enter car number to add");
                    String number = scanner.next();
                    System.out.println("Enter brand name");
                    String brand = scanner.next();
                    System.out.println("Enter color");
                    String color = scanner.next();
                    System.out.println("Enter model");
                    String model = scanner.next();
                    Car car = new Car(brand, model, color, number);
                    cars[i][j] = car;
                    System.out.println("You can stop your car there: " + i + " floor " + j + " place in row");
                    return;
                }
                else {
                    System.out.println("There is no place");
                }
            }
        }
    }

    public void findCar() {
        System.out.println("Enter number of car to find");
        String findCarByNumber = scanner.next();
        System.out.println("Enter brand name of car to find");
        String findCarByBrand = scanner.next();
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] != null && cars[i][j].getNumber().equals(findCarByNumber) ||
                        cars[i][j] != null && cars[i][j].getBrand().equals(findCarByBrand)) {
                    System.out.println("The car was found on: " + i + " floor " + j + " place");
                    cars[i][j].infoCar();
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("There is no equal input data");
        }
    }

    public void takeCar() {
        System.out.println("Enter number and brand name of your car");
        String takeCarNumber = scanner.next();
        String takeCarBrand = scanner.next();
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] != null && cars[i][j].getNumber().equals(takeCarNumber) &&
                        cars[i][j].getBrand().equals(takeCarBrand)) {
                    System.out.println("Take your car on the: " + i + " floor " + j + " place");
                    counter++;
                    cars[i][j] = null;
                }
            }
        }
        if (counter == 0) {
            System.out.println("The car was not found");
        }
    }

    public void menu() {
        System.out.println("What do you want to do: \n1 - add car; \n2 - find yor car; \n3 - take your car; \n4 - exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            addCar();
        }
        if (choice == 2){
            findCar();
        }
        if (choice == 3){
            takeCar();
        }
        if (choice == 4){
            System.exit(0);
        }
        menu();
    }
}
