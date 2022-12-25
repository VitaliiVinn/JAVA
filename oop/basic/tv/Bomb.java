package oop.basic.tv;

public class Bomb {
    private int timer;
    private boolean switchOn;
    private boolean start;
    private boolean explode;

    public Bomb(int timer) {
        this.timer = timer;
    }

    public void onOffMode() {
        if (switchOn == false) {
            switchOn = true;
            System.out.println("Установи время");
        } else {
            switchOn = false;
        }
    }

    public void startingExplosion() {
        if (start == false && timer > 20) {
            start = true;
            System.out.println("Начался отсчет времени");
        } else if (start == true && timer <= 20) {
            System.out.println("Установи время больше 20 секунд и повтори попытку");
        }
    }

    public void inputTime() {
        if (switchOn == true && timer > 20) {
            timer = this.timer;
            while (timer > 0) {
                timer--;
                System.out.println("Время " + timer / 60 + " : " + timer % 60);
            }
            System.exit(0);
        } else if (switchOn == true && timer <= 20) {
            System.out.println("Увеличь время, чтобы успел убежать");
        }
    }

    public void explosionMode() {
        if (timer == 0) {
            explode = true;
            System.out.println("Взорвалось");
        } else {
            explode = false;
            System.out.println("Попробуй еще раз");
        }

    }
}

