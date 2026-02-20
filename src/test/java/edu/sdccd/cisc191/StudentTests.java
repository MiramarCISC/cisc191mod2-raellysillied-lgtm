package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTests {

    @Test
    void constructorValidation() {
        assertThrows(IllegalArgumentException.class,
                () -> new Student("", 3.0, 1));
    }

    @Test
    void filterWorks() {
        List<Student> list = List.of(
                new Student("A",3.0,1),
                new Student("B",4.0,2)
        );

        List<Student> result =
                StudentAnalyzer.filter(list, s -> s.getGpa() > 3.5);

        assertEquals(1,result.size());
    }

    @Test
    void averageWorks() {
        List<Student> list = List.of(
                new Student("A",2.0,1),
                new Student("B",4.0,2)
        );

        assertEquals(3.0,
                StudentAnalyzer.averageGpa(list),
                0.0001);
    }
}