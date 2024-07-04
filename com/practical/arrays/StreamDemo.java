package com.practical.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> newList = list.stream().filter((a)->a%2==0).collect(Collectors.toList());
        System.out.println(newList + "   " +list);
    }
}
