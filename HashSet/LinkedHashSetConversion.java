package com.assignment21;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetConversion {
    //Write a Java program that creates a `LinkedHashSet` of strings with the values {"red", "green", "blue", "yellow"}.
    // Convert the set to an array and print the array.
    // Then, convert the array back to a `LinkedHashSet` and print the resulting set.
    public static void main(String[] args) {
        LinkedHashSet<String> colorSet = new LinkedHashSet<>();
        colorSet.add("red");
        colorSet.add("green");
        colorSet.add("blue");
        colorSet.add("yellow");
        String[] colorArray = colorSet.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(colorArray));

        LinkedHashSet<String> newColorSet = new LinkedHashSet<>(Arrays.asList(colorArray));

        System.out.println("LinkedHashSet: " + newColorSet);
    }
}
