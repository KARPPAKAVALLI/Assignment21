package com.assignment21;

import java.util.Comparator;
import java.util.TreeSet;

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int lengthComparison = Integer.compare(s1.length(), s2.length());
        if (lengthComparison == 0) {
            return s1.compareTo(s2);
        }
        return lengthComparison;
    }
}
public class TreesetCustomComparator {
    //  Write a Java program that creates a `TreeSet` of strings with a custom comparator that orders strings by their length.
    //  Add the strings {"banana", "apple", "cherry", "date"} to the set. Print the elements to verify the custom ordering.
    public static void main(String[] args) {
        TreeSet<String> stringSet = new TreeSet<>(new LengthComparator());

        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("cherry");
        stringSet.add("date");

        System.out.println("TreeSet elements ordered by length: " + stringSet);
    }
}
