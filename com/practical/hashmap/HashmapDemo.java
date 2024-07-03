package com.practical.hashmap;
class HashTable {
    int size;
    int a[];

    HashTable(int size) {
        this.size = size;
        a = new int[this.size];
        for(int i = 0;i < size;i++) {
            a[i] = -1;
        }
    }
    void print() {
        System.out.println("content of hashtable");
        for(int i : a) {
            System.out.print(i+"\t");
        }
    }
    int compute(int num ) {
        return num % size;
    }
    void add(int... nums) {
        int hcode = 0;
        for(int i = 0;i<nums.length;i++) {
            hcode = compute(nums[i]);
            if(a[hcode] == -1) {
                a[hcode] = nums[i];

            }
        }
    }
    boolean delete(int value) {
        int hcode = compute(value);
        if(a[hcode] != -1 && a[hcode] == value) {
            a[hcode] = -1;
            return true;
        }
        return false;
    }
}
public class HashmapDemo {
    public static void main(String[] args) {
        HashTable hs = new HashTable(10);
        hs.print();
        hs.add(10,21,33);
        hs.print();
        hs.delete(21);
        hs.print();
    }
}



/*
*   AVOIDING HASH COLLITIONS :
*
*       Hash collitions are practically unavoidable when hashing large number of values
*       the following are the techniques that are used to find the alternative locations
*       int the hashtable for the given objects
*
*       1. linear probing :=
*
*       2. quadratic probing
*       3. seperate chaning
*
*
* */