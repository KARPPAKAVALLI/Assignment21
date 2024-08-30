package com.assignment21;

import java.util.LinkedHashSet;

public class LinkedHashSetBasic {
    // Write a Java program that creates a `LinkedHashSet` of integers. Add the numbers 5, 10, 15, 20, and 25 to the set.
    // Attempt to add the number 15 again. Print all elements in the set and observe the order and duplicates.
    public static void main(String[] args) {
        LinkedHashSet<Integer> elements=new LinkedHashSet<>();
        elements.add(5);
        elements.add(10);
        elements.add(15);
        elements.add(20);
        elements.add(25);

        //Attempting to add the number 15 again
        elements.add(15);

        System.out.println(elements);
    }
}
