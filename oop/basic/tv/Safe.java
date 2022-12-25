package oop.basic.tv;

public class Safe {
    private int pin = 987654;
    private int pass;
    private int lengthPassword = 6;
    private int yourAttempts;
    private int maxAttempts = 3;
    private boolean lock;

    public void close(int pass) {

        if (lock == false && ("" + pass).toCharArray().length == lengthPassword) {
            lock = true;
            this.pass = pass;
            System.out.println("Safe is close");
        } else if (("" + pass).toCharArray().length != lengthPassword) {
            System.out.println("Input necessary number of digits");
        }
    }

    public void open(int pass) {
        if (yourAttempts == maxAttempts){
            if (pass != pin)
                System.out.println("Safe has blocked. Pin is incorrect");
            else {
                lock = false;
                System.out.println("Safe is open");
                yourAttempts = 0;
            }
            return;
        }
        if (this.pass == pass){
            lock = false;
            System.out.println("Opening");
            yourAttempts = 0;
        }
        else {
            yourAttempts++;
            System.out.println("Try one more time. You have " + yourAttempts + " attempt/s");
        }
    }
}

