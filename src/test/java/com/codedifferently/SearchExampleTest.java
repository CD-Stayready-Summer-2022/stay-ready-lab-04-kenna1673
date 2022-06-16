package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

import static com.codedifferently.SearchExample.*;

public class SearchExampleTest {

    @Test
    @DisplayName("sequential search test true")
    public void sequentialSearchTest01() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean actual = sequentialSearch(numbers, 2);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("sequential search test false")
    public void sequentialSearchTest02() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean actual = sequentialSearch(numbers, 8);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("binary search test true")
    public void binarySearchTest01() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expected = 1;
        int actual = binarySearch(numbers, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("binary search test false")
    public void binarySearchTest02() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expected = -1;
        int actual = binarySearch(numbers, 8);
        Assertions.assertEquals(expected, actual);
    }


}
