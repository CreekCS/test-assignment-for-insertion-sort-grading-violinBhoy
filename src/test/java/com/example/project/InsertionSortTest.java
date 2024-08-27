package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] arr = generateRandomArray(10, 1, 100);
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        InsertionSort.sort(arr);

        assertArrayEquals(sortedArr, arr, "The array should be sorted in ascending order");
    }

    @Test
    public void testRandomArrayGeneration() {
        int size = 20;
        int minValue = 1;
        int maxValue = 50;

        int[] arr = generateRandomArray(size, minValue, maxValue);

        assertEquals(size, arr.length, "The generated array should have the specified size");

        for (int num : arr) {
            assertTrue(num >= minValue && num <= maxValue, 
                "Each element should be within the specified range");
        }
    }

    private int[] generateRandomArray(int size, int minValue, int maxValue) {
        Random rand = new Random();
        return rand.ints(size, minValue, maxValue + 1).toArray();
    }
}
