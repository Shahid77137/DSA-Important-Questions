package com.ProblemsOnBinarySearch;
// Search an eelement in Rotated Sorted Array
public class Problem3 {
    public static void main(String[] args){
        int arr[] = {3, 7, 15, 23, 45};
        int result = checkValue(arr);
        System.out.println("Index of that element is "+ result);
    }
    public static int checkValue(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;
        while(start <= end){
            if(arr[mid] == arr[0]){
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }

        return -1;
    }
}
