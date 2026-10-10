package com.lancherp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate niver = LocalDate.parse("2003-04-27");

        System.out.println("Local date " + niver);
        System.out.println("Date formater " + niver.format(fmt));


        //Comparar datas

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.parse("2026-05-25");


        System.out.println(date1);
        System.out.println(date2);

        if (date1.isBefore(date2)) {
            System.out.println("Data 1 " + date1 + " é anterior a data 2 " + date2);

    } else if (date1.isEqual(date2)) {
            System.out.println("Data 1 " + date1 + " é igual a data 2 " + date2);

        } else {
            System.out.println("Data 2 " + date2 + " é anterior a data 1 " + date1);
        }

        // calcular diferença entre datas




        System.out.println("Qual a primeira data: ");

        String a = sc.next();

        System.out.println("Qual a segunda data: ");

        String b = sc.next();

        LocalDate niver1 = LocalDate.parse(a,fmt);
       LocalDate niver2 = LocalDate.parse(b,fmt);

       System.out.println("A diferença entre "+niver1+ " e "+niver2);
       System.out.println(Period.between(niver1,niver2).getYears()+" anos");
        System.out.println(Period.between(niver1,niver2).getMonths()+" meses");
        System.out.println(Period.between(niver1,niver2).getDays()+" dias");

        LocalDate oneWeek = date1.plusWeeks(1);
        LocalDate treeMounth = date1.plusMonths(3);
        LocalDate tenYears = date1.plusYears(10);


        System.out.println("Add uma semana "+oneWeek.format(fmt));
        System.out.println("Add 3 meses "+treeMounth.format(fmt));
        System.out.println("Add 10 anos " +tenYears.format(fmt));

        LocalDate minusFiveDays = date1.minusDays(5);
        LocalDate minusTwoMounth = date1.minusMonths(2);

        System.out.println("Menos 5 dias"+ minusFiveDays.format(fmt));
        System.out.println("Menos 2 meses "+ minusTwoMounth.format(fmt));





    }






}


