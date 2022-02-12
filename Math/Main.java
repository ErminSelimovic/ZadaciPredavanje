package com.company;

public class Main {

    public static void main(String[] args) {
        double doubleNum1 = 54.2;

        System.out.println("Početna vrijednost: "+doubleNum1);
        System.out.println("Zaokruživanje vrijednosti na manju ili jednaku vrijednost:"
                +Math.floor(doubleNum1));

        int randNum1 = (int)(Math.random()*9+1);
        System.out.println("Dodjeljivanje random broja intNum1 varijbli: " +randNum1);

        int intNum1 = 65;
        int intNum2 = 9383;
        int intNum3 = 43;

        int maxNum1 = Math.max(intNum1,intNum2);
        int maxNum = Math.max(maxNum1,intNum3);
        System.out.println("Veći broj između brojeva "+intNum1+","+intNum2+" i "+intNum3+
                " je: " +maxNum);

        int minNum1 = Math.min(intNum1, intNum2);
        int minNum = Math.min(minNum1,intNum3);
        System.out.println("Najmanji broj između brojeva "+intNum1+","+intNum2+" i "+intNum3+
                " je: " +minNum);
    }
}
