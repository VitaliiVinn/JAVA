package functions;

import java.util.Arrays;

public class Function2 {
    public static void main(String[] args) {
        int sum = sum(5, 2);
        System.out.println("sum = " + sum);
        int j = sum + 3;
        int[] array = {5, -3, 4, 44};
        double average = mid(array);
        System.out.println(average);

        System.out.println("ф-я принимает массив интов и возвращает массив с только положительніми єлементами");
        int[] arrayUs = {65, 6, -614, 971, -30, -14, 58, 37};
        System.out.println(Arrays.toString(arrayUs));
        int[] newCop = arrayPositive(arrayUs);
        System.out.println(Arrays.toString(newCop));

        System.out.println("принимаем массив интов и возвр массив без повторений");
        int[] massive = {52, 90, 95, -37, 37, 52, 88, -2, 95, 88, 37, 3, 2, 88, 95};
        System.out.println(Arrays.toString(massive));
        int[] findRepeat = noRepeat(massive);
        System.out.println(Arrays.toString(findRepeat));

        System.out.println("принимаем массив и возвращаем тру, если он симметри чный относительео центра");
        int[] arMas = {71, -100, 3, -9, -9, 3, -100, 71};
        boolean k = trueRet(arMas);
        System.out.println(k);
        System.out.println("ф-я принимает масив и еще 1 инт и возвращает номер позиции, где находится этот инт или -1  если его нет");
        int[] oneMore = {85, 66, 9, -15, 3, 7, 23};
        int a = 3;
        int output = number(oneMore, a);
        System.out.println(output);
        System.out.println("принимаем 2 массива и возвращаем тру, если все элементы второго есть в первом");
        int[] arOne = {95, 20, 36, 1, 45, 301, 98, 50};
        int[] arTwo = {9660};
        boolean el = elements(arOne, arTwo);
        System.out.println(el);
        System.out.println("ф-я принимает целое число и возвращает тру если оно простое");
        int f = 10;
        boolean newOne = ret(f);
        System.out.println(newOne);
        System.out.println("ф-я принимает дабл и возвращает количество цифр до  точки");
        double i = 247.65481615;
        int g = retNumbers(i);
        System.out.println("Number of digits is " + g);

        System.out.println("ф-я принимает стринг и возвращает стринг без пробелов по краям");
        String someStr = " some people wants to do incredible things ";
        String jac = noSpace(someStr);
        System.out.println(jac);

        System.out.println("принимаем стринг  и еще один чар и возвращаем массив стрингов, полученных разбиением " +
                "стринга этим чаром на састи");
        String one = "Stay with your own thought";
        char two = ' ';
        String[] str = partlyDivided(one, two);
        System.out.println(Arrays.toString(str));

        System.out.println("лучше такое реши. Принимаем стринг, возвращаем стринг где ссначала числа а потом букві");
        String hash = "He is 36 and he was there 332 days ago";
        String m = numbLet(hash);
        System.out.println(m);

        System.out.println("Ф-я принимае стринг и возвращает стринг где сначала цифры, потом гласные, потом согласные");
        String different = "String includes 24 digits";
        String l = numAndLet(different);
        System.out.println(l);

        System.out.println("ф-я принимает дабл и возвращает дабл наоборот  Double.parseDouble");
        double d = 52.67;
        double ret = anotherWay(d);
        System.out.println(ret);

        System.out.println("тоже с лонгом наоборот   3456   6543");
        long k2 = 51236647;
        long m2 = retDigits(k2);
        System.out.println(m2);

        System.out.println("принимаем 2 массива типа инт и возвращаем тру если вессь второй есть в первом");
        int[] longAr = {1, 2, 3, 1, 2, 4, 1, 3, 6};
        int[] shortAr = {1, 3};
        boolean fo = arra(longAr, shortAr);
        System.out.println(fo);

        System.out.println("принимаем 2 иннта и возвращаем тот инт, у которого сумма цифр больше");
        int f3 = 6000001;
        int m3 = 3225;
        int answer = moreSum(f3, m3);
        System.out.println(answer);

        System.out.println("принимаем лонг и возвращаем лонг, в котором вце цифры стоят от большего до меньшего");
        long e = 2526328;
        long ar = digOrder(e);
        System.out.println(ar);

        System.out.println("ф-ия принимает 2  массива и возвращает победителя. В нашем случае - это Саша, " +
                "так как у него самый высокий результат\n" +
                "    //в подходе - 21. Второе место занял Кирюша, у него такой же результат, " +
                "но сумма всех результатот меньше, чем у саши");
        String[] players = {"Иван", "Вася", "Петя", "Кирилл", "Саша"};
        int[][] quantity = {{12, 1, 13, 17, 2},
                {10, 2, 17, 14, 11},
                {0, 11, 15, 9, 8},
                {1, 2, 21, 2, 3},
                {12, 4, 21, 13, 5}
        };
        String version = winner(quantity, players);
        System.out.println(version);

        System.out.println("1)ф-я принимает стринг и возвращает стринг( 2a3c2d - >aacccdd)");
        String digLett = "2a3c2d";
        String msr = letters(digLett);
        System.out.println(msr);

        System.out.println("2)ф-я принимает стринг и возвращает такой стринг()aaaadddf - 4a3d1f");
        String dL = "aaaadddf";
        String mf = returnSame(dL);
        System.out.println(mf);

        System.out.println("ф-я принимает массив интов и возвращает сумму цифр этих чисел");
        int[] given = {-9, 5, 88, 0, 13, -50};
        int returned = sumAllOfDig(given);
        System.out.println(returned);

        System.out.println("В-я принимает целое число и возвращает тру, если оно является числом армстронга");
        int isArmstrong = 16345;
        boolean c = check(isArmstrong);
        System.out.println(c);

        System.out.println("ф-я принимает инт и чситает сколько троек (3)  в числах от 0 до него");
        int anyNumber = 35;
        int numb = 3;
//        int find = countOfThree(anyNumber);
        int find = counterOfThree(anyNumber, numb);
        System.out.println("Количество цифр 3 от 0 и до заданного числа - " + find);

        System.out.println("принимаем массив и возвращаем массив без повторов");
        int[] inp = {108, 108, 108, 9, 71, -55, -55, -55, 17, 52, 11, -82, 55, 9, 17, 46, 71, 88, 45, 106, 38, 10, 10, 10, 10};
        int[] no = noRep(inp);
        System.out.println(Arrays.toString(no));

        System.out.println("принимаем массив - возвр  самое часто встречаю  значение");
        int[] dig = {17, 111, 17, -55, 17, 52, 17, -82, 55, 111, 17, 111, 71, 88, 17, 106, 38, 99, 111, 0, 0, 0, 0, 0 ,0, 0};
        int go = howOften(dig);
        System.out.println(go);


    }

    //принимаем массив - возвр  самое часто встречаю  значение
    public static int howOften(int[] dig) {
        Arrays.sort(dig);
        System.out.print(Arrays.toString(dig));
        int max = Integer.MIN_VALUE;
        int quant = 0;
        for (int f = 0; f < dig.length; f++) {
            int counter = 0;
            for (int index1 = 0; index1 < dig.length; index1++) {
                if (dig[f] == dig[index1]) {
                    counter++;
                }
            }
            if(counter > max){
                max = counter;
                quant = dig[f];
            }
        }
        return quant;
    }

    //принимаем массив и возвращаем массив без повторов
    public static int[] noRep(int[] inp) {
        Arrays.sort(inp);
        int find = 0;
        for (int e = 0; e < inp.length; e++) {
            for (int a = e + 1; a < inp.length; a++) {
                if (inp[e] != inp[a]) {
                    find++;
                    e = a - 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(inp));
        System.out.println(find);
        int[] update = new int[find];
        find = 0;
        for (int i = 0; i < inp.length; i++) {
            for (int n = i + 1; n < inp.length; n++) {
                if (inp[i] != inp[n]) {
                    update[find++] = inp[i];
                    i = n - 1;
                    break;
                }
            }
        }
        return update;
    }

    //ф-я принимает инт и чситает сколько троек (3)  в числах от 0 до него
    public static int counterOfThree(int anyNumber, int numb) {
//        int[] arFor = new int[anyNumber];
        int counterOfThree = 0;
        for (int h = 0; h <= anyNumber; h++) {
//            arFor[h] = h + 1;
            char[] g = (h + "").toCharArray();
            for (int b = 0; b < g.length; b++) {
                if (g[b] == numb + 48) {
                    counterOfThree++;
                }
            }
        }
//        String intToStr = Arrays.toString(arFor);
//        char[] strToChar = intToStr.toCharArray();
//        int counterOfThree = 0;
//        int inputNecessaryDigit = 51;
//        for (int w = 0; w < strToChar.length; w++) {
//            if (strToChar[w] == inputNecessaryDigit) {
//                counterOfThree++;
//            }
//        }
        return counterOfThree;

    }

    //В-я принимает целое число и возвращает тру, если оно является числом армстронга
    public static boolean check(int isArmstrong) {
        int sumOfNumb = 0;
        String ofInt = Integer.toString(isArmstrong);
        String[] ary = ofInt.split("");
        int[] numb = new int[ary.length];
        int exponent = numb.length;
        boolean wtf = true;

        for (int q = 0; q < numb.length; q++) {
            numb[q] = Integer.parseInt(ary[q]);
            numb[q] = (int) Math.pow(numb[q], exponent);
            sumOfNumb += numb[q];
            if (sumOfNumb == isArmstrong) {
                wtf = true;
            } else {
                wtf = false;
            }
        }
        return wtf;
    }

    //ф-я принимает массив интов и возвращает сумму цифр этих чисел
    public static int sumAllOfDig(int[] given) {
        int summary = 0;
        String m = "";
        char[] d = Arrays.toString(given).toCharArray();
        System.out.println(d);
        for (int p = 0; p < d.length; p++){
            if(d[p] >= 48 && d[p] <=57){
                summary += d[p] - 48;
            }

        }
//        for (int p = 0; p < given.length; p++) {
//            int j = given[p];
//            while (j != 0) {
//                summary += j % 10;
//                j = j / 10;
//            }
//        }
        return summary;
    }

    //    //1)ф-я принимает стринг и возвращает стринг( 2a3c2d7п3в - >aacccdd)
    public static String letters(String digLett) {
        char[] g = digLett.toCharArray();
        String x = "";
        for (int i = 0; i < g.length; i = i + 2) {
            for (int f = 0; f < g[i] - 48; f++) {
                x += g[i + 1];
            }
        }
        return x;
    }

    //2)ф-я принимает стринг и возвращает такой стринг aaaadddf - 4a3d1f
    public static String returnSame(String let) {
        char[] rez = let.toCharArray();
        String t = "";
        int counter = 0;
        for (int e = 0, index = e; e < rez.length; e++) {
            if (rez[e] == rez[index]) {
                counter++;

                if( e == rez.length - 1){
                    t += counter + "" + rez[e];
                    break;
                }
            }
            else {
               t += counter + "" + rez[e - 1];
                index = e;
                e--;
                counter = 0;
            }
        }
        return t;
    }

    // ф-ия принимает 2  массива и возвращает победителя. В нашем случае - это Саша, так как у него самый высокий результат
    //в подходе - 21. Второе место занял Кирюша, у него такой же результат, но сумма всех результатот меньше, чем у саши

    //Иван Вася Петя Кирилл Саша
    public static String winner(int[][] quantity, String[] players) {
        int sumResult = 0; //максимальная сумма результатов победителя
        int maxIndex = 0;// номер строки где победитель
        int maxRs = Integer.MIN_VALUE; //макс результат строки
        for (int y = 0; y < quantity.length; y++) {
            int[] k = quantity[y];
            int sum = sum(k);
            Arrays.sort(k);
            if (k[k.length - 1] > maxRs && sumResult < sum) {
                maxRs = k[k.length - 1];
                maxIndex = y;
                sumResult = sum;
            } else if (k[k.length - 1] == maxRs && sumResult < sum) {
                maxRs = k[k.length - 1];
                sumResult = sum;
            }
        }
        return players[maxIndex];
    }

    public static int sum(int[] newAr) {
        int sum = 0;
        for (int o = 0; o < newAr.length; o++) {
            sum += newAr[o];
        }
        return sum;

    }

    // принимаем 2 иннта и возвращаем тот инт, у которого сумма цифр больше

    public static int moreSum(int f3, int m3) {
        int buffer = f3;
        int buffer2 = m3;
        int countF3 = 0;
        int sumF3 = 0;
        int countM3 = 0;
        int sumM3 = 0;

        while (buffer / 10 != 0) {
            countF3 += buffer % 10;
            buffer = buffer / 10;
            sumF3 = buffer + countF3;
        }
        while (buffer2 / 10 != 0) {
            countM3 += buffer2 % 10;
            buffer2 = buffer2 / 10;
            sumM3 = buffer2 + countM3;
        }
        if (sumF3 > sumM3) {
            return f3;
        } else {
            return m3;
        }
    }
    //принимаем лонг и возвращаем лонг, в котором вце цифры стоят от большего до меньшего

    public static long digOrder(long e) {
        String v = String.valueOf(e);
        String empty = "";
        char[] charOfThisString = v.toCharArray();
        Arrays.sort(charOfThisString);
        for (int r = charOfThisString.length - 1; r >= 0; r--) {
            empty += charOfThisString[r];
        }
        long pars = Long.parseLong(empty);
        return pars;
    }

    //принимаем 2 массива типа инт и возвращаем тру если вессь второй есть в первом
    public static boolean arra(int[] longAr, int[] shortAr) {

        int t = 0;
        label:
        for (int i = 0; i < shortAr.length; i++) {
            for (int h1 = t; h1 < longAr.length; h1++) {
                if (shortAr[i] != longAr[h1]) {
                    t = h1 + 1;
                    i = -1;
                    continue label;

                } else {
                    return true;
                }
            }

        }
        return false;
    }

    //Ф-я принимае стринг и возвращает стринг где сначала цифры, потом гласные, потом согласные
    public static String numAndLet(String different) {
        char[] withNum = different.toCharArray();
        String c = "";
        String f = "";
        String b = "";

        for (int s = 0; s < withNum.length; s++) {
            if (withNum[s] >= 48 && withNum[s] <= 57) {
                c = withNum[s] + c;

            }
            if (withNum[s] >= 65 && withNum[s] <= 90 || withNum[s] >= 97 && withNum[s] <= 122) {

                if (withNum[s] == 65 || withNum[s] == 69 || withNum[s] == 73 && withNum[s] == 79 || withNum[s] == 85
                        || withNum[s] == 89 || withNum[s] == 97 || withNum[s] == 101 || withNum[s] == 105
                        || withNum[s] == 111 || withNum[s] == 117 || withNum[s] == 121) {
                    f = f + withNum[s];
                } else {
                    b = withNum[s] + b;

                }
            }
        }
        return c + f + b;
    }
    // 1) ф-я принимает дабл и возвращает дабл наоборот  Double.parseDouble ("2.45");

    public static double anotherWay(double d) {
        String v12 = "";
        String fer = d + "";

        char[] forStr = fer.toCharArray();
        for (int rpi = forStr.length - 1; rpi >= 0; rpi--) {

            v12 += forStr[rpi];
        }
        double h = Double.parseDouble(v12);
        return h;
    }

    // тоже с лонгом наоборот   3456   6543
    public static long retDigits(long k2) {
        String bu = "";
        String a = k2 + "";

        char[] stri = a.toCharArray();
        for (int cv = stri.length - 1; cv >= 0; cv--) {
            bu += stri[cv];

        }
        long ho = Long.parseLong(bu);
        return ho;

    }

    //ф-я принимает стринг и возвращает стринг без пробелов по краям

    public static String noSpace(String someStr) {
        String s = "";
        char[] charStr = someStr.toCharArray();

        int startPos = 0;
        int endPos = 0;
        for (int g = 0; g < charStr.length; g++) {
            if (charStr[g] != ' ') {
                startPos = g;
                break;
            }
        }
        for (int t = charStr.length - 1; t >= 0; t--) {
            if (charStr[t] != ' ') {
                endPos = t;
                break;
            }
        }
        for (int x = startPos; x <= endPos; x++) {
            s += charStr[x];
        }
        return s;
    }

    //принимаем стринг  и еще один чар и возвращаем массив стрингов, полученных разбиением стринга этим чаром на састи

    public static String[] partlyDivided(String one, char two) {
        char[] rez = one.toCharArray();
        int counter = 0;
        String f = "";
        for (int a = 0; a < rez.length; a++) {
            if (rez[a] == two) {
                counter++;
            }
        }
        String[] newR = new String[counter + 1];
        for (int q = 0, index = 0; q < rez.length; q++) {
            if (rez[q] != two) {
                f += rez[q];//f = f +
                if (q == rez.length - 1) {
                    newR[index] = f;
                }
            } else {
                newR[index++] = f;
                f = "";
                continue;
            }
        }

        return newR;

    }

    //лучше такое реши. Принимаем стринг, возвращаем стринг где ссначала числа а потом букві
    public static String numbLet(String hash) {
        char[] hgw = hash.toCharArray();

        String s = "";

        for (int i = 0; i < hgw.length; i++) {
            if (hgw[i] >= 48 && hgw[i] <= 57) {
                s = hgw[i] + s;
            }
            if (hgw[i] >= 65 && hgw[i] <= 90 || hgw[i] >= 97 && hgw[i] <= 122) {
                s = s + hgw[i];
            }

        }
        return s;

    }

    //  принимаем 2 массива и возвращаем тру, если все элементы второго есть в первом
    public static boolean elements(int[] arOne, int[] arTwo) {
        for (int r = 0; r < arTwo.length; r++) {
            int counter = 0;
            for (int g = 0; g < arOne.length; g++) {
                if (arTwo[r] == arOne[g]) {
                    counter++;
                    break;
                }

            }
            if (counter == 0) {
                return false;
            }

        }
        return true;
    }

    //ф-я принимает целое число и возвращает тру если оно простое
    public static boolean ret(int f) {
        for (int y = 2; y < f; y++) {
            if (f % y == 0) {
                return false;
            }
        }
        return true;
    }

    // ф-я принимает дабл и возвращает количество цифр до  точки
    public static int retNumbers(double i) {
        String k = String.valueOf(i);
        char[] strCh = k.toCharArray();
        int counter1 = 0;
        for (int h = strCh.length - 1; h >= 0; h--) {
            if (strCh[h] == 46) {
                break;
            } else {
                counter1++;
            }
        }
        return counter1;
    }


    //принимаем массив и возвращаем тру, если он симметри чный относительео центра
    public static boolean trueRet(int[] arMas) {
//        boolean w = true;
        for (int u = 0, p = arMas.length - 1; u < arMas.length / 2; u++, p--) {
            if (arMas[u] != arMas[p])
                return false;

//                w = true;

//            } else {
//                w = false;
//                break;
//            }
        }
//        return w;
        return true;

    }

    //ф-я принимает масив и еще 1 инт и возвращает номер позиции, где находится этот инт или -1  если его нет
    public static int number(int[] oneMore, int a) {
        for (int v = 0; v < oneMore.length; v++) {
            if (oneMore[v] == a) {
                return v;
            }
        }
        return -1;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    //ф-я  принимает массив типа инт и возвращает среднее арифметическое его положит элементов
    public static double mid(int[] array) {
        double summary = 0;
        double counter = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] >= 0) {
                summary += array[a];
            }
            if (array[a] >= 0) {
                counter++;
            }
        }
        double r = Math.round(summary / counter * 100) / 100.0;
        return r;
    }
    // 1) ф-я принимает массив интов и возвращает массив с только положительніми єлементами

    public static int[] arrayPositive(int[] arrayUs) {
        int count = 0;

        for (int u = 0; u < arrayUs.length; u++) {

            if (arrayUs[u] > 0) {
                count++;
            }
        }
        int[] copyAr = new int[count];
        for (int k = 0, j = 0; k < arrayUs.length; k++) {
            if (arrayUs[k] > 0) {
                copyAr[j++] = arrayUs[k];
            }
        }
        return copyAr;
    }

    //2) принимаем массив интов и возвр массив без повторений
    public static int[] noRepeat(int[] massive) {
        Arrays.sort(massive);
        int cou = 1;
        for (int s = 0; s < massive.length; s++) {
            for (int d = s + 1; d < massive.length; d++) {
                if (massive[s] != massive[d]) {
                    cou++;
                    s = d - 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("djkafjdkfdkaf " + cou);
        int[] newSuch = new int[cou];
        cou = 0;
        for (int d = 0; d < massive.length; d++) {
            for (int h = d + 1; h < massive.length; h++) {
                if (massive[d] != massive[h]) {
                    newSuch[cou++] = massive[d];
                    d = h - 1;
                    break;
                }
            }
        }
        return newSuch;
    }
}
