package com.workWithNrr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class J_Comparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Cat"));
        students.add(new Student(32, "Dog"));
        students.add(new Student(15, "Apple"));
        students.add(new Student(12, "Ball"));

        Collections.sort(students, new SortByNameThenMarks());

        students.forEach(System.out ::println);
    }
}
class SortByNameThenMarks implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if (s1.name.equals(s2.name))
            return s1.marks - s2.marks;
        else
            return s1.name.compareTo(s2.name);
    }
}

