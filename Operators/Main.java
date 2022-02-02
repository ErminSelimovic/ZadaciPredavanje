package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int firstNum = 9;
        int secNum = 4;

        System.out.println("Prvi broj je " +firstNum+" a drugi broj je " +secNum+"\n");

        System.out.println(firstNum +" + "+secNum+ " = "+(firstNum+secNum));
        System.out.println(firstNum +" - "+secNum+ " = "+(firstNum-secNum));
        System.out.println(firstNum +" * "+secNum+ " = "+(firstNum*secNum));
        System.out.println(firstNum +" / "+secNum+ " = "+(firstNum/secNum));
        System.out.println(firstNum +" % "+secNum+ " = "+(firstNum%secNum));

        double doubleVar = 4.5;
        doubleVar *= 2;
        System.out.println(doubleVar);

        String someText = "The world's first computer programmer was a renowned famale mathematican.";
        System.out.println("String: "+someText);
        String arrString [] = someText.split(" ");
        System.out.println(someText.toUpperCase(Locale.ROOT));
        System.out.println(Arrays.toString(arrString));


    }
}

