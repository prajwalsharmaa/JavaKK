package com.prajwal.array_example;

import java.util.Arrays;

public class Swap {
    static void main() {
        int [] arr = {2,4,5,26,3};

        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));
    }
    public static  void swap(int[]arr,int x,int y){
        int temp = 0;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
