package oop.basic.tv;

public class MainCar {
    public static void main(String[] args) {

        PlaceForCar actionsWithParking = new PlaceForCar(new int[] {4, 3, 8, 5});

        Car car = new Car("BMW", "330i", "White", "AA3225KK");
        actionsWithParking.addCar(car);
        car = new Car("Geely", "Emgrand", "Red", "AB7722BM");
        actionsWithParking.addCar(car);
        car = new Car("MG", "JX", "Black", "BX8932KI");
        actionsWithParking.addCar(car);
        car = new Car("Seat", "Toledo", "Brown", "AO8712TT");
        actionsWithParking.addCar(car);
        car = new Car("BMW", "520d", "Blue", "AX9641MM");
        actionsWithParking.addCar(car);

        actionsWithParking.findCar("AA4323FF", "Seat");
        actionsWithParking.findCar("AA3225KK", "BMW");
        System.out.println();

        actionsWithParking.takeCar("AA3225KK", "JEEP");
        actionsWithParking.takeCar("AA3225KK", "BMW");
        System.out.println();
//        car = new Car("Opel", "Corsa", "Silver", "AK9565MX");
//        actionsWithParking.addCar(car);
//        car = new Car("Lancia", "Delta", "Brown", "BO9962II");
//        actionsWithParking.addCar(car);

    }
}
