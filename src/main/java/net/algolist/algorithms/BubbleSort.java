package net.algolist.algorithms;

// time complexity: the average and the worse case: O(n^2); the best case: O(n);
// space complexity: O(1)
// adaptive
public class BubbleSort {

    public static void sortOptimized(int[] arr) {
       boolean swapped = true;
       int j = 0, n = arr.length;
       while (j < n - 1  && swapped) {
           j++;
           swapped = false;
           for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
           }
           for (int ii : arr) {
               System.out.print(ii + " ");
           }
           System.out.println();
       }
    }

    public static void sort(int[] arr) {

    }

    public static void main(String[] args) {
        sort(new  int[] {6, 5, 4, 3, 2, 1});
//        System.out.println();
//        sort(new int[] {1, 2, 3, 4, 6, 5});
//        System.out.println();
//        sort(new int[] {2, 3, 4, 5, 6, 1});
    }

}
