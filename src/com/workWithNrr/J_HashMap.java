package com.workWithNrr;

import java.util.HashMap;

public class J_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(1, "Anavee");
        student.put(2, "Biru");
        student.put(3, "Charu");

        System.out.println(student);
        System.out.println(student.get(2));
        System.out.println(student.values());
        System.out.println(student.keySet());
    }
}
