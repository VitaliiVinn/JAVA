package oop.basic.tv;

import java.util.Arrays;

public class PlaceForCar {
    private Car[][] cars;

    public PlaceForCar(int[] config) {
        cars = new Car[config.length][];
        for (int i = 0; i < cars.length; i++) {
            Car[] cars1 = new Car[config[i]];
            cars[i] = cars1;
        }
        System.out.println(Arrays.deepToString(cars));
    }

    public void addCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] == null) {
                    cars[i][j] = car;
                    System.out.println("You can stop your car there: " + i + " floor " + j + " place in row");
                    return;
                }
            }
        }
    }
    public void findCar(String numberOfCar, String nameBrand) {
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] != null && cars[i][j].getNumber().equals(numberOfCar) ||
                        cars[i][j] != null && cars[i][j].getBrand().equals(nameBrand)) {
                    System.out.println("The car was found on: " + i + " floor " + j + " place");
                    cars[i][j].infoCar();
                    counter++;
                }
            }
        }
        if(counter == 0){
            System.out.println("There is no equal input data");
        }
    }
    public void takeCar(String numberOfCarToTake, String nameBrand) {
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] != null && cars[i][j].getNumber().equals(numberOfCarToTake) && cars[i][j].getBrand().equals(nameBrand)) {
                    System.out.println("Take your car on the: " + i + " floor " + j + " place");
                    counter++;
                    cars[i][j] = null;
                }
            }
        }
        if(counter == 0){
            System.out.println("The car was not found");
        }
    }
}


