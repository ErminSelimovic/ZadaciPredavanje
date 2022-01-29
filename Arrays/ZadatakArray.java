package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{4,6,7,13,56,21,23,44,19,88};
        int sum = intArray[0]+intArray[1]+intArray[2]+intArray[3]+intArray[4]+intArray[5]+intArray[6]+intArray[7]+intArray[8]+intArray[9];
        System.out.println("Zbir svih brojava u nizu je Suma = " +sum+ "\n");

        int[][] _ddArray = new int[][]{{45,65,48},{884,28,73}};
        System.out.println(Arrays.toString(_ddArray[0]));
        System.out.println(Arrays.toString(_ddArray[1]));

        System.out.println();
        System.out.println("Prikaz [1][1] elemnta u nizu je: " +_ddArray[1][1]);

    }
}
