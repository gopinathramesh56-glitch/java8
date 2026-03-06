package Lamda_learnings;

import java.util.Arrays;
import java.util.List;

public class Test7 {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);

        System.out.println("Original array elements: " + nums);

        // Multiply all numbers using reduce
        int result = nums.stream()
                .reduce(1, (x, y) -> x * y);

        System.out.println("\nProduct of the list elements: " + result);

        // Sum of numbers using reduce
        int sum = nums.stream()
                .reduce(0, (x, y) -> x + y);

        System.out.println("\nSum of the list elements: " + sum);
    }
}


//Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.