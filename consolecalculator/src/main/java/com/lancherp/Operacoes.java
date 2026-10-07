package com.lancherp;

import java.util.Scanner;

public class Operacoes {

    float soma,sub,mut,div;
    Scanner sc = new Scanner(System.in);

    public float getSoma(float num1,float num2) {
        soma = num1 + num2;
        return soma;
    }


    public float getSub(float num1,float num2) {
        sub = num1 - num2;
        return sub;
    }

    public float getMut(float num1, float num2) {
        mut = num1 * num2;
        return mut;
    }

    public float getDiv(float num1, float num2) {
        div = num1 / num2;
        return div;
    }


}
