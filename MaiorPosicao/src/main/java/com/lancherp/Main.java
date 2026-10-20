package com.lancherp;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.print("Quantos numeros vopce vai digitar: ");
        double[] vect = new double[sc.nextInt()];
        double maior = 0;
        int posicao = 0;
        for (int i = 0; i< vect.length;i++){

            System.out.print("Digite um numero:");
            vect[i] = sc.nextDouble();
            double u = 0;

            if (vect[i] > maior){
                posicao = i;
                maior = vect[i];

            }

        }

        System.out.println("Maior valor = "+ maior);
        System.out.print("Posicao do maior valor = "+posicao);

    }
}