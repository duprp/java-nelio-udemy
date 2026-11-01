package com.lancherp;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and heigth: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        rectangle.width=a;
        rectangle.heigth=b;

        System.out.println(rectangle.toString());



        sc.close();

    }
}