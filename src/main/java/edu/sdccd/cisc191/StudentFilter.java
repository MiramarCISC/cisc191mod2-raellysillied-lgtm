package edu.sdccd.cisc191;

public class StudentFilter {
    @FunctionalInterface
    public interface StudentFilter {
        boolean filter(Student s);
    }
}
