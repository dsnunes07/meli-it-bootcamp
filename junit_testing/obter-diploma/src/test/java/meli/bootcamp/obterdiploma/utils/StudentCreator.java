package meli.bootcamp.obterdiploma.utils;

import meli.bootcamp.obterdiploma.domain.Student;
import meli.bootcamp.obterdiploma.domain.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentCreator {
    public static Student createValidStudent() {
        List<Subject> subjects = Arrays.asList(new Subject("subject", 10.0));
        return new Student("valid name", subjects);
    }

    public static Student createInvalidStudent() {
        return new Student("", new ArrayList<>());
    }

    public static Student createShortNamedStudent() {
        return new Student("", SubjectCreator.createSubjects(new double[] {10.0}));
    }

    public static Student createUnnamedStudent() {
        return new Student(null, SubjectCreator.createSubjects(new double[] {10,0}));
    }
}
