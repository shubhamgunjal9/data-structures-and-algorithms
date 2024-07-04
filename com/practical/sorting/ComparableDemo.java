package com.practical.sorting;

import java.util.*;
import java.util.stream.Stream;

record Student (Integer id, String name, Integer age) {}

public class ComparableDemo{
    public static void main(String[] args) {
        Student student1 = new Student(1,"Shubham",20);
        Student student2 = new Student(2,"Rahul",21);
        Student student3 = new Student(3,"Bhaiya",18);
        Student student4 = new Student(4,"Tejas",17);

        List<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(student1,student2,student3,student4));
        System.out.println(list);
        Collections.sort(list,(a,b) -> a.age().compareTo(b.age()));

        System.out.println(list);

    }


}
