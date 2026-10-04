package com.lancherp;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Acconut number: ");
        int number = sc.nextInt();
        sc.nextLine(); //limpexa de buffer
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        ContaBancaria conta = new ContaBancaria(number,name);

        System.out.print("Is there na initial deposit (y/n): ");
        char yn = sc.next().charAt(0);

        if (yn == 'y'){
            System.out.println("Enter the initial deposit value: ");
            conta.setDeposito(sc.nextDouble());
        }else {
            conta.setDeposito(0);
        }

        System.out.println(conta);

        System.out.print("Enter a deposit value: ");
        conta.setDeposito(sc.nextDouble());

        System.out.println(conta);

        System.out.println("Enter a with value: ");
        conta.setSaque(sc.nextDouble());

        System.out.println(conta);

        sc.close();

    }
}