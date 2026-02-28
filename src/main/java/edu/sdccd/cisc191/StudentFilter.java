package edu.sdccd.cisc191;

    @FunctionalInterface
    public interface StudentFilter {
        boolean filter(Student s);
    }
