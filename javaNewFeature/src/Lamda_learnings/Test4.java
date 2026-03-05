package Lamda_learnings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        // Print the original numbers
        System.out.println("Original numbers:");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        // Filter even numbers
        List<Integer> evenNumbers = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Print even numbers
        System.out.print("\nEven numbers: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        // Filter odd numbers
        List<Integer> oddNumbers = nums.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        // Print odd numbers
        System.out.print("\nOdd numbers: ");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }
}

//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.