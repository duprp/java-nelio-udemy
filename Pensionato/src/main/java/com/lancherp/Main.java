package com.lancherp;

import entities.Reserva;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);


        System.out.print("How many rooms be rented:");

        int n = sc.nextInt();

        Reserva[] vec = new Reserva[n];

        for (int i = 0; i < vec.length; i++){


            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();


            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room:");
            int room = sc.nextInt();

            vec[i] = new Reserva(name,email,room);


        }

        Arrays.sort(vec, Comparator.comparing(Reserva::getRoom));

        System.out.println("Busy rooms:");

        for (Reserva i : vec){

            System.out.println(i.getRoom()+": "+i.getName()+", "+ i.getEmail());



        }

        sc.close();

    }



}