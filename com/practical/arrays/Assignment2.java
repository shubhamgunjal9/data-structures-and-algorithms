package com.practical.arrays;

import java.util.function.Function;

public class Assignment2 {

    public static void main(String...args) {
        String s1 = "M224y Na244me1 I13s Sh34ub32ham";
        Function<String,String> function = s -> s.replaceAll("[^A-Za-z]","");
        System.out.println(function.apply(s1));
    }
}
