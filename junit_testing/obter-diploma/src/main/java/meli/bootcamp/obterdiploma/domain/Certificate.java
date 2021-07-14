package meli.bootcamp.obterdiploma.domain;

public class Certificate {
    private String message;
    private double average;
    private Student student;

    public Certificate(String message, double average, Student student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }

    public String getMessage() {
        return message;
    }

    public double getAverage() {
        return average;
    }

    public Student getStudent() {
        return student;
    }
}
