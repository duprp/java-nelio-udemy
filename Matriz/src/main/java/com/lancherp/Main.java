package com.lancherp;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j]= sc.nextInt();

            }

        }

        int enc = sc.nextInt();


        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j ++){

                if (mat[i][j] == enc){
                    int lin = i;
                    int col = j;

                    System.out.println("Position: "+i+","+j);
                    if (j > 0 && mat[i][j-1] != 0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < mat.length-1 && mat[i][j+1]!=0){
                        System.out.println("Right: "+ mat[i][j+1]);
                    }
                    if (i > 0 && mat[i-1][j] !=0 ){
                        System.out.println("Up: "+ mat[i-1][j]);
                    }
                    if (i < mat.length-1 && mat[i+1][j] !=0 ){
                        System.out.println("Down: "+ mat[i+1][j]);
                    }


                }

            }

        }





    }
}