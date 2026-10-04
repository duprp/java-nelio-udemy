package com.lancherp;

import entities.Account;
import exceptions.DomainException;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            sc.nextLine();
            System.out.print("Initial balancer: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawlimit = sc.nextDouble();

            Account conta = new Account(number, holder, balance, withdrawlimit);


            System.out.print("Enter amount for withdraw: ");

        try {
            conta.withdraw(sc.nextDouble());
            System.out.printf("New balance: %.2f%n", conta.getBalance());
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }


        sc.close();


    }
}