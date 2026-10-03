package com.lancherp;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    System.out.print("Quantas pessoas serao digitadas: ");
        Pessoa[] vect = new Pessoa[sc.nextInt()];

        for(int i = 0; i < vect.length; i++){
            int u = i+1;
            System.out.println("Dados da "+ u +"a pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(name,age,altura);
        }
        double sum = 0;
        double porcentagem;
        int menor = 0;
        int tamanho = vect.length;

        for (Pessoa altura : vect){
            sum += altura.getAltura();

        }

        for (Pessoa idade:vect){
            if (idade.getIdade()<16){
                menor += 1 ;
            }
        }
        porcentagem = (double) menor / tamanho * 100;
        System.out.printf("Altura média: %.2f%n", sum/ vect.length);
        System.out.println("Pessoas com menros de 16 anos: "+ porcentagem + "%");

        for (Pessoa nomeMenor : vect){
            if (nomeMenor.getIdade()<16){
                System.out.println(nomeMenor.getNome());
            }
        }
        sc.close();
    }
}