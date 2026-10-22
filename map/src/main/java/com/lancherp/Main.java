package com.lancherp;

import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","Maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","99711122");

        System.out.println("ALL COOKIES");
        for (String key: cookies.keySet()){
            System.out.println(key + ": "+ cookies.get(key));

        }

        cookies.remove("email");

    }
}