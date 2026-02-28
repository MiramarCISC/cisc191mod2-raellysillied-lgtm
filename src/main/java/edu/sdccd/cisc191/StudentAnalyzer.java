package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentAnalyzer {
    static List<Student> filter(List<Student> students, StudentFilter sf) {
        List<Student> result = new ArrayList<Student>();
        for (Student s : students) {
            if (sf.filter(s)) {
                result.add(s);
            }
        }
        return result;
    }
    static void sort(List<Student> students, Comparator<Student> c) {
        students.sort(c);
    }
    static double averageGpa(List<Student> students) {
        if (students.isEmpty()) {return 0;}
        double sum = 0;
        for (Student student : students) {
            sum += student.getGpa();
        }
        return sum / students.size();
    }
}
