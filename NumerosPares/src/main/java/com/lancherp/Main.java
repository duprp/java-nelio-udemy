package com.lancherp;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int[] vect = new int[sc.nextInt()];
        int pares = 0;
        for (int qnt : vect){

            System.out.println("Digite um numero: ");
            qnt = sc.nextInt();

            if (qnt % 2 == 0){
                pares ++;
            }
        }

        System.out.println("Quantidade de numeros pares = "+ pares);

    }
}