package meli.bootcamp.obterdiploma.domain;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Subject {
    @Size(min = 3, max = 50)
    @NotBlank
    @NotNull
    private String subject;
    @Range(min = 0, max = 10)
    private double note;

    public Subject(String subject, double note) {
        this.subject = subject;
        this.note = note;
    }

    public String getSubject() {
        return subject;
    }

    public double getNote() {
        return note;
    }
}
