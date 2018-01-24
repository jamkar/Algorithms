package net.algolist.algorithms;

import org.junit.Assert;
import org.junit.Test;

// Time complexity: best and average case: O(n * log n); worst case: O(n^2)
// Space complexity: O(1) ???
// Unstable
public class QuickSort {

    /**
     *
     * @param arr array to sort
     * @param low starting index
     * @param high ending index
     */
    public static void sort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int temp;
        int pivot = arr[(high + low) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (pivot < arr[j]) {
                j--;
            }
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            print(arr);
        }

        // Recursive sort
        if (low < j) {
            sort(arr, low, j);
        }
        if (i < high) {
            sort(arr, i, high);
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;

        sort(arr, 0, n - 1);

    }

    @Test
    public void testSortReverseOrderedArray() {
        int[] expectedArray = { 1, 2, 3, 4, 5, 6 };
        int[] actualArray = { 6, 5, 4, 3, 2, 1 };

        sort(actualArray, 0, actualArray.length - 1);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

}
