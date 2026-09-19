package com.prajwal.array_example;

import java.util.Arrays;

import static com.prajwal.array_example.Swap.swap;

public class Max {
    static void main() {
        int [] arr = {7,4,5,6,1};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,4,1));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int max(int[] arr){
        if(arr.length ==0){
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int maxRange(int[] arr,int start, int end){
        if(start>end){
            return -1;
        }
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    static  void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,start++,end--);
        }
    }
}
