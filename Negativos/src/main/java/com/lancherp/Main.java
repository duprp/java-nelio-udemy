package com.lancherp;

import java.util.Locale;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros vc vai digitar: ");
        int [] vect = new int[sc.nextInt()];

        for (int i=0; i < vect.length; i++){

            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();

        }

        System.out.println("Numeros negativos:");

        for (int numero : vect){

            if (numero < 0){
                System.out.println(numero);
            }
        }


    }
}