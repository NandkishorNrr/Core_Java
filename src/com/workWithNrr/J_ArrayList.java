package com.workWithNrr;

import java.util.ArrayList;
import java.util.Collections;

public class J_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(1,15); // add element at index and shift other elements
        list.set(3,35); // replace element at the index
        System.out.println(list);
        Collections.sort(list); //sort the object list
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
