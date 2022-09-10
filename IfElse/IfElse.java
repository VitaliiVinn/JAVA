package IfElse;

public class IfElse {
    public static void main(String[] args) {
        //есть 2 человека с возрастом. Обое совершееннолетние?
        int age1 = 20;
        int age2 = 7;
        if (age1 >= 18 && age2 >= 18) {
            System.out.println("Совершеннолетние");
        } else {
            System.out.println("Не все совершеннолетние");
        }
        // есть 2 авто, что едут с разной среднй скоростью. Есть расстояние, которое надо проехать.
        // Хоть на каком-то авто проедем это расстояние за вреемя такое-то?
        int car1 = 80;
        int car2 = 50;
        int dist = 100;
        int time = 3;
        int x1 = car1 * time;
        int x2 = car2 * time;

        if (x1 >= dist || x2 >= dist) {
            System.out.println("Проедем");
        } else {
            System.out.println("Не проедем");
        }
        // есть книга со столько-то страницю Читали 2 дня по разному кол-ву. Хоть в какой-то день прочитали больще третьей части?
        int book = 200;
        int day1 = 100;
        int day2 = 20;
//        int read1 = book/day1;
//        int read2 = book/day2;

        if (day1 >= book/3 || day2 >=book/3) {
            System.out.println("Прочитали");
        } else {
            System.out.println(" No");
        }
        // Есть 2 переменные, создающие диапазон. Есть третья. Входит  ли третья в этот диапазон?
        int d = 120;
        int f = 10;
        int k = 3;
        if (k >= f && k <= d) {
            System.out.println("Входит в диапазон");
        } else {
            System.out.println("Не входит в диапазон");
        }
        //есть 2 комнати с объемом. Есть мебель с объемом. Вкаждую комнату влезет Мебель?
        int room1 = 80;
        int room2 = 50;
        int furn = 100;

        int a = room1/furn;
        if (furn <= room1 || furn <= room2) {
            System.out.println("Влезет");
        } else {
            System.out.println("Не влезет");
        }

        System.out.println();
        // есть 3 переменных. Найти максимальную из них
        int g = 2;
        int b = 2;
        int c = 2;
        if (g < b && g < c) {
            System.out.println("Наименьшее число " + g);
        } else if (b < a && b < c) {
            System.out.println("Наименьшее число " + b);

        } else if (g == b && b == c) {
            System.out.println("Они равны");
        }

        else {
            System.out.println("Наименьшее число " + c);
        }
        System.out.println();

// Есть 2 товара по разной цене и разному кол-ву. Есть сумма денег. Сможем купить все товары вместе?
// Если да, то сколько еще денег останется?
        int p  = 54;
        int w = 87;
        int quantp = 100;
        int quantw = 63;
        int money = 280;

        int overall1 =  money/p;
        int overall2 = money/w;

        if (overall1+overall2 == quantp+quantw) {
            System.out.println("Можем купить весь товар. Хватает на весь товара денег");

        } else {
            System.out.println("Не можем купить весь товар. Не хватает денег");
        }
        int rest1 = money - (overall1 * p);
        int rest2 = money - (overall2 * w);

        System.out.println("Купим " +overall1 + " товара " + "и останется " + rest1 + " денег.");
        System.out.println("Купим " +overall2 + " товара " + "и останется " + rest2 + " денег.");

        System.out.println();
        // есть Высота, на которую надо взобраться. Есть 2 лестницы с размером. Ессть вариант чтобы влеезть?
        // (лестницы можно соединять)

        int high = 80; // высота общая
        int stairs1 = 5; //размер 1-й лестницы
        int stairs2 = 8; //размер 2-й лестницы

//        int var1 = high/stairs1;
//        int var2 = high/stairs2;
//        if (stairs1 > 0 || var2 > 0) {
//            System.out.println("Влезаем. Тебе нужно будет переставлять лестницу " + var1 + " раз.");
//            System.out.println("Влезаем. Тебе нужно будет переставлять лестницу " + var2 + " раз.");
//        }else {
//            System.out.println("Найди правильную лестницу");
//        }
        if (stairs1 >= high) {
            System.out.println("Можно вылезти с помощью первой лестницы");
        } else if (stairs2 >= high) {
            System.out.println("Можно вылезти с помощью второй лестницы");
        } else if ((stairs1 + stairs2) == high ) {
            System.out.println("Можно вылезти, соединив две лестницы");
        } else {
            System.out.println("Ищите другие лестницы, нет способа");
        }
        // ессть макс  глубина в дайвинге - 40 м. Погружались 3 раза на разную глубину. Хоть в каком-то погружении превысили допуск?
        int deep = 40;
        int x = 10;
        int v = 80;
        int o = 71;
//        if (x > deep || v > deep || o > deep) {
//            System.out.println("Превысили допуск в одном из погружений");
//        } else {
//            System.out.println("Не превысили допуск");
//        }
        if (x <= deep && v <= deep && o <= deep) {
            System.out.println("Нет, не превысили допуск");
        }
        else {
            System.out.println("Хоть в одном, но превысили");
        }
        // есть деньги. Стоит авто с обемом таким-то и стоимостью такой-то.
        // Хотим купить авто с объемом не меньше такого-то. Подходит стоящее авто?
        int moneyAll = 100;
        int car = 200; // объем авто
        int carSell = 800; // цена авто
        int need = 500; // нужный объем
        if (car >= need && moneyAll >= carSell) {
            System.out.println("Объем и цена подходит");
        } else {
            System.out.println("Ищем другое авто");
        }

        System.out.println();
        // ДЗ  есть 3 товара по цене и кол-ву. Ессть деньги. Хотим купить все, но рассмотреть варианты

        int pr1 = 120; // pr- цена товаров
        int pr2 =150;
        int pr3 = 100;

        int q1 = 2; //кол во товаров
        int q2 = 9;
        int q3 = 5;

        int all1 = pr1 * q1; //сколько денег нужно на каждый товар, в целом
        int all2 = pr2 * q2;
        int all3 = pr3 * q3;

        int moneyFor = 680;


        if (moneyFor > all1 || moneyFor > all2 || moneyFor > all3) {
            System.out.println("Можем купить какой-то из товаров");
        } else if (moneyFor > all1 && moneyFor > all2 && moneyFor > all3) {
            System.out.println("Можем купить весь товар");
        } else if (moneyFor > all1 || moneyFor < all2 || moneyFor < all3) {
            System.out.println("Хватает денег только на первый товар");
        } else if (moneyFor > all1 && moneyFor > all2 && moneyFor < all3) {
            System.out.println("Хватает денег только на первый и второй товар");
        } else if (moneyFor < all1 && moneyFor > all2 && moneyFor > all3) {
            System.out.println("Хватает денег только на второй и третий товар");
        } else if (moneyFor > all1 && moneyFor < all2 && moneyFor > all3) {
            System.out.println("Хватает денег только на первый и третий товар");
        } else {
            System.out.println("Ничего не получится купить");
        }

        System.out.println();
        //есть 2 чиссла  ессть еще 2 числа. Каждая пара  устанавливает диапазон. Есть число. Входит ли число хоть в какой-то диапазон?

        int num1 = 273;
        int num2 = 954;

        int num3 = 123;
        int num4 = 78;

        int diffNum = 513;

        if (diffNum >=num1 && diffNum <=num2 || diffNum >= num3 && diffNum <= num4) {
            System.out.println("Входит в диапазон одной из пары чисел");
        } else {
            System.out.println("Не входит в диапазон одной из пары чисел");
        }

        System.out.println();
        // поменять переменные и назначить их значения в порядке возрастания от маленького к большому
        int i = 3;
        int h = -1;
        int r = -6;

//        if (i > r && i > h) {
//            System.out.println("Значение " + i + " самое большое");
//        } else  if (h > i && h > r) {
//            System.out.println("Значение " + h + " самое большое");
//        } else if (r > i && r > h) {
//            System.out.println("Значение " + r + " самое большое");
//        } else if (i > r && h > r && h < i) {
//            System.out.println("Значение " + h + " на втором месте по возрастанию");
//        } else if (h > r && i < h && i > r) {
//            System.out.println("Значение " + i + " на втором месте по возрастанию");
//        } else if (r > i && r < h && h < i) {
//            System.out.println("Значение " + r + " на втором месте по возрастанию");
//        } else if (i < h && i < r) {
//            System.out.println("Значение " + i + " на третьем месте по возрастанию");
//        } else if (h < i && h < r) {
//            System.out.println("Значение " + h + " на третьем месте по возрастанию");
//        } else {
//            System.out.println("Значение " + r + " на третьем месте по возрастанию");
//        }
        if (h < i && h < r) {
            int l = i;
            i = h;
            h = l;

        } if (r < i && r < h) {
            int z = i;
            i = r;
            r = z;
        } if (r < h) {
            int e = h;
            h = r;
            r = e;
        }
            System.out.println("i ="+ i + " h =" + h + " r =" + r);

        //есть температура воздуха и влажность. Есть переменная СИГНАЛ, зависящая  от этих двух переменных.
        // Если  темпер  не выше  23 и влажность не ниже 90%, то сигнал принимает значение 100 иначе -20
        int temp = 25;
        int hum = 50;
        int sign;

        if (temp <= 23 && hum >= 90) {
            sign = 100;
        } else {
            sign = -20;
        }
        System.out.println("Сигнал = "+ sign);
        sign = temp<=23 &&hum >= 90 ? 100 : -20;
        System.out.println("Сигнал = "+ sign);
        //ессть 2 переменные. Есть третья с именем макс. Записать в нее максимальное значение из первых двух
        int n = 80;
        int u = 56;
        int max;

        if (n > u) {
            max = n;
        } else {
            max = u;
        }
        System.out.println("Максимальное значение = "+ max);
        max = n > u ? n : u; // тернарный оператор
        String s = "House";
        //Есть влажность воздуга. В переменную стринг записать влажно или сухо, в зависимости от  значения в переменной влажность
        int humi1 = 80;
        String humidity;
        humidity = humi1 > 90 ? "Влажно" : "Сухо";

        // есть 3 чиссла типа инт. Найти макссимальное произведение двух чисел

        int numb1 = 102;
        int numb2 = 76;
        int numb3 = 39;

        int mult1 = numb1 * numb2;
        int mult2 = numb1 * numb3;
        int mult3 = numb2 * numb3;

        if (mult1 > mult2 && mult1 > mult3) {
            System.out.println("Максимальное произведение двух чисел: " + mult1);
        } else if (mult2 > mult3 && mult2 > mult1){
            System.out.println("Максимальное произведение двух чисел: " + mult2);
        } else {
            System.out.println("Максимальное произведение двух чисел: " + mult3);
        }

        //есть расстояние. Ехали 2 дня  с разной скоростью разное время. Тернарным ответить на вопрос или доехали до цели

        int distance = 1250;

        int speedDiff1 = 20;
        int speedDiff2 = 50;
        int timeDiff1 = 8;
        int timeDiff2 = 6;
        String result;

        int aim = (speedDiff1 * timeDiff1) + (speedDiff2 * timeDiff2);

        result = aim >= distance ? "Доехали" : "Не доехали";
        System.out.println(result);
        //есть 2 диапазона чисел. Есть число. Попало ли число хоть в один из диапазонов?

        }


    }

