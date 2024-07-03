package com.practical.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo1 {

    public static int[] delete(int[] arr, int index) {
        int[] temp = new int[arr.length-1];
        int count = 0;
        for(int i : arr) {
            if(i == arr[index])  {
                continue;
            } else {
                temp[count] = i;
                count++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        arr = delete(arr,2);
        System.out.println(Arrays.toString(arr));
        int [][] arr2d = {
                {1000,10,20},
                {90,60,20},
                {42,98,2000}
        };
        print2d(arr2d);
        System.out.println("after sorting");

        Arrays.sort(arr2d, (a,b) -> Integer.compare(Arrays.stream(a).iterator().next(),Arrays.stream(b).iterator().next()));
        print2d(arr2d);


    }
    static void print2d(int[][] arr) {
        for(int[] ar : arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
