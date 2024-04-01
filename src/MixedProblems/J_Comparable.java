package MixedProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J_Comparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Cat"));
        students.add(new Student(32, "Dog"));
        students.add(new Student(15, "Apple"));
        students.add(new Student(12, "Ball"));

        Collections.sort(students);

        students.forEach(System.out ::println);
    }

    public static class Student implements Comparable<Student>{
        int marks;
        String name;

        public Student(int marks, String name) {
            this.marks = marks;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "marks=" + marks +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getMarks() {
            return marks;
        }

        public String getName() {
            return name;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Student o) {
            if (this.marks == o.marks)
                return this.name.compareTo(o.name);
            else
                return -(this.marks - o.marks); // for desc order
        }
    }
}
