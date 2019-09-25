package com.domanski.daniel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kalkulator");
        String operacja;
        do {
            operacja = pobierzOperacje();
            switch (operacja) {
                case "+":
                    System.out.println("Dodawanie");
                    break;
                case "-":
                    System.out.println("Odejmowanie");
                    break;
                case "*":
                    System.out.println("Mnożenie");
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
