package com.prajwal.array_example;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main() {

        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 344;
        arr[3] = 334;
        arr[4] = 4;

        //Scanner in = new Scanner(System.in);
        //input using for loops
//        for (int i =0; i<arr.length; i++)
//        {
//            arr[i] = in.nextInt();
//        }
        for (int i =0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        for(int num : arr){//for every element (num) in the array (arr) print the element
            System.out.print(num + " ");

        }
        System.out.println("\n");
        //Another way to print the array
        System.out.println(Arrays.toString(arr));


        //array of objects
        String[] str = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        for(String strelement : str){
            System.out.println(strelement);
        }
    }
}
