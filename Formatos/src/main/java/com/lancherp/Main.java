package com.lancherp;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter th number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();


        for (int i =1; i <= n; i++ ){
            System.out.println("Shape #"+i+" data:");

            System.out.print("Rectangle or Circle (r/c):");
            char rc = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();

            if (rc == 'r'){
                System.out.print("Whidth: ");
                double wi = sc.nextDouble();
                System.out.print("Heigth: ");
                double he = sc.nextDouble();

                Shape ret = new Rectangle(Color.valueOf(color),wi,he);
                list.add(ret);

            }else {
                System.out.print("Radius: ");
                double ra = sc.nextDouble();
                Shape cir = new Circle(Color.valueOf(color),ra);

                list.add(cir);

            }


        }

        System.out.println("SHAPE AREAS:");

        for (Shape shape : list){

            System.out.println(String.format("%.2f", shape.area()));

        }

        sc.close();

    }
}