package com.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 45, 15, 2, 11, 65 };
        int n = arr.length;
        sortBySelection(arr, n); 
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortBySelection(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
