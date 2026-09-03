package com.course;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String studentId;
    private List<Subject> subjects;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
