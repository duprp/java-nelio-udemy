package com.lancherp;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] vec = text.split(" ");
        String vec1 = vec[0];
        String vec2 = vec[1];
        String vec3 = vec[2];

        System.out.println(vec1);
        System.out.println(vec2);
        System.out.println(vec3);



        sc.close();
    }
}