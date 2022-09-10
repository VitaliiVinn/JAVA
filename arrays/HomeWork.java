package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
        // 4)фсть массив и 2 инта. Первый инт - куда вставлять, второй - что
        System.out.println("4)фсть массив и 2 инта. Первый инт - куда вставлять, второй - что");

        int[] mass = {8, 6, 11, -88, -34, 48};
        int insert1 = 5; //ячейка, куда вставлять
        int place1 = 8888; //что вставляем
        int[] arrayNewOne1 = new int[mass.length];
        for (int a = 0; a < insert1 || a < mass.length; a++) {
            arrayNewOne1[a] = mass[a];

        }
        arrayNewOne1[insert1] = place1;
        System.out.println(Arrays.toString(arrayNewOne1));

        // 1) есть 2 массива. Склеить их фором
        System.out.println("есть 2 массива. Склеить их фором");
        int[] array = {8, 5, 3, 88, 1, 22};
        int[] array1 = {32, 18, 55};
        int[] arraDbl = new int[array.length + array1.length];

        for (int v = 0, index = 0; v < arraDbl.length; v++) {

            arraDbl[v] = v < array.length ? array[v] : array1[index++];
//            if (v < array.length) {
//                arraDbl[v] = array[v];
//            } else {
//                arraDbl[v] = array1[index++];
//            }
        }
        System.out.println(Arrays.toString(arraDbl));

        // 2)есть массив и 2 инта - с какой по какую позицию удалить - фором
        System.out.println("2)НА ПРОВЕРКУ есть массив и 2 инта - с какой по какую позицию удалить - фором");
        int[] ar = {78, 63, 33, 41, 13, 25};
        int q1 = 1;
        int q2 = 2;
        int sum1 = q2 - q1 + 1;

        int[] arNew = new int[ar.length - sum1];

        for (int l = 0; l < ar.length; l++) {
            if (l < q1) {
                arNew[l] = ar[l];
            }
            if (l > q2) {
                arNew[l - sum1] = ar[l];
            }
        }
        System.out.println(Arrays.toString(arNew));
//        System.out.println(Arrays.toString(ar1New));

        // 3) есть 2 массива и инт - номер позиции для вставки второго массива в первый
        System.out.println("3) НОВАЯ есть 2 массива и инт - номер позиции для вставки второго массива в первый");
        int[] arrayOne = {30, 4, 81, 22, 17, 57};
        int[] arrayTwo = {61, 93, 10, 78, 9};

        int insert = 4;
//        int index1 = 0;
        int[] arInsert = new int[arrayOne.length + arrayTwo.length];
        for (int m = 0, index1 = 0, index2 = 0; m < arInsert.length; m++) {
            if (m < insert) {
                arInsert[m] = arrayOne[m];
            } else if (m >= insert && index1 < arrayTwo.length) {
                arInsert[m] = arrayTwo[index1++];
            } else {
                arInsert[m] = arrayOne[insert++];
            }

        }
        System.out.println(Arrays.toString(arInsert));

        //есть массив и 2 инта. первый что в стави ть, второй - куда - фором
        System.out.println("НОВАЯ есть массив и 2 инта. первый что в стави ть, второй - куда - фором");
        int[] arSum = {65, 58, 0, 25, 5, 3};
        int input = 55897;
        int placeToIns = 4;
        int[] arSumNew = new int[arSum.length];
        for (int xc = 0; xc < placeToIns || xc < arSum.length; xc++) {
            arSumNew[xc] = arSum[xc];
        }
        arSumNew[placeToIns] = input;

        System.out.println(Arrays.toString(arSumNew));
        //есть массив типа инт. Смешать его элементы случайным образом
        System.out.println("НОВАЯ есть массив типа инт. Смешать его элементы случайным образом");

        Random rnd = new Random();
        int[] arRnd = {8, 6, 22, 74, 7, 93};

        for (int s = 0; s < arRnd.length; s++) {
            int w = rnd.nextInt(arRnd.length);
            int a = arRnd[w];
            arRnd[w] = arRnd[s];
            arRnd[s] = a;
        }
        System.out.println(Arrays.toString(arRnd));
        // есть массив. Сделать новый - оборотень
        System.out.println("НОВАЯ есть массив. Сделать новый - оборотень");
        int[] arrs = {199, 2, 3, 67, 5, 6, 7};
        int[] arrsNew = new int[arrs.length];
        for (int t = arrs.length - 1, index3 = 0; t >= 0; t--) {

            arrsNew[index3++] = arrs[t];
        }
        System.out.println(Arrays.toString(arrsNew));

        // оборотень на месте без создания нового
        System.out.println("оборотень на месте без создания нового");
        int[] spec = {6, 8, 20, 99, 3, 41};
        for (int f = spec.length - 1, index4 = 0; f >= spec.length / 2; f--, index4++) {
            int v = spec[f];
            spec[f] = spec[index4];
            spec[index4] = v;
        }
        System.out.println(Arrays.toString(spec));

        //есть массив типа инт.Создать новый, в котором будут только положительные элементы
        System.out.println("02.06 есть массив типа инт.Создать новый, в котором будут только положительные элементы");
        int[] longAr = {-9, 2, -85, 15, -30, 79, 0}; // 2  15  79
        int counter = 0;

        for (int g = 0; g < longAr.length; g++) {
            if (longAr[g] > 0) {
                counter++;
            }
        }
        int[] longArNew = new int[counter];
        for (int j = 0, k = 0; j < longAr.length; j++) {
            if (longAr[j] > 0) {
                longArNew[k++] = longAr[j];
            }
        }
        System.out.println(Arrays.toString(longArNew));

        // 1) есть массив типа чар. Заменить в нем все большиее буквы маленькими и наоборот
        System.out.println("1) есть массив типа чар. Заменить в нем все большиее буквы маленькими и наоборот");
        char[] charity = {'A', 'r', 'W', 'p', '/', '@', 'q', '2'};

        for (int l = 0, index6 = 0; l < charity.length; l++, index6++) {

            charity[l] = Character.isLowerCase(charity[l]) ? Character.toUpperCase(charity[l]) : Character.toLowerCase(charity[l]);

//                if(Character.isLowerCase(charity[l])) {
//                   charity[l] = Character.toUpperCase(charity[l]);
//                }
//            else {
//                charity[l] = Character.toLowerCase(charity[l]);
//            }
        }
        System.out.println(Arrays.toString(charity));

        // 2) есть массив типа инт с равным количеством положит  и отрицат  элементов.
        // Расставить элементы в шахматном порядке (отриц - положит - отриц - полож ...)
        System.out.println("2) есть массив типа инт с равным количеством положит  и отрицат  элементов.\n" +
                "        // Расставить элементы в шахматном порядке (отриц - положит - отриц - полож ...)");
        int[] diff = {-12, -57, 1, 110, 94, -3, 51, -56, -27, -88, 63, 97};

        int counter1 = 0;
        int counter2 = 0;

        for (int y = 0; y < diff.length; y++) {
            if (diff[y] > 0) {
                counter1++;
            } else if (diff[y] < 0) {
                counter2++;
            }
        }
        int[] diffNew = new int[counter1];
        int[] diffNew2 = new int[counter2];
        for (int t = 0, u = 0, z = 0; t < diff.length; t++) {
            if (diff[t] < 0) {
                diffNew[u++] = diff[t];
            }
            if (diff[t] > 0) {
                diffNew2[z++] = diff[t];
            }
        }

        int[] diffNew3 = new int[diffNew.length + diffNew2.length];
        for (int w = 0, e = 0, i = 0; w < diffNew3.length; w++) {
            if (w % 2 == 0) {
                diffNew3[w] = diffNew[e++];
            }
            if (w % 2 != 0) {
                diffNew3[w] = diffNew2[i++];
            }
        }

        System.out.println(Arrays.toString(diffNew3));

        // 3) есть массив типа инт. Найти в нем второй по величине максимум
        System.out.println("3) есть массив типа инт. Найти в нем второй по величине максимум");
        int[] arMax = {8, 1, 65, 14, 65, 38, -41, 65, 3, 65, -7};
        int max = Integer.MIN_VALUE;

        Arrays.sort(arMax);
        System.out.print(Arrays.toString(arMax));

        for (int m = arMax.length - 1; m >= 0; m--) {
            if (arMax[m] != arMax[arMax.length - 1]) {
                max = arMax[m];
                break;
            }
        }
        System.out.println("Второе максимальное " + max);

        // 2) есть масив типа инт. Прокрутить его все элементы вправо на 2 позиции
        System.out.println("2) есть масив типа инт. Прокрутить его все элементы вправо на 2 позиции");
        int[] toRight = {65, 25, 12, 73, 58, -96};
        int k = 3;

        for (int b = 0; b < k; b++) {
            int numb = toRight[toRight.length - 1];

            for (int z = toRight.length - 1; z > 0; z--) {
                toRight[z] = toRight[z - 1];
            }
            toRight[0] = numb;
        }
        System.out.println(Arrays.toString(toRight));

        // 2) есть масив типа инт. Прокрутить его все элементы вправо на 2 позиции
        System.out.println("2) есть масив типа инт. Прокрутить его все элементы ВЛЕВО на 2 позиции");
        int[] toLeft = {65, 25, 12, 73, 58, -96};
        k = 2;

        for (int b = 0; b < k; b++) {
            int numb = toLeft[0];
            int z;

            for (z = 0; z < toLeft.length - 1; z++) {
                toLeft[z] = toLeft[z + 1];
            }
            toLeft[z] = numb;
        }
        System.out.println(Arrays.toString(toLeft));
        //есть массив типа чар,  и подсчитать кого больше - грасніх или согласніх
        System.out.println("есть массив типа чар,  и подсчитать кого больше - грасніх или согласніх");
        char[] arrayLet = {'Q', 'p', 'e', '/', '@', 'R', 'u', 'T', 'o', 'y', ',', '-', 'i', 'a', 'Y'};
        int counter4 = 0;
        int counter5 = 0;

        for (int a = 0; a < arrayLet.length; a++) {

            if (arrayLet[a] >= 'a' && arrayLet[a] <= 'z' || arrayLet[a] >= 'A' && arrayLet[a] <= 'Z') {
                if (arrayLet[a] == 'a' || arrayLet[a] == 'e' || arrayLet[a] == 'i' || arrayLet[a] == 'o' || arrayLet[a] == 'u'
                        || arrayLet[a] == 'y') {
                    counter4++;
                }
            } else {
                counter5++;
            }
        }
        if (counter4 > counter5) {
            System.out.println("Гласных больше");
        }
        if (counter4 == counter5) {
            System.out.println("Гласных и согласных поровну");
        }
        if (counter4 < counter5) {
            System.out.println("Согласных больше");
        }

        //в массиве типа чар найти сумму четных цифр
        System.out.println("в массиве типа чар найти сумму четных цифр");
        char[] oddEv = {'8', '6', '0', '9', '2', '4', '3', '#', '%', '1', '5', '7', '1'};
        int counter6 = 0;

        for (int x = 0; x < oddEv.length; x++) {
            if (oddEv[x] >= 48 && oddEv[x] <= 57 && oddEv[x] % 2 == 0) {
                counter6 = oddEv[x] + counter6 - 48;
            }
        }
        System.out.println(counter6);
        //есть массив типа инт. Подсчитать количество каждого элемента в нем
        System.out.println("//есть массив типа инт. Подсчитать количество каждого элемента в нем");
        int[] aRray = {95, 36, 36, 2, -3, -3, -95, 8, 22, 4, 22, -22};

        int counter7 = 0;

        for (int x = 0; x < aRray.length; x++) {
            int sum = 0;
            for (int f = 0; f < x; f++) {
                if (aRray[f] == aRray[x]) {
                    sum++;
                }
            }
            if (sum != 0) {
                continue;
            }
            for (int j = x; j < aRray.length; j++) {
                if (aRray[x] == aRray[j]) {
                    counter7++;
                }

            }
            System.out.println(aRray[x] + "-" + counter7 + " шт.");
            counter7 = 0;
        }


        // 1) шахматі
        System.out.println("2) есть массив типа инт с равным количеством положит  и отрицат  элементов.\n" +
                "        // Расставить элементы в шахматном порядке (отриц - положит - отриц - полож ...)");
        int[] diffQ = {-12, -57, 1, 110, 94, -3, 51, -56, -27, -88, 63, 97, 33, -47};

//        int counter1 = 0;
//        int counter2 = 0;
        Arrays.sort(diffQ);
        System.out.println(Arrays.toString(diffQ));

        for (int y = 1, u = diffQ.length - 2; y < diffQ.length / 2; y = y + 2, u = u - 2) {
            int g = diffQ[y];
            diffQ[y] = diffQ[u];
            diffQ[u] = g;
        }
        System.out.println(Arrays.toString(diffQ));

        // в масссиве типа инт удалить все отрицательные элементы
        System.out.println("в масссиве типа инт удалить все отрицательные элементы");

        int[] arDel = {0, -88, -91, 0, 8, 6, 66, -6, 3, -51, -8, -555, 0, 37, -11, 0, -84, 0, -18, 95}; // 0 8 6 66 3 0 37  0 0 0 000000
        for (int a = 0; a < arDel.length; a++) {
            if (arDel[a] < 0) {
                for (int c = a; c < arDel.length; c++) {
                    if (arDel[c] >= 0) {
                        int t = arDel[a];
                        arDel[a] = arDel[c];
                        arDel[c] = t;
                        break;
                    }
                }
            }
            if (arDel[a] < 0) {
                arDel[a] = 0;
            }
        }
        System.out.println(Arrays.toString(arDel));

        // в массиве типа инт все нулевые элементы сдвинуть в конец
        System.out.println("в массиве типа инт все нулевые элементы сдвинуть в конец");

        int[] arZero = {25, -6, 0, 84, -3, -7, 51, 37, 0, 0, 7};

        for (int d = 0; d < arZero.length; d++) {
            if (arZero[d] == 0) {
                for (int x = d + 1; x < arZero.length; x++) {
                    if (arZero[x] != 0) {
                        arZero[d] = arZero[x];
                        arZero[x] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arZero));
        //есть 1д массив типа чар. Сделать так, чтобы все цифры остались на месте а буквы зеркально отобразились в нем
        System.out.println("есть 1д массив типа чар. Сделать так, чтобы все цифры остались на месте а буквы зеркально отобразились в нем");
        char[] arLight = {'t', '5', '.', '%', '7', 'Q', '9', 'p', 'e', '?', '1', 'y', '3', '0', 'W', '4', '7', '2'};

        for (int q = 0; q < arLight.length; q++) {
            if (arLight[q] >= 'a' && arLight[q] <= 'z' || arLight[q] >= 'A' && arLight[q] <= 'Z') {
                for (int s = q; s < arLight.length; s++) {
                    if (arLight[s] >= 'a' && arLight[s] <= 'z' || arLight[s] >= 'A' && arLight[s] <= 'Z') {
                        char zz = arLight[q];
                        arLight[q] = arLight[s];
                        arLight[s] = zz;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arLight));

        //есть массив типа дабл. Определить или он симмеетричен относительно центра
        System.out.println("есть массив типа дабл. Определить или он симмеетричен относительно центра");
        double[] dbl = {3.25, 6, 9.1, 8.23, 45, 9.08, 4, 158, 66.48, 15, 8};

        boolean result = true;
        for (int d = 0, r = dbl.length - 1; d <= dbl.length / 2; d++, r--) {
            if (dbl[d] != dbl[r]) {
                result = false;
                break;
            }
        }
        if (result == true) {
            System.out.println("right");
        } else {
            System.out.println("no");
        }


        int[] arrayUs = {65, 6, -614, 971, -30, -14, 58, 37};
        int count = 0;

        for (int u = 0; u < arrayUs.length; u++) {
            if (arrayUs[u] > 0) {
                count++;
            }
        }
        int[] copyAr = new int[count];
        for (int k1 = 0, j = 0; k1 < arrayUs.length; k1++) {
            if (arrayUs[k1] > 0) {
                copyAr[j++] = arrayUs[k1];
            }
        }
        System.out.println(Arrays.toString(copyAr));

        //Ф-я принимае стринг и возвращает стринг где сначала цифры, потом гласные, потом согласные
        System.out.println("Ф-я принимае стринг и возвращает стринг где сначала цифры, потом гласные, потом согласные");
        String different = "String includes 24 digits";
        int counter12 = 0;
        int bejom = 0;
        String b = "";
        char[] withNum = different.toCharArray();
        for (int f = 0; f < withNum.length; f++) {
            if (withNum[f] >= 48 && withNum[f] <= 57) {
                counter12 = f;
                break;
            }

        }
        for (int b1 = 0; b1 < withNum.length; b1++) {
            if (withNum[b1] <= 47 && withNum[b1] >= 58) {
                bejom = b1;
                break;
            }
            System.out.println(bejom);
            b += withNum[b1];
        }
        for (int b1 = 0; b1 < withNum.length; b1++) {
            if (withNum[b1] <= 47 && withNum[b1] >= 58) {
                bejom = b1;
                break;
            }
            System.out.println(bejom);
            b += withNum[b1];
        }
        System.out.print(b);

    }
}




