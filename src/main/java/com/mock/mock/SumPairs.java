package com.mock.mock;

public class SumPairs {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 4};
        int targetSum = 6;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + targetSum);
                }
            }
        }
    }
}