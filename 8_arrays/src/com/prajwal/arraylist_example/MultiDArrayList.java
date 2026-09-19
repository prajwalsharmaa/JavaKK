package com.prajwal.arraylist_example;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    static void main() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());

        }
        //Add elements to it
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                list.get(i).add(in.nextInt());
            }

        }
        System.out.println(list);//we can print multi dimensional arraylist simply
        for(ArrayList l : list){
            System.out.println(l);
        }
    }
}
