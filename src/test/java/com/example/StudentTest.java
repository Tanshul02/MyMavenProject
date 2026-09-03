package com.course;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testStudentDetails() {

        Student student = new Student("Tanshul", "23BCE1234");

        assertEquals("Tanshul", student.getName());
        assertEquals("23BCE1234", student.getStudentId());
    }

    @Test
    public void testAddSubject() {

        Student student = new Student("Tanshul", "23BCE1234");

        Subject subject = new Subject("Java", 4);

        student.addSubject(subject);

        assertEquals(1, student.getSubjects().size());
        assertEquals("Java",
                student.getSubjects().get(0).getSubjectName());
    }
}
