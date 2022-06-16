package com.codedifferently;

import static com.codedifferently.SortExample.displayValues;

public class SearchExample {

    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);
        sequentialSearch(numbers, 13);
        sequentialSearch(numbers, 7);
    }

    public static boolean sequentialSearch(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.printf("The number %d is at position %d in the list\n", value, i);
                return true;
            }
        }
        System.out.printf("The number %d is not in the list\n", value);
        return false;
    }

    public static int binarySearch(int[] numbers, int value) {
        int low = 0;
        int high = numbers.length - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (numbers[middle] == value) {
                System.out.printf("The number %d is at position %d in the list\n", value, middle);
                return middle;
            } else if (numbers[middle] < value) {
                low = middle + 1;
            } else if (numbers[middle] > value) {
                high = middle - 1;
            }
        }
        System.out.printf("The number %d is not in the list\n", value);
        return -1;
    }
}
