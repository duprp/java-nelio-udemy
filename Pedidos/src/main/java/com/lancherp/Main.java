package com.lancherp;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import EntitiesEnums.OrderStatus;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());

        System.out.println("Enter Order data:");
        System.out.print("Status: ");
        String status = sc.next();

        //Cria cliente
        Client client = new Client(name,email,birthDate);
        Date date = new Date();
        Order order = new Order(date,OrderStatus.valueOf(status),client);


        System.out.print("How many items to his order: ");
        int n = sc.nextInt();



        for (int i=1; i<=n; i++){
            System.out.println("Enter #" +i+" item data:");
            System.out.print("Product name: ");
            String nameprod = sc.next();
            System.out.print("Product Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameprod,price);
            OrderItem item = new OrderItem(quantity,price,product);
            order.addItem(item);


        }

        System.out.println("ORDER SUMMARY:");

        System.out.println(order.toString());


    }
}