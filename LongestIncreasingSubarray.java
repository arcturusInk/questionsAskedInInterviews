package com.company;

/*Given an array containing n numbers. Find the longest contiguous
subarray such that every element in the subarray is strictly
greater than its previous element in the same subarray.*/

//O(n)
public class LongestIncreasingSubarray {

    public static void longestIncSubArr (int[] arr){
        int length = 1, greatestLen = 0, maxIndex = 0;
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] > arr[i-1]){
                ++length;
            }else{
                length = 1;
            }

            if(length > greatestLen){
                greatestLen = length;
                maxIndex = i;
            }
        }
        for(int i = (maxIndex - greatestLen + 1); i <= maxIndex; ++i){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 5, 7, 8, 9, 1, 2};
        //int[] arr = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11};

        longestIncSubArr(arr);
    }
}
