package Lamda_learnings;

import java.util.Arrays;
import java.util.List;

public class Test5 {

    public static void main(String[] args) {

        // Create a list of strings
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        // Print the original list
        System.out.println("Original strings:");
        for (String str : colors) {
            System.out.print(str + " ");
        }

        // Sort using lambda expression
        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        // Print sorted list
        System.out.println("\nSorted strings:");
        for (String str : colors) {
            System.out.print(str + " ");
        }
    }
}


//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.