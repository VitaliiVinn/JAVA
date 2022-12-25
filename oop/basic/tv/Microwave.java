package oop.basic.tv;

public class Microwave {
    private boolean plugIn;
    private double powerOfMicrowave;
    private double maxPowerOfMicrowave = 1000;
    private double minPowerOfMicrowave;
    private int minTimeInSeconds;// в секундах
    private int maxTimeInSeconds;
    private int time;
    private int currentMode = 1; //3 - ручной режим, 1 - чашка, 2 - тарелка

    private int setTime;
    private int handleTime;
    private boolean doorIsOpen;
    private int timetableMinutes;

    public Microwave(int maxPowerOfMicrowave, int maxTimeInSeconds, int minPowerOfMicrowave) {
        this.maxPowerOfMicrowave = maxPowerOfMicrowave;
        this.maxTimeInSeconds = maxTimeInSeconds;
        this.minPowerOfMicrowave = minPowerOfMicrowave;
    }

    public void onOff() {
        if (plugIn == false) {
            plugIn = true;
            System.out.println("Микроволновка готова к работе");
        } else {
            plugIn = false;
            System.out.println("Отключение микроволновки");
        }
    }

    public void changeMode(int mode) {
        if (plugIn == false) {
            plugIn = true;
        }
        if (mode == 1) {
            powerOfMicrowave = maxPowerOfMicrowave;
            time = 70;
            currentMode = mode;
            System.out.println("Выбран режим 'чашка'");
        }
        if (mode == 2) {
            powerOfMicrowave = maxPowerOfMicrowave * 0.7;
            time = 200;
            currentMode = mode;
            System.out.println("Выбран режим 'тарелка'");

        }
        if (mode == 3) {
            currentMode = mode;
            System.out.println("Выбран режим 'рука'");

        }
        System.out.println("Режим " + currentMode + " таймер " + time + " мощность " + powerOfMicrowave);
    }

    public void setTime(int minutes, int seconds) {
        if (plugIn == true && currentMode == 3) {
            time = minutes * 60 + seconds;
            System.out.println("Установилось время " + minutes + " минут " + time + " секунд");
        }
    }

    public void setPower(int watt) {
        if (plugIn == true && currentMode == 3) {
            powerOfMicrowave = watt;
            System.out.println("Установилась мощность " + watt);
        }
    }

    public void start() {
        if (plugIn == true && doorIsOpen == false) {
            System.out.println("Микроволновка включилась");
            while (time > 0) {
                time--;
                System.out.println("Греется " + time / 60 + " : " + time % 60);
            }
            System.out.println("Можно открывать");
        }
    }

}