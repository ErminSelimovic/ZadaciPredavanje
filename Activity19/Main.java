package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //Prvi zadatak

        System.out.print("Koliko brojeva želite da unesete: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int brojac = 0;
        int i = 0;
        StringBuilder nudism4 = new StringBuilder();
        int div4 = 0;
        do {

            System.out.printf("Unesite broj [%d]:", (i + 1));
            numbers[i] = scan.nextInt();
            if (numbers[i] == 0) {
                break;
            }

            brojac++;
            i++;
        } while (brojac != n);

        for (int number : numbers) {
            if (number % 4 == 0 && number != 0) {
                nudism4.append(",").append(number);
                div4++;
            }
        }
        if (div4 > 0) {
            System.out.println(div4 + ". broja su djeljiva sa 4, a to su " + nudism4.substring(1) + ".");
        }


        //Drugi zadatak


        ArrayList<String> stringList = new ArrayList<>();
        System.out.println("Molimo Vas u nastavku unesite 4 stringa");
        for (int j = 0; i < 4; i++) {
            System.out.printf("String [%d]: ", (j + 1));
            stringList.add(scan.nextLine());
        }

        System.out.println("\nOvo su stringovi koje ste unosili.");
        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("\nOvo su stringovi koji nemaju više od 4 spacea.");
        for (String str : stringList) {
            String[] space4 = str.split(" ");
            if (space4.length < 5) {
                System.out.println(str);
            }
        }


        //Treći zadatak

        LinkedList<Double> doubleNums = new LinkedList<>();
        LinkedList<Double> greaterThen5 = new LinkedList<>();
        LinkedList<Double> lessThen5 = new LinkedList<>();


        System.out.println("Molimo Vas unesite double vrijednosti brojeva.\nZa prekid unesite 0");
        double num = -1.0;
        while (num != 0.0) {

            System.out.print("Broj: ");
            num = scan.nextDouble();
            doubleNums.add(num);

            if (num <= 5.0 && num != 0) {
                lessThen5.add(num);
            } else if (num > 5.0) {
                greaterThen5.add(num);
            }
        }


        System.out.println("\nBrojevi manji od 5");
        System.out.println("----------------------------------");
        System.out.printf("%10s    |    %10s", "Prije", "Poslije");
        System.out.println();
        System.out.println("----------------------------------");

        for (double numless5 : lessThen5) {
            System.out.printf("%10.2f    |    %10.2f\n", numless5, (Math.ceil(numless5)));
        }


        System.out.println("\nBrojevi veći od 5");
        System.out.println("----------------------------------");
        System.out.printf("%10s    |    %10s", "Prije", "Poslije");
        System.out.println();
        System.out.println("----------------------------------");

        for (double grett5 : greaterThen5) {
            System.out.printf("%10.2f    |    %10.2f\n", grett5, (Math.floor(grett5)));
        }
        
    }

}

