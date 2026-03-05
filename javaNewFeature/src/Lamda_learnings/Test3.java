package Lamda_learnings;

import java.util.function.Predicate;

public class Test3 {

    public static void main(String[] args) {

        // Lambda expression to check if a given string is empty
        Predicate<String> isEmptyString = str -> str.isEmpty();

        // Test cases
        String str1 = "";
        String str2 = "Java lambda expression!";

        // Check if the strings are empty
        System.out.println("String 1: " + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));

        System.out.println("\nString 2: " + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));
    }
}

//Write a Java program to implement a lambda expression to check if a given string is empty.