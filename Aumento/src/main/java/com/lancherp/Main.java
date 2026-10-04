package com.lancherp;

import entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);



        List<Empregado>list= new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();





        for (int i = 0 ; i < n;i++){

            System.out.println("Employee #"+(i+1)+":");
            System.out.print("id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Empregado emp = new Empregado(id,name,salary);

            list.add(emp);

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Integer pos = position(list,id);
        if (pos == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);

        }


        System.out.println("List of employees");

        for (Empregado emp: list){
            System.out.println(emp);
        }









        sc.close();
    }

    public static Integer position (List<Empregado> list, int id){
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}