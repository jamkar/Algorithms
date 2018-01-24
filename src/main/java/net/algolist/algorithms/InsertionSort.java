package net.algolist.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// Time complexity: worst case: O(n^2); best case: O(n)
// Space complexity: O(1)
// Adaptive (performance adapts to the initial order of elements)
// Stable (retains relative order of the same elements)
// Used on small data sets (from 8 to 12 elements)
public class InsertionSort {

    public static void sortShift(int[] arr) {
        int i, j, newValue;
        int n = arr.length;

        for (i = 1; i < n; i++) {
            newValue = arr[i];
            j = i;

            while (j > 0 && arr[j-1] > newValue) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = newValue;
        }
    }

    public static void sortSwap(int[] arr) {
        int i;
        int j;
        int temp;

        for (i = 1; i < arr.length; i++) {
            j = i - 1;
            while (j >= 0 && arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
    }

    @Test
    public void testShift() {
        int[] expectedArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] actualArray = new int[] {6, 5, 4, 3, 2, 1};

        sortShift(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSwap() {
        int[] expectedArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] actualArray = new int[] {6, 5, 4, 3, 2, 1};

        sortSwap(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }
}
