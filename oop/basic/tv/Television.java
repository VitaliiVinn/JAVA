package oop.basic.tv;

public class Television {
    private boolean plugIn;
    private int volume = 100;
    private int channels = 10;
    private boolean switchOn;
    private int currentChannel = 1;

    public Television(int channels) {
        this.channels = channels;
    }

    public void increaseVolume() {
        if (switchOn == true) {
            volume++;
            if (volume > 100) {
                volume = 100;
            }
            System.out.println("Звук в размере " + volume);
        }
    }

    public void decreaseVolume() {
        if (switchOn == true) {
            volume--;
            if (volume < 0) {
                volume = 0;
            }
            System.out.println("Звук уменьшаем в размере " + volume);
        }
    }

    public void increaseChannels() {
        if (switchOn) {
            currentChannel++;

            if (currentChannel > channels) {
                currentChannel = 1;
            }
            System.out.println("Текущий канал увеличиваем " + currentChannel);
        }
    }

    public void decreaseChannels() {
        if (switchOn) {
            currentChannel--;

            if (currentChannel < 1) {
                currentChannel = channels;
            }
            System.out.println("Текущий канал уменьшаем " + currentChannel);
        }
    }

    public void switchOnOff() {
        if (switchOn == true) {
            switchOn = false;
            System.out.println("Телевизор выключили ");
        } else {
            switchOn = true;
            System.out.println("Телевизор включили ");
        }
    }

    public void plugInOff() {
        if (plugIn == true) {
            plugIn = false;
            System.out.println("Кабель вытащили из розетки  ");
        } else {
            plugIn = true;
            System.out.println("Кабель вставили в розетку  ");

        }
    }
}
