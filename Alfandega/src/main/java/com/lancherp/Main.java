package com.lancherp;

import Entitites.ImportedProduct;
import Entitites.Product;
import Entitites.UsedProduct;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i): ");
            char cui = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (cui == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();

                Product prod = new ImportedProduct(name,price,fee);
                list.add(prod);
            } else if (cui == 'u') {
                System.out.print("Manufactured date (DD/MM/YYYY): ");
                String dateString = sc.next();

                Date date = sdf.parse(dateString);

                Product prod = new UsedProduct(name,price,date);
                list.add(prod);

            }else {

                Product prod = new Product(name,price);
                list.add(prod);

            }

        }

        System.out.println("PRICE TAGS:");
        for (Product prod: list){
            System.out.println(prod.priceTag());
        }


    }
}