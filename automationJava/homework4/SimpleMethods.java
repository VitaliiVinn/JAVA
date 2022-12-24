package automationJava.homework4;

public class SimpleMethods {
    public static void main(String[] args) {
        SimpleMethods home = new SimpleMethods();
        home.сheckOddEven(25);
        System.out.println("BYE\n");

        home.printMonthInWord(65);
        home.printMonthInWordSwitch(5);

        home.magnitude(3, -9);

        home.triangleDefinition(8, 6, 8);
    }

    //    1.Написати метод з назвою "сheckOddEven", яка друкує "Odd Number"
//    якщо змінна "number" типу int непарна. Або "Even Number" якщо змінна
//    парна. Програма завжди має перед виходом друкувати “BYE”
    public void сheckOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
//    2.Написати метод з назвою "printMonthInWord", яка друкує "JAN",
//            "FEB", …. “DEC”, якщо змінна “month” типу int буде 1, 2, 3, 4...12.
//    в іншому випадку програма повинна вивести “Not a valid month”. Розв'язати задачу двома
//    способами:
//            1) з використанням if..else if
//            2) з використанням switch-case

    public void printMonthInWord(int month) {
        if (month == 1) {
            System.out.println("JAN");
        }
        if (month == 2) {
            System.out.println("FEB");
        }
        if (month == 3) {
            System.out.println("MAR");
        }
        if (month == 4) {
            System.out.println("APR");
        }
        if (month == 5) {
            System.out.println("MAY");
        }
        if (month == 6) {
            System.out.println("JUN");
        }
        if (month == 7) {
            System.out.println("JUL");
        }
        if (month == 8) {
            System.out.println("AUG");
        }
        if (month == 9) {
            System.out.println("SEP");
        }
        if (month == 10) {
            System.out.println("OCT");
        }
        if (month == 11) {
            System.out.println("NOV");
        }
        if (month == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }
    }

    public void printMonthInWordSwitch(int month) {
        switch (month) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }
    }

    //    3.Написати метод якій порівнюватиме величину (magnitude) двох чисел.
//    Наприклад, якщо одне число = 3, а друге число = -9, програма має видати, що
//    число -9 має велику величину. Для обчислення абсолютного значення можна використовувати метод із стандартної бібліотеки Math.abs()
    public void magnitude(int firstNumber, int secondNumber) {
        int value = Math.abs(firstNumber);
        int valueSec = Math.abs(secondNumber);
        if (value > valueSec) {
            System.out.println(firstNumber + " bigger than " + secondNumber + " in absolute value");
        } else if (value < valueSec) {
            System.out.println(firstNumber + " less than " + secondNumber + " in absolute value");
        } else {
            System.out.println(firstNumber + " is equal with " + secondNumber + " in absolute value");
        }
    }

    //    4.Написати метод, який визначає, чи є трикутник зі сторонами a, b, c рівнобедреним.
    public void triangleDefinition(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is not isosceles");
        }
    }
}
