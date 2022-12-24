package automationJava;

public class SecondLessonHT {
    public static void main(String[] args) {
//    1. Написати програму, яка перетворює градуси Цельсію у Фаренгейти и Кельвіни
//            Формулы
//    Celsius = 5/9 (F - 32)
//    Kelvin = C + 273.16
//    Вивести на екран наступний текст: "X C; Y F; Z K;", де X - початкове значення в Цельсіях, Y и Z - значення в
//    Фаренгейтах і Кельвінах.

        int celsius = 23;
        double kelvin = celsius + 273.16;
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("Temperature " + celsius + " C in Celsius" + " ; " + "\nTemperature " + kelvin +
                " K in Kelvin" + " ; " + "\nTemperature " + fahrenheit + " F in Fahrenheit");

        System.out.println();
//        2. Написати програму, яка виводить площу прямокутного трикутника. Значення катетів задати через змінні
        int a = 7;
        int b = 4;
        System.out.println("Area of a triangle is " + a * b / 2 + " centimetre");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


//        3. Паралелепіпед:
//        Створити три змінні для зберігання сторін паралелепіпеда;
//        Порахувати обсяг у змінній volume;
//        Вивести на екран змінну volume у вигляді:
//        System.out.println("Об'єм паралелепіпеда = " + volume);
//        Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;

        int k = 12;
        int l = 16;
        int n = 22;
        int volume = k * l * n;
        System.out.println("The volume of the parallelepiped = " + volume);
        int length = 4 * (k + l + n);
        System.out.println("The length of all sides of parallelepiped is " + length);
    }


}
