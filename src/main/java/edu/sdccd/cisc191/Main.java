package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO create students
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("John", 3, 6));
        students.add(new Student("Madoka", 3.3, 7));
        students.add(new Student("Jane", 2.9, 30));
        students.add(new Student("Homura", 4, 22));

        // TODO demonstrate filtering
        List<Student> gpaAbove3 = StudentAnalyzer.filter(
                students, gpa -> gpa.getGpa() > 3.0
        );
        for (Student s : gpaAbove3) {
            System.out.println(s);
        }
        System.out.println("");

        // TODO demonstrate sorting
        StudentAnalyzer.sort(
                students, (s1, s2) -> Double.compare(s1.getId(), s2.getId())
        );
        for (Student s : students) {
            System.out.println(s);
        }

        // TODO print average GPA
        System.out.println("Average GPA: " + StudentAnalyzer.averageGpa(students));

    }
}