package string;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String text = "dkldl, 5 + 4 dddk; ; 616";
        char[] array = text.toCharArray();
        for (int w = array.length - 1; w >= 0; w--) {
            System.out.print(array[w] + " ");
        }
        System.out.println();
        sum("661ngj916");
        String[] example = {"tddss", "6", "ffr78", "6622", "r", "./941"};
        numString(example);
        String s = "";
        s = 5 + s + 12;
        System.out.println("\nПолучается " + s);
        quantity(8560);
        System.out.println("Слова, не содержащие цифры");
        System.out.println("стринги без цифр");
        String[] newStr = {"dasf45", "dfe", "99///78", "66qqq22", "1...9", "-ls!"};
        noNumber(newStr);
        sumNumbers(656622);
        sumNum(661644616);
        afterPoint(3.185561661);
        System.out.println("\nпринимаем  массив стрингов и находим тот, у которого сумма циффр наибольшая");
        String[] findTo = {"151ss", "53de55", "...dee55555", "sdsd854767", "ds/.8847167"};
        maxSum(findTo);
        String spec = "dkldl, 5 + 4_dddk; gvhjkhn56526 ; 616 szrd pjdheqe ,633hncjeQADif";
        System.out.println(spec);
        sortStr(spec);

//        sortStr(spec);
    }

    // ф-я принимает целое число и находит количество цифер в нем
    public static void quantity(int w) {
//        String q = "" + w;
//        char[] qua = q.toCharArray();
//        int sum = qua.length;
        System.out.println("Количество " + (w + "").toCharArray().length);

    }

    //ф-я принимает стринг и находит сумму его цифр
    public static void sum(String a) {
        int nun = 0;
        char[] array1 = a.toCharArray();
        for (int s = 0; s < array1.length; s++) {
            if (array1[s] >= 48 && array1[s] <= 57) {
                nun += array1[s] - 48;
            }
        }
        System.out.println("сумма цифр " + nun);
    }

    //1) принимаем стринговский массив и печатаем те стриннги, у которых есть цифры
    public static void numString(String[] example) {

        for (int a = 0; a < example.length; a++) {
            String current = example[a];
            char[] cur = current.toCharArray();
            for (int y1 = 0; y1 < cur.length; y1++) {
                if (cur[y1] >= 48 && cur[y1] <= 57) {
                    System.out.print(current + " ");
                    break;
                }
            }
        }
    }

    //2) тоже но стринги, у которых нгет цифер
    public static void noNumber(String[] newStr) {

        for (int l = 0; l < newStr.length; l++) {
            String current1 = newStr[l];
            char[] ch = current1.toCharArray();
            int summary = 0;
            for (int c = 0; c < ch.length; c++) {
                if (ch[c] >= 48 && ch[c] <= 57) {
                    summary++;
                    break;
                }
            }
            if (summary == 0) {
                System.out.print(current1 + " ");
            }
        }
    }

    //1) принимаем лонг и возвращаем сумму его цифр
    public static void sumNumbers(long p) {
        int sum = 0;

        while (p / 10 != 0) {
            sum += p % 10;
            p = p / 10;
        }
        System.out.println("\nСумма цифр числа p равна " + (p + sum));
    }

    // та же задача но стрингом
    public static void sumNum(long jo) {
        System.out.println("\nКоличество цифр в лонге " + (jo + "").toCharArray().length);
    }

    //2) прини маем  дабл и на ходит кол-во цифр после точки
    public static void afterPoint(double k) {

        String d = String.valueOf(k); // "" + k
        char[] aft = d.toCharArray();
        int counter = 0;
//        for(int h = 0; h < aft.length; h++){
//            if(aft[h] == 46){
//                for(int k1 = h + 1; k1 < aft.length; k1++) {
//                   counter++;
//                }
//            }
//        }
        for (int h = aft.length - 1; h >= 0; h--) {
            if (aft[h] == 46) {
                break;
            } else {
                counter++;
            }
        }
        System.out.print("\nПосле точки " + counter + " цифр");
    }

    //принимаем  массив стрингов и находим тот, у которого сумма циффр наибольшая
    public static void maxSum(String[] findTo) {
        int maxi = Integer.MIN_VALUE;
        String maxString = "";
        for (int t = 0; t < findTo.length; t++) {
            String cur = findTo[t];
            char[] myChar = cur.toCharArray();

            int sum = 0;
            for (int g = 0; g < myChar.length; g++) {
                if (myChar[g] >= 48 && myChar[g] <= 57) {
                    sum += myChar[g] - 48;

                }
            }
            if (sum > maxi) {
                maxi = sum;
                maxString = cur;
            }
        }
        System.out.println(maxString);
        System.out.println("Наибольшая сумма цифр " + maxi);
    }

    //принимаем стринг и отсортировываем стринги по алфавиту с конца
    public static void sortStr(String spec) {
        char[] der = spec.toCharArray();
        Arrays.sort(der);
        for (int j = der.length - 1; j >= 0; j--) {
            if (der[j] >= 97 && der[j] <= 122) {
                System.out.print(der[j] + " ");
            }
        }
    }
}



