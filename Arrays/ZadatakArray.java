package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{4, 6, 7, 13, 56, 21, 23, 44, 19, 88};
        int sum = intArray[1] + intArray[3] + intArray[5] + intArray[7] + intArray[9];
        System.out.println("Jednodimenzionalni niz: " + Arrays.toString(intArray) + "\n");
        System.out.println("Zbir svake druge vrijednosti niza je = " + sum + "\n");

        int[][] _ddArray = new int[][]{{45, 65, 48}, {884, 28, 73}, {4, 6, 7}};
        System.out.println(Arrays.toString(_ddArray[0]));
        System.out.println(Arrays.toString(_ddArray[1]));
        System.out.println(Arrays.toString(_ddArray[2]));

        System.out.println();
        System.out.println("Prikaz [1][1] elemnta u nizu je: " + _ddArray[1][1]);
        int zbirKolone = _ddArray[0][0] + _ddArray[1][0] + _ddArray[2][0];
        System.out.println("\nZbir vrijednosti 0 kolone niza je= " + zbirKolone);

    }
}
