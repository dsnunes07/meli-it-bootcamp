package meli.bootcamp.obterdiploma.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Student {
    @Size(min = 3, max = 50)
    @NotNull
    @NotBlank
    private String name;
    @Valid
    private List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public double gradesMean() {
        return this.subjects.stream().mapToDouble(Subject::getNote).average().getAsDouble();
    }
}
