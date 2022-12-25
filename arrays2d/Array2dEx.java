package arrays2d;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array2dEx {
    public static void main(String[] args) {
        int[][] array = {{2, -3, 6, 4, 1},
                {6, 5},
                {0, 1, 2, 7},
                {1, 1, 2, 3, 8, 4},
                {9, 13}};
        int size = 0;
        size = array.length;
        System.out.println("Размер вертикального массива " + size);
        System.out.println(array[3][4]);
        array[2][3] = 16;
        System.out.println(array[2][3]);
        System.out.println(array[2].length);
        System.out.println(Arrays.deepToString(array));
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                System.out.print(array[a][b] + " + ");
            }
            System.out.println();
        }
        for (int q = 0; q < array.length; q++) {
            System.out.println(Arrays.toString(array[q]));
        }
        System.out.println();
        // создание матрицы

        int[][] arrayMat = new int[3][4];
        for (int a = 0; a < arrayMat.length; a++) {
            System.out.println(Arrays.toString(arrayMat[a]));
        }
        System.out.println();

        //есть массив 2д типа инт. Найти в нем второй максимум
        System.out.println("есть массив 2д типа инт. Найти в нем второй максимум");
        int[][] aRray = {{2, 106, 4, 1},
                {6, -5, 13, 28},
                {0, -1, 200891, 7},
                {3, 2, 13, 4, 7}};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int a = 0; a < aRray.length; a++) {
            for (int b = 0; b < aRray.length; b++) {
                if (aRray[a][b] > max1) {
                    if (max1 > max2) {
                        max2 = max1;
                    }
                    max1 = aRray[a][b];
                }
            }
        }
        System.out.println(max2);


        // есть 2д-массив тпа инт. Сделать оборотня. 1- в новом массиве, второй случай - в том же
        System.out.println("есть 2д-массив тпа инт. Сделать оборотня. 1- в новом массиве, второй случай - в том же");

        int[][] arrray = {{23, 6, 4, 1, 77},
                {6, -5, 8, 69, 74},
                {100, -1, 2, 7},
                {98, 21}};

        for (int x = 0; x < arrray.length; x++) {
            for (int y = arrray[x].length - 1, index1 = 0; y >= arrray[x].length / 2; y--, index1++) {
                int w = arrray[x][y];
                arrray[x][y] = arrray[x][index1];
                arrray[x][index1] = w;
            }
        }
        for (int b = 0; b < arrray.length; b++) {
            for (int c = 0; c < arrray[b].length; c++) {
                System.out.print(arrray[b][c] + " ");
            }
            System.out.println();
        }

        System.out.println("есть 2д-массив тпа инт. Сделать оборотня. 1- в новом массиве");
        int[][] ar3 = {{23, 6, 4, 1, 77},
                {6, -5, 8, 69, 74},
                {100, -1, 2, 7},
                {98, 21}};

        int[][] arNew3Er = new int[ar3.length][];

        for (int x = 0; x < arNew3Er.length; x++) {
            int[] ar1d = new int[ar3[x].length];
            for (int o = ar3[x].length - 1, j = 0; o >= 0; o--, j++) {
                ar1d[j] = ar3[x][o];
            }
            arNew3Er[x] = ar1d;
        }
        System.out.println(arNew3Er.length);
        System.out.println();

        //1) есть 2д массив типа инт. отсортировать его
        System.out.println("есть 2д массив типа инт. отсортировать его");

        int[][] sort = {{34, 91, -3, 54, -88, 3},
                {2, 3, 0, 74},
                {53, -9, -32, 1},
                {-7, 3},
                {-66, 32, 20}};

        int length1 = 0;


        for (int w = 0; w < sort.length; w++) {
            for (int i = 0; i < sort[w].length; i++) {
                length1++;
            }
        }
        int[] sort1 = new int[length1];
        int p = 0;
        for (int s = 0; s < sort.length; s++) {
            for (int h = 0; h < sort[s].length; h++) {
                sort1[p++] = sort[s][h];
            }
        }
        System.out.println(Arrays.toString(sort1));
        Arrays.sort(sort1);
        System.out.println(Arrays.toString(sort1));

        int length2 = 0;
        int[][] sort3 = new int[length2][length2];
        int m1 = 0;

        for (int y = 0; y < sort1.length; y++) {
            length2++;
        }

        for (int t = 0; t < sort.length; t++) {
            for (int f = 0; f < sort[t].length; f++) {
                sort[t][f] = sort1[m1++];

            }
        }
        for (int t = 0; t < sort.length; t++) {
            for (int f = 0; f < sort[t].length; f++) {
                System.out.print(sort[t][f] + " ");
            }
            System.out.println();
        }


        //есть массив 2д разложить его в 1д массив
        System.out.println("есть массив 2д разложить его в 1д массив");

        int[][] ar2d = {{4, 91, -3, 54, -88, 3},
                {2, 3, 0, 74},
                {53, -9, -32, 1},
                {-7, 3},
                {-66, 32, 20}};

        int length = 0;

        for (int a = 0; a < ar2d.length; a++) {
            for (int b = 0; b < ar2d[a].length; b++) {
                length++;
            }
        }
        int[] arCh = new int[length];
        int c = 0;
        for (int n = 0; n < ar2d.length; n++) {
            for (int m = 0; m < ar2d[n].length; m++) {
                arCh[c++] = ar2d[n][m];
            }
        }
        System.out.println(Arrays.toString(arCh));

        // создать матрицу

        System.out.println("создать матрицу");

        int[][] matAr = {{23, 6, 4, 1},
                {6, -5, 8, 69},
                {100, -1, 2, 7},
                {98, 21, 8, -3}};

        for (int t = 0; t < matAr.length; t++) {
            System.out.println(Arrays.toString(matAr[t]));
        }
        System.out.println();

        //int a = 4, print
        // 0
        // 1 0
        // 2 1 0
        // 3 2 1 0
        // 4 3 2 1 0

        System.out.println("int a = 4, print");
        int a = 4;

        for (int b = 0; b <= a; b++) {
            for (int r = b; r >= 0; r--) {
                System.out.print(r + " ");
            }
            System.out.println();
        }


        // заполнить матрицу данными в циклах так
        //3 2 2
        //1 3 2
        //1 1 3
        System.out.println("заполнить матрицу данными в циклах так");

        int[][] data = new int[3][3];

        for (int e = 0; e < data.length; e++) {
            for (int f = 0; f < data[e].length; f++) {
                if (e > f) {
                    data[e][f] = 1;
                }
                if (e < f) {
                    data[e][f] = 2;
                }
                if (e == f) {
                    data[e][f] = 3;
                }
                System.out.print(data[e][f] + " ");
            }
            System.out.println();
        }

        //
        int[][] aRdata = new int[3][];

        int[] aVar = {2, 5, 1};

        aRdata[0] = aVar;
        aRdata[1] = new int[60];
        aRdata[2] = new int[30];

        for (int q = 0; q < aRdata.length; q++) {
            System.out.println(Arrays.toString(aRdata[q]));
        }
        System.out.println();

        // есть 2д прямоуг массив и2  инт числа. Первое - какой столбец, второе - сколько раз в этом столбце прокрутить значенияч вниз
        System.out.println("есть 2д прямоуг массив и2  инт числа. Первое - какой (строка) столбец, второе - сколько раз в этом столбце прокрутить значенияч вниз");

        int[][] down = {{3, 6, 4, 1},
                {68, -75, -6, 7},
                {-50, -1, 2, 7},
                {-8, 21, 58, 0}};

        int column = 1;
        int much = 2;
        int x = column;

        for (int d = 0; d < much; d++) {
            int num = down[x][down[x].length - 1];
            for (int y = down[x].length - 1; y > 0; y--) {
                down[x][y] = down[x][y - 1];
            }
            down[x][0] = num;
        }
        for (int q = 0; q < down.length; q++) {
            for (int r = 0; r < down[q].length; r++) {
                System.out.print(down[q][r] + " ");
            }
            System.out.println();
        }
        // есть квадр 2д массив. Вывести в первом случае все элементы в виде закрашеного треугольника черного, второй вариант - треугольник красный
        System.out.println("есть квадр 2д массив. Вывести в первом случае все элементы в виде закрашеного треугольника черного, " +
                "второй вариант - треугольник красный");

        int[][] square = {{3, 6, 4, 1},
                {68, -75, 6, 9},
                {-50, -1, 2, 7},
                {-8, 21, 58, 14}};

        for (int a1 = 0; a1 < square.length; a1++) {
            for (int b = 0; b <= a1; b++) {
                System.out.print(square[a1][b] + " ");
            }
            System.out.println();
        }

        //треугольник красный
        System.out.println("triangle is red");

        int[][] square2 = {{3, 6, 4, 1},
                {68, -75, 6, 9},
                {-50, -1, 2, 7},
                {-8, 21, 58, 14}};


        for (int a2 = 0; a2 < square2.length; a2++) {
            for (int b2 = 0; b2 < square2[a2].length; b2++) {
                if (a2 == 0 && b2 < 3 || a2 == 1 && b2 < 2 || a2 == square2.length - 2 && b2 < 1) {
                    System.out.print("   ");

                } else
                    System.out.print(square2[a2][b2] + " ");
            }

            System.out.println();
        }

        // это 2 задания. Первое - напечатать бублик
        System.out.println("это 2 задания. Первое - напечатать бублик");

        int[][] square3 = {{3, 6, 4, 1},
                {68, -75, 6, 9},
                {-50, -1, 2, 7},
                {-8, 21, 58, 14}};

        for (int l = 0; l < square3.length; l++) {
            for (int j = 0; j < square3[l].length; j++) {
                if (l == 0 || l == square3[0].length - 1 || j == 0 || j == square3.length - 1) {
                    System.out.print(square3[l][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //второе - сердцевину от массива
        System.out.println("второе - сердцевину от массива");

        int[][] square4 = {{3, 6, 4, 1},
                {68, -75, 6, 9},
                {-50, -1, 2, 7},
                {-8, 21, 58, 14}};

        for (int l = 0; l < square4.length; l++) {
            for (int j = 0; j < square4[l].length; j++) {
                if (l == 0 || j == 0 || l == square3.length - 1 || j == square3.length - 1 || l == 0 && j == l++ && j == square3.length - 1
                        || l == 0 && j == l++ && j == square3.length - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(square4[l][j] + " ");
                }

            }
            System.out.println();
        }
        // есть 2д прямоуг массив и2  инт числа. Первое - какой столбец, второе - сколько раз в этом столбце прокрутить значенияч вниз
        System.out.println("есть 2д прямоуг массив и2  инт числа. Первое - какой столбец, второе - сколько раз в этом столбце прокрутить значенияч вниз");

        int[][] columnAr = {{3, 6, 4, 1},
                {68, -75, -6, 7},
                {-50, -1, 2, 7},
                {-8, 21, 58, 0}};

        int d = 2;// столбик
        int n = 2;// how many times

        for (int z = 0; z < n; z++) {
            int number = columnAr[columnAr.length - 1][d];
            for (int f = columnAr[z].length - 1; f > 0; f--) {
                columnAr[f][d] = columnAr[f - 1][d];
            }
            columnAr[0][d] = number;
        }
        for (int q = 0; q < columnAr.length; q++) {
            for (int r = 0; r < columnAr[q].length; r++) {
                System.out.print(columnAr[q][r] + " ");
            }
            System.out.println();
        }
        //создать копию массива
        System.out.println("создать копию массива");
        int[][] array2d = {{3, 6, 4, 1, 8},
                {68, -75, -6, 7, 41},
                {-50, -1, 2, 7},
                {-8, 21, 58, 0}};


        int[][] copy2d = new int[array2d.length][];

        for (int q = 0; q < array2d.length; q++) {

            copy2d[q] = new int[array2d[q].length];
            for (int e = 0; e < array2d[q].length; e++) {
                copy2d[q][e] = array2d[q][e];
                System.out.print(copy2d[q][e] + " ");
            }
            System.out.println();
        }
        // сколько цифр в числе
        System.out.println("сколько цифр в числе");
        int d1 = 19112;

        int number = 0;

        int max = Integer.MIN_VALUE;
        for (; d1 != 0; d1 /= 10) {
            number++;

            int bigData = d1 % 10;
            if (bigData > max) {
                max = bigData;
            }

        }

        System.out.println("цифр в числе" + number);
        System.out.println("наибольшее число " + max);

        //2 принимаем 2д массив и 2 инта - номера  столбцов, значения которых надо обменять
        int[][] ar2dcon = {{53, -27, 4, 1},
                {68, -75, -6, 7},
                {18, 1, 2, 78},
                {8, 21, 58, 89, 6}};

        int y = 1;
        int o = 3;

        for (int q = 0; q < ar2dcon.length; q++) {
            for (int s = 0; s < y; s++) {
                int temp = ar2dcon[q][y];
                ar2dcon[q][y] = ar2dcon[q][o];
                ar2dcon[q][o] = temp;
            }
        }

        for (int c2 = 0; c2 < ar2dcon.length; c2++) {
            for (int g = 0; g < ar2dcon[c2].length; g++) {
                System.out.print(ar2dcon[c2][g] + " ");
            }
            System.out.println();
        }
        //1) принимаем стринговский массив и печатаем те стриннги, у которых есть цифры

        String[] example = {"tddss", "6", "ffr78", "6622", "r", "./941"};

        for (int a1 = 0, index = 0; a1 < example.length; a1++) {
            String current = example[a1];

            char[] cur = current.toCharArray();
            for (int y1 = 0; y1 < cur.length; y1++) {
                if (cur[y1] >= 48 && cur[y1] <= 57) {
                    System.out.print(current + " ");
                    break;
                }
            }
        }

        //принимаем двумерный массив , сортируем столбцы
        System.out.println("\nпринимаем двумерный массив , сортируем столбцы");
        int[][] multArray =    {{53, 111, 4, 120},
                                {68, -75, -6, 7},
                                {18, 1, 2, 78},
                                {8, 21, 58, 89}};

        int lengthColumn = 3;
        int len = multArray[lengthColumn].length;
        int[] transf = new int[len];
        for (int hu = 0; hu < len; hu++){
            transf[hu] = multArray[hu][lengthColumn];
        }
        Arrays.sort(transf);
        for (int huw = 0; huw < transf.length; huw++){
            multArray[huw][lengthColumn] = transf[huw];
        }

        for (int finish = 0; finish < multArray.length; finish++){
            for (int finCol = 0; finCol < multArray[finish].length; finCol++){
                System.out.print(multArray[finish][finCol] + " ");
            }
            System.out.println();
        }

        // создать массив   х_х_х_
//                          _х_х_х_
        //                  х_х_х_
        System.out.println("создать массив");
        char letter = 'x';
        char sp = 32;
        int row = 10;
        int col = 20;
        int depl = 0;
        char[][] arrayOfX = new char[row][col];
        for(int f = 0; f < row; f++){
            for (int w = 0; w < col; w++){
                if(w %2 == 0 && f %2 == 0 || w %2 != 0 && f %2 != 0){
                    arrayOfX[f][w] = letter;
                }
                else {
                    arrayOfX[f][w] = sp;
                }
            }
        }
        for(int fq = 0; fq < arrayOfX.length; fq++) {
            for (int wq = 0; wq < arrayOfX[fq].length; wq++) {
                System.out.print(arrayOfX[fq][wq] + " ");
            }
            System.out.println();
        }



    }


}
















