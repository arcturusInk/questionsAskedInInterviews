package com.company;

/*Find the length of largest subarray having sum of its elements at most k*/

public class LongestSubarray {

    public static int longestSubArr(int[] arr, int k){
        int sum = 0, count = 0, maxCnt = 0;
        for(int i = 0; i < arr.length; ++i){
            if((sum + arr[i]) <= k){
                sum += arr[i];
                ++count;
            }else if (sum != 0){
                sum = sum - arr[i-count] + arr[i];
            }

            maxCnt = Math.max(maxCnt, count);
        }
        return maxCnt;
    }
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3}; int k = 4;
        int[] arr = {3, 1, 2 , 1}; int k = 4;

        System.out.print(longestSubArr(arr, k));
    }
}
