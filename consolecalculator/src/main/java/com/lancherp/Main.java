package com.lancherp;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        float resultado;


        System.out.println("""
                1- SOMAR
                2- SUBTRAIR
                3- DIVIDIR
                4- MUTIPLICAR
                
                escolha uma opçao: """);



        try {
            int opc = sc.nextInt();

            System.out.println("Digite dois numeros: ");

            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();

            if (opc == 1) {

                System.out.println(operacoes.getSoma(num1, num2));

            } else if (opc == 2) {
                System.out.println(operacoes.getSub(num1, num2));

            } else if (opc == 3) {
                System.out.println(operacoes.getDiv(num1, num2));

            } else if (opc == 4) {
                System.out.println(operacoes.getMut(num1, num2));
            }

        }
        catch (RuntimeException e){
            System.out.println("error");
        }
        System.out.println("Fim!!");
        sc.close();

    }
}