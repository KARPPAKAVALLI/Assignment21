package com.assignment21;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasic {
    //Write a Java program that creates a `TreeSet` of integers.
    // Add the numbers 50, 30, 20, 10, and 40 to the set. Print all elements in the set and observe the order.
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(50);
        ts.add(30);
        ts.add(20);
        ts.add(10);
        ts.add(40);

        System.out.println(ts);
        System.out.println("Using iterator: ");
        Iterator<Integer> iterator=ts.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
    }
}
