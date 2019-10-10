package com.domanski.daniel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kalkulator :)");
        String operacja;
        do {
            System.out.print("Podaj liczbe1 = ");
            double liczba1 = pobierzLiczbe();

            System.out.print("Podaj liczbe2 = ");
            double liczba2 = pobierzLiczbe();

            operacja = pobierzOperacje();
            switch (operacja) {
                case "+":
                    Kalkulator.dodaj(liczba1, liczba2);
                    break;
                case "-":
                    Kalkulator.odejmij(liczba1, liczba2);
                    break;
                case "*":
                    Kalkulator.pomnoz(liczba1, liczba2);
                    break;
                case "/":
                    System.out.println("Dzielenie");
                    break;
            }
        } while (!operacja.equals("x"));
    }

    public static double pobierzLiczbe() {
        Scanner myObj = new Scanner(System.in);
        return Double.parseDouble(myObj.nextLine());
    }

    public static String pobierzOperacje() {
        System.out.println("Wybierz operację jaką chcesz wykonać +, -, *, /");
        return new Scanner(System.in).nextLine();
    }
}
