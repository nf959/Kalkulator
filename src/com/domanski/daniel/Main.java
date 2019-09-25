package com.domanski.daniel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kalkulator");
    }

    public static double pobierzLiczbe(){

        Scanner myObj = new Scanner(System.in);
        double liczba = Double.parseDouble(myObj.nextLine());
        return liczba;
    }
}
