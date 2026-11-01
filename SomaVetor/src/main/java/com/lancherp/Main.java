package com.lancherp;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros voce vai digitar: ");
        double[] vect = new double[sc.nextInt()];
        for (int i = 0; i < vect.length; i++){

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

        }

        System.out.print("Valores: ");

        for( double valores: vect){
            System.out.println(valores + " ");
        }

        double sum = 0;

        for (double valores : vect){

            sum += valores;
        }


        System.out.printf("Soma = %.2f%n",sum);
        System.out.printf("Media = %.2f%n",sum / vect.length);









    }
}