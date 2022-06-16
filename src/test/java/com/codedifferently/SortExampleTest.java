package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.codedifferently.SortExample.bubbleSort;
import static com.codedifferently.SortExample.selectionSort;

public class SortExampleTest {

    @Test
    @DisplayName("selection sort test")
    public void selectionSortTest01() {
        int[] numbers = {40, 7, 59, 4, 1};
        int[] expected = {1, 4, 7, 40, 59};
        int[] actual = selectionSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("bubble sort test")
    public void bubbleSortTest01() {
        int[] numbers = {40, 7, 59, 4, 1};
        int[] expected = {1, 4, 7, 40, 59};
        int[] actual = bubbleSort(numbers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
