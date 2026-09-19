package com.prajwal.array_example;
public class Main{
    public static void main(String[] args){
        //Q.. Store a roll number
        int a = 6;
        System.out.println(a);

        //Q: Store 5 roll numbers
//        int roll1 = 23;
//        int roll2 = 23;
//        int roll3= 23;
//        int roll4 = 23;
//        int roll5 = 23;


        //syntax
        //datatype[] variable name = new datatype [size];
        //Q: Store 5 roll numbers
        int[] roll1 = new int[5];
        //or directly
        int[] roll2 = {23,12,43,23,53};

        int[] ros ;//declaration of array. ros is getting defined in the stack
        ros = new int[3];//actually here object is being created in the heap memory

        String[] names = new String[3];
        System.out.println(names[2]);
    }
}