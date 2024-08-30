package com.assignment21;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethods {
    //Write a Java program that creates a `TreeSet` of doubles with the values {1.1, 2.2, 3.3, 4.4, 5.5}.
    // Use the `first()`, `last()`, `higher()`, and `lower()` methods to retrieve and print the
    // first element, last element, the smallest element strictly greater than 3.3, and the largest element strictly less than 3.3.
    public static void main(String[] args) {
        TreeSet<Double> doubles=new TreeSet<>(Set.of(1.1, 2.2, 3.3, 4.4, 5.5));
        System.out.println("Using first(): "+doubles.first());
        System.out.println("Using last(): "+doubles.last());
        System.out.println("Using higher(): "+doubles.higher(3.3));
        System.out.println("Using lower(): "+doubles.lower(3.3));
    }
}
