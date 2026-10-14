package com.lancherp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int x = 0;
        int a = 0;
        int in = 0;
        int out = 0;

        System.out.println("Quantos numeros deseja: ");
        n = sc.nextInt();

        for (x = 1; x <= n; x++ ){

            a = sc.nextInt();

            if (a >= 10 && a <= 20){

                in += 1;
            }else {
                out +=1;
            }

        }

        System.out.println(in+ " in");
        System.out.println(out+ " out");


    }
}