package com.assignment21;

import java.util.LinkedHashSet;

public class LinkedHashSetRemove {
    // Write a Java program that creates a `LinkedHashSet` of characters with the values {'A', 'B', 'C', 'D', 'E'}.
    // Remove the character 'C' from the set. Check if 'C' is still in the set and print the resulting set.
    public static void main(String[] args) {
        LinkedHashSet<Character> chars=new LinkedHashSet<>();
        for(char ch='A';ch<='E';ch++)
            chars.add(ch);

        //Removing 'C'
        chars.remove('C');

        System.out.println("If 'C' is still present? "+chars.contains('C'));
        System.out.println("LinkedHashSet: "+chars);
    }
}
