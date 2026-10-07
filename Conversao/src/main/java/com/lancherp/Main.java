package com.lancherp;

import Util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.println("What is the dollar price: ");
        double priceDollar = sc.nextDouble();
        System.out.println("How many dollar will be bought: ");
        double quantDollar = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.convert(priceDollar,quantDollar));


    }
}