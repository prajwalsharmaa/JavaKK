package com.prajwal.array_example;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensions {
    static void main() {
        /*
            1 2 3 4
            3 2 1 3
            2 3 1 5
         */
        Scanner in = new Scanner(System.in);
//        int [][] arr = new int[4][];
//        int [][] matrix = {
//                {2,3},
//                {3,53,2},
//                {3,2,5},
//                {3,3}
//        };

        int[][] arr = new int[3][3];

        System.out.println(arr.length);//no of rows
        //Input
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //Output
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        //Output with Array.toString method
        for(int row = 0; row<arr.length; row ++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }

        //Output using foreach loop
        for(int[] array : arr){
            System.out.println(Arrays.toString(array));
        }

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student[] students = {s1,s2,s3};
    }
}
