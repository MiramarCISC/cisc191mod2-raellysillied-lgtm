package edu.sdccd.cisc191;

    @FunctionalInterface
    public interface StudentFilter {
        /// changed to "test" according to requirements
        boolean test(Student s);
    }
