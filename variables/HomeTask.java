package variables;

public class HomeTask {
    public static void main(String[] args) {
        double a = -7;
        double b = -2;
        double b1 = 2;
        double c = -3;
        double d = Math.pow(b,b1) - 4 * a * c;
        if (d > 0) {
            System.out.println("x = " + ((-b + Math.sqrt(d))/(2 * a)));
            System.out.println("x = " + ((-b - Math.sqrt(d))/(2 * a)));
        }
        if (d == 0) {
            System.out.println("x = " + (- b/(2 * a)));
        } if (d < 0) {
            System.out.println("Нет решения");
        }

    }
}
