package com.lancherp;

import Entities.Employce;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employce employce = new Employce();

        System.out.print("Nome: ");
        employce.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        employce.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employce.tax = sc.nextDouble();

        System.out.println("Employee: " + employce.name+", $ "+ String.format("%.2f", employce.netSalary()));


        System.out.print("Wich percentage to increse salary:");


        employce.increaseSalary(sc.nextDouble());

        System.out.println("Update data: " + employce );



    }
}