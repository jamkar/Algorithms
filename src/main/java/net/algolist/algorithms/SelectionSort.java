package net.algolist.algorithms;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

// Time complexity: O(n^2)
// Space complexity: O(1)
// Not Adaptive
public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        int minIdx, i, j, temp;
        for (i = 0; i < n - 1; i++) {
            minIdx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            if (minIdx != i) {
                temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
            for (int xx : arr)
                System.out.print(xx + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        sort(new  int[] {6, 5, 4, 3, 2, 1});
//        System.out.println();
//        sort(new int[] {1, 2, 3, 4, 6, 5});
//        System.out.println();
//        sort(new int[] {2, 3, 4, 5, 6, 1});
    }

    @Test
    public void testReversedOrderArray() {
        int[] expectedArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] actualArray = new int[] {6, 5, 4, 3, 2, 1};

        sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortedArray() {
        int[] expectedArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] actualArray = new int[] {1, 2, 3, 4, 5, 6};

        sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }
}
