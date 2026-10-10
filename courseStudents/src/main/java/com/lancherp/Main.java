package com.lancherp;

import entities.course;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("How many for course A: ");
        int qnt = sc.nextInt();
        Set<course> set =new HashSet<>();
        for (int i =0; i< qnt;i++){

            int codStudent = sc.nextInt();
            set.add(new course(1,codStudent));

        }

        System.out.print("How many for course B: ");
        qnt = sc.nextInt();
        for (int i =0; i< qnt;i++){

            int codStudent = sc.nextInt();
            set.add(new course(2,codStudent));

        }
        System.out.print("How many for course C: ");
        qnt = sc.nextInt();
        for (int i =0; i< qnt;i++){

            int codStudent = sc.nextInt();
            set.add(new course(3,codStudent));

        }


        System.out.println("Total students: "+set.size());



    }
}