package MixedProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class J_Comparator2 {

    public static void main(String[] args) {
        Comparator<Student> compareByName = new Comparator<Student>()
        {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };

        Comparator<Student> compareByMarks = new Comparator<Student>()
        {
            public int compare(Student s1, Student s2) {
                return s1.getMarks() - s2.getMarks() ;
            }
        };

        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Cat"));
        students.add(new Student(32, "Dog"));
        students.add(new Student(15, "Apple"));
        students.add(new Student(12, "Ball"));

//        Compare by students by marks
        Collections.sort(students, compareByMarks );
        students.forEach(System.out ::println);

//        Compare by students marks
        Collections.sort(students, compareByMarks );
        students.forEach(System.out ::println);
    }
}
