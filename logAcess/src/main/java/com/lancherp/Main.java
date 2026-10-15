package com.lancherp;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> nomes =new HashSet<>();


        //C:\Users\Eduardo Pereira\OneDrive\Desktop\JavaSpring\JavaNelioUdemy\acessos.txt

        System.out.println("Enter filer full path: ");

        Path file = Path.of("C:\\Users\\Eduardo Pereira\\OneDrive\\Desktop\\JavaSpring\\JavaNelioUdemy\\acessos.txt");

        try (BufferedReader br = Files.newBufferedReader(file)){

            String line;
            while ((line = br.readLine()) != null){

                String[] partes = line.split(" ");
                String nome = partes[0].trim();

                nomes.add(nome);

            }

        }catch (IOException e ){
            System.out.println("ERROR: ");
            e.printStackTrace();
       }

        System.out.println("Total users: "+nomes.size());

    }
}