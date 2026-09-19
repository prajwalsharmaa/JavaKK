package com.prajwal.arraylist_example;
import java.util.ArrayList;

public class ArrayListEg {
    static void main() {
        //ArrayList is a part of Collection Framework
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);//In array list the element cannot be of primitive type
        list.add(23);
        list.add(53);
        list.add(33);
        list.add(26);
        list.add(24);
        list.remove(3);
        list.set(0,99);
        System.out.println(list);
        //get item from the list
        System.out.println(list.get(2));


    }

}
