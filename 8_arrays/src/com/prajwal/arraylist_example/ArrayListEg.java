package com.prajwal.arraylist_example;

import java.util.ArrayList;

public class ArrayListEg {
    static void main() {
        //ArrayList is a part of Collection Framework
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(324);
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a==b);
        System.out.println(c==d);
    }
}
