package com.lancherp;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor: ");
        double[] vec = new double[sc.nextInt()];

        double media = 0;

        for (int i = 0; i < vec.length; i++){
            System.out.print("Digite um numero:");
            vec[i] = sc.nextDouble();
        }
        double sum = 0;

        for (double m : vec){
            sum += m;
            media = sum / vec.length;

        }

        System.out.println("Media do vetor = " + media);

        for (double m : vec){

            if (m < media ){
                System.out.println(m);
            }

        }


        sc.close();
    }
}