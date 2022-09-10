package arrays;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;


public class Array1 {
    public static void main(String[] args) {
        int[] array = {-1, 2, 6, 7, 5, 0};
        int size = array.length;
        System.out.println(size);
        array[5] = 9;
        System.out.println(array[5]);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int a = 5; a >= 0; a--) {
            System.out.print(array[a] + " ");
        }
        double[] array1 = new double[50];
        System.out.println();
        System.out.println(Arrays.toString(array1));
        boolean[] array2 = new boolean[]{true, false, 5 > 0, array1.length != 5};
        System.out.println(Arrays.toString(array2));

        //1)  есть массив типа чар со знначениями. Определить наименьшую по алфавиту букву

        char[] array3 = {'u', 'b', '!', '/', '('};

        char ch = 'z';

        for (int u = 0; u < array3.length; u++) {

            if (array3[u] >= 97 && array3[u] <= 122 && array3[u] < ch) {
                ch = array3[u];
            }
        }
        System.out.println("Наименьшая буква " + ch);


        //2) ес ть массив типа булень. Помнять в нем все тру на фолс и наоборот
        boolean[] array4 = {true, false, true, false, true, false};

        for (int i = 0; i < array4.length; i++) {
            array4[i] = !array4[i];
//                if (array4[i] == true){
//                    array4[i] = false;
//                }else {
//                    array4[i] = true;
//                }
        }

        System.out.println(Arrays.toString(array4));

        // 3)есть массив типа инт. Поменять в ннем все отрицательные на положительные и наоборот
        int[] ar = {1, 2, -3, 4, -5, -4};

        for (int i = 0; i < ar.length; ar[i] *= -1, i++) ;
        ; // ar[i] = ar[i] * -1;
//                if (ar[i] < 0) {
//                    ar[i] = -ar[i];
//                }else {
//                    ar[i] = -ar[i];
//                }

        System.out.println(Arrays.toString(ar));

        // 4)найти сумму четных элементов на нечетных позициях в массиве
        int[] arr = {1, 2, 3, 4, 6, 7};
        int s = 0; //нечетные
        int a = 0; //четные
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0 && arr[i] % 2 == 0) {
                s += arr[i];
            }
        }
        System.out.println("Сумма четных элементов " + s);

        int[] age = {82, 61, 16, -54};
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));
        //Найти  макссимум в массиве типа дабл
        int[] arrays = {56, 98, 2, 984, 25, 32, 984};
        Arrays.sort(age);
        System.out.println("Наибольший элемент " + arrays[arrays.length - 1]);

        //1) в массиве типа инт найти максимальное произведение 2-х чиссел
        int i = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        int[] val = {52, 65, -69, 85, 21, 13, 44, -660};
        Arrays.sort(val);
        if (val[val.length - 1] * val[val.length - 2] > i) {
            i = val[val.length - 1] * val[val.length - 2];
        }
        if (val[0] * val[1] > c) {
            c = val[0] * val[1];
        }
        if (i > c) {
            System.out.println("Максимальное значение произведения 2-х чисел " + i);
        } else {
            System.out.println("Максимальное значение произведения 2-х чисел " + c);
        }

        // 2) в массиве типа дабл все положит  увеличить в 1.5 раза, а отрицательные уменьшить в 2 раза

        double[] variab = {42.8, 85.6, -81.3, -98, 15.8};

        for (int v = 0; v < variab.length; v++) {
            double var = variab[v];
            variab[v] = (double) (Math.round(variab[v] * 10) / 10.0); //??

            if (variab[v] > 0) {
                variab[v] = (Math.round(variab[v] * 1.5 * 10) / 10.0);

            }
            if (variab[v] < 0) {
                variab[v] = (Math.round(variab[v] / 2 * 10) / 10.0);
            }
        }
        System.out.println(Arrays.toString(variab));


        // 3) в массиве типа  чар найти сумму цифр

        char[] digit = {'t', '6', '/', 'e', '3', '9', '{', '0'};
        int counter = 0;

        for (int t = 0; t < digit.length; t++) {
            if (digit[t] >= 48 && digit[t] <= 57) {
                counter = digit[t] + counter - 48;
            }
        }
        System.out.println("\nСумма цифр в массиве " + counter);
        int[] arrayList = {23, 68, 68, 69, 18, 69, 77, 35, 99, 48};
        int[] arrayList1 = new int[5];
        System.arraycopy(arrayList, 3, arrayList1, 0, 5);
        System.out.println(Arrays.toString(arrayList1));
        //есть 2 массива. Склеить их
        int[] arrayList2 = {58, 63, 24, 74, 20};
        int[] arrayList3 = {77, 96, 58, 47, 30, 1, 3};
        int[] newArray = new int[arrayList2.length + arrayList3.length];
        System.arraycopy(arrayList2, 0, newArray, 0, arrayList2.length);
        System.arraycopy(arrayList3, 0, newArray, 5, arrayList3.length);
        System.out.println(Arrays.toString(newArray));

//        1) есть массив. Удалить у него первую ячейку
        int[] arrayNew = {54, 36, 94, 27, 73};
        int[] arrayDel = new int[arrayNew.length - 1];
        System.arraycopy(arrayNew, 1, arrayDel, 0, arrayNew.length - 1);
        System.out.println(Arrays.toString(arrayDel));

        // 2)тоже , но последнюю ячейку
        System.out.println("2)тоже , но последнюю ячейку");
        int[] arrayNew1 = {-6, -55, 66, 14, -39, 88, 18};
        int[] arrayLast = new int[arrayNew1.length - 1];
        System.arraycopy(arrayNew1, 0, arrayLast, 0, arrayNew1.length - 1);
        System.out.println(Arrays.toString(arrayLast));

        // 3) есть массив и еще один инт - номер ячейки для удаления
        System.out.println("3) есть массив и еще один инт - номер ячейки для удаления");
        int[] ar1 = {9, 3, 25, -78, 31};

        int toBeDeleted = 2;
        int[] arrayCh = new int[ar1.length - 1];

        System.arraycopy(ar1, 0, arrayCh, 0, toBeDeleted);
        System.arraycopy(ar1, toBeDeleted + 1, arrayCh, toBeDeleted, ar1.length - toBeDeleted - 1);

        System.out.println(Arrays.toString(arrayCh));


        // 4)фсть массив и 2 инта. Первый инт - куда вставлять, второй - что
        System.out.println("4)фсть массив и 2 инта. Первый инт - куда вставлять, второй - что");

        int[] mass = {8, 6, 11, -88, -34, 48};
        int insert1 = 3; //ячейка, куда вставлять
        int place1 = 8888; //что вставляем
        mass[insert1] = place1;
        int[] arrayNewOne1 = new int[mass.length];

        System.arraycopy(mass, 0, arrayNewOne1, 0, mass.length);
        System.out.println(Arrays.toString(arrayNewOne1));

//есть массив и 2 инта - номера позиций с и по какую цдалить ячейки
        System.out.println("есть массив и 2 инта - номера позиций с и по какую цдалить ячейки");
        int[] num = {6, 9, 7, 3, 58, 21, 34, 54, 1, -98, -4, 333};
        int pos = 3;
        int pos1 = 9;
        int sum = pos1 - pos + 1;
        int[] numNew = new int[num.length - sum];

        System.arraycopy(num, 0, numNew, 0, pos);
        System.arraycopy(num, pos1 + 1, numNew, pos, num.length - sum - pos);
        System.out.println(Arrays.toString(numNew));

        //ессть массив удалить 0 ячейку форомл
        System.out.println("ессть массив удалить 0 ячейку форомл");
        int[] newTask = {8, 36, -41, 78, -13, 55};
        int[] afterRem = new int[newTask.length - 1];
        for (int m = 0; m < newTask.length - 1; m++) {
            newTask[m] = newTask[m + 1];

        }
        System.arraycopy(newTask, 0, afterRem, 0, newTask.length - 1);
        System.out.println(Arrays.toString(afterRem));

        System.out.println("ессть массив удалить последнюю ячейку форомл");
        int[] newTask1 = {8, 36, -41, 78, -13, 55};
        int[] afterRem1 = new int[newTask1.length - 1];
        for (int m = newTask1.length - 1; m > 0; m--) {
            newTask1[m] = newTask1[m - 1];

        }
//        System.arraycopy(newTask, 0, afterRem, 0, newTask.length - 1);
        System.out.println(Arrays.toString(newTask1));
        // есть массив типа инт и еще один инт . Фором удалитьэту ячейку
        int[] arrCell = {23, -65, -33, 74, 25};
        int index = 2;
        int[] arrCellNew = new int[arrCell.length - 1];
        for (int q = 0; q < arrCell.length; q++) {

            if (q < index) {
                arrCellNew[q] = arrCell[q];
            }
            if (q > index) {
                arrCellNew[q - 1] = arrCell[q];
            }
        }
        System.out.println(Arrays.toString(arrCellNew));
        //есть массив и 2 инта. первый что в стави ть, второй - куда - фором
        int[] arSum = {65, 58, 0, 25, 5, 3};
        int input = 55897;
        int placeToIns = 4;
        int[] arSumNew = new int[arSum.length + 1];
        for (int xc = 0; xc < arSum.length; xc++) {
            if (xc < placeToIns) {
                arSumNew[xc] = arSum[xc];
            }
            if (xc > placeToIns) {
                arSumNew[xc + 1] = arSum[xc];
            }
            if (xc == placeToIns) {
                arSumNew[xc] = input;
            }
        }
        System.out.println(Arrays.toString(arSumNew));

        System.out.println("adjfadsfkasjdkfk");
        long r = 2526328;
        String d = String.valueOf(r);
        char[] fd = d.toCharArray();
        Arrays.sort(fd);
        System.out.println(fd);
        for (int index123 = fd.length - 1, g = 0; index123 >= fd.length/2; index123--, g++){
            char t = fd[index123];
            fd[index123] = fd[g];
            fd[g] = t;
        }
        System.out.print(Arrays.toString(fd));

    }
}