package com.lancherp;

import entities.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String file = "D:\\Produtos\\products.csv";
        List<Products> list = new ArrayList<>();


        File csv = new File(file);
        String csvSummary = csv.getParent();

        boolean success = new File(csvSummary+"\\out").mkdir();

        String andressFile = csvSummary + "\\out\\summary.csv";

        try (BufferedReader bf = new BufferedReader(new FileReader(csv))) {

            String line = bf.readLine();



            while (line!= null){


                String[] campos = line.split(",");
                String name = campos[0].trim().replace("\"", "");

                double price = Double.parseDouble(campos[1].trim().replace("\"", ""));

                int quant = Integer.parseInt(campos[2].trim().replace("\"", ""));


               list.add(new Products(name,price,quant));

                System.out.println(line);
                line = bf.readLine();
                System.out.println(name);
                System.out.println(price);
                System.out.println(quant);

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(andressFile))) {


                for (Products p : list){
                    bw.write(p.getName() + ", " + p.soma());
                    bw.newLine();

                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }




        } catch (IOException e) {
            System.out.println("ERROR: "+ e.getMessage());
        }

        System.out.println(csvSummary);



    }


}