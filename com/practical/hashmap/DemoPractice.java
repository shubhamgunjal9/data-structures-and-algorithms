package com.practical.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoPractice {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();


        list.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list);
        for(int i : list) {
            if(i == 30) {
                list.add(100);
            }
        }
        System.out.println(list);
    }
}
