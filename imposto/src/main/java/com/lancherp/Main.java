package com.lancherp;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();


        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i =1; i<=n; i++){

            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c): ");
            char ic = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            double anual = sc.nextDouble();

            if (ic == 'i'){

                System.out.print("Health expenditures: ");
                double saude = sc.nextDouble();

                Pessoa pessoa = new PessoaFisica(name,anual,saude);
                list.add(pessoa);

            }else {
                System.out.print("Number employees: ");
                int func = sc.nextInt();

                Pessoa pessoa = new PessoaJuridica(name,anual,func);
                list.add(pessoa);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0;
        for (Pessoa pessoa: list){

            System.out.println(pessoa.getNome() + ": $ "+ String.format("%.2f", pessoa.imposto()));
            sum+=pessoa.imposto();
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $ "+ String.format("%.2f",sum));

    }
}