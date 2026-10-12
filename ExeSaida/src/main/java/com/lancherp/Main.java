package com.lancherp;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = 0;
        int X = 0;
        X = sc.nextInt();
        for (C = 1; C <= X; C++) {

            if (C % 2 == 1) {
                System.out.println(C);
            }

        }

    }
}