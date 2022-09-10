package variables;

public class Variables {
    public static void main(String[] args) {
        int res = 4 - 3; // 4 byte
        System.out.println(3467884442L);
        long cardNum = 2226555544118888L; // 8 byte
        int x = 2;
        int a = 3;

        int y = (2 * x - 3) / (4 * res) + (2 * a) / (1 + x);
        System.out.println("y=" + y);
        System.out.println(5 / 2);
        double s = 5 / 2.0;
        System.out.println(s);
        float f = 5 / 2f;
        System.out.println(f);
        a = 5;
        int b = 2;
        float c = (float) a / b;
        System.out.println(c);
        double n = 1.0 * a / b;
        System.out.println(n);
        double m = 1.0 * (2 * x - 3) / (4 * res) + (2.0 * a) / (1 + x);
        System.out.println(m);
        double q = 1.0 * Math.pow((2.0 * Math.pow(Math.PI, 1.0 / 7) + 1) / (3 * x) + Math.pow(Math.E, 0.72) * ((2 * a) / (1 + x)), 1.0 / 3);
        System.out.println(q);
        System.out.println("sum = "+(12.0 + 6.0));
        System.out.println(13 + 4 + " = sum");
        char h = '$';
        System.out.println("vasya".replace('a', h));
        char o = 72;
        System.out.println(o);
        int l = 'd';
        System.out.println(l);
        boolean compare = q>10;
        System.out.println(compare);
//  есть размеер обуви. Есть наш размер. Записать ответ, подходит ли  нам обувь
        int sizeOur = 40;
        int size = 48;
        boolean comp = size == sizeOur;
        System.out.println("Размер нам подходит " + comp);
        // есть 2 переменные типа  инт. Поменять в них значения местами
        int z = 5;
        int w = 3;
        int g = z;
        z = w;
        w = g;

        System.out.println("z= " +z );
        System.out.println("w= " + w);
         x = 5;
         x++; // x = x + 1;
        System.out.println("x = "+x);
        System.out.println("x = " + x++);//постфиксная форма  инкремента
        System.out.println("x = "+x);
        System.out.println("x = " + x++);
        System.out.println("x = " + x++);
        x =  6;
        int result = 12 + x++;
        System.out.println("result = "+ result);
        int v = 4;
        result = 10 + ++v; //префиксная форма инкремента
        System.out.println("result = "+ result);
        result/=3;// result = result / 3;
        result = 12;
        result/=4.7;
        System.out.println("result = "+result);
        //есть температура воздуха. Пойдем гулять если  температура не ниже 27. Пойдем гулять?
        int temp = 27;
        if (temp >= 27) {
            System.out.println("идем гулять");
        } else {
            System.out.println("at home");
        }
    }
}