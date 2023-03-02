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
        return "Car describing \n{" +
                "\nmodel is " + model +
                "\npower is " + power + " horses power " +
                "\nvolumeEngine is " + volumeEngine + " litres " +
                "\nturbo presence: " + turbo + "\n}";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(int volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}

