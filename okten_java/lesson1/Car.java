package okten_java.lesson1;

public class Car {
    private String model;
    private double power;
    private int volumeEngine;
    private boolean turbo;

    public Car(String model, double power, int volumeEngine, boolean turbo){
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }
    @Override
    public String toString() {
        return "User{" +
                "model = " + model +
                ", power = " + power +
                ", volumeEngine = " + volumeEngine +
                ", turbo = " + turbo + "}";
    }
    }

