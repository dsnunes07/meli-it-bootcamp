package meli.bootcamp.obterdiploma.utils;

import meli.bootcamp.obterdiploma.domain.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectCreator {
    public static List<Subject> createSubjects(double[] grades) {
        int n = grades.length;
        List<Subject> subjects = new ArrayList<>();
        for (int i = 0; i < n; i++)
            subjects.add(new Subject("subject-" + i, grades[i]));
        return subjects;
    }
}
