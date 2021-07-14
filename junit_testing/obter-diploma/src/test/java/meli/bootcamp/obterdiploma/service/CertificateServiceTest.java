package meli.bootcamp.obterdiploma.service;

import meli.bootcamp.obterdiploma.domain.Certificate;
import meli.bootcamp.obterdiploma.domain.Student;
import meli.bootcamp.obterdiploma.domain.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CertificateServiceTest {

    CertificateService service;

    @BeforeEach
    void initializeService() {
        service = new CertificateService();
    }

    @Test
    void studentWithMeanAboveNine_shouldReceiveHonors() {
        List<Subject> subjects = createSubjects(new double[] {10.0, 10.0});
        Student s = new Student("name", subjects);
        Certificate c = service.createCertificate(s);
        assertEquals(c.getMessage(), "Parabéns!");
    }

    @Test
    void studentWithMeanEqualsNine_shouldReceiveHonors() {
        List<Subject> subjects = createSubjects(new double[] {9.0, 9.0});
        Student s = new Student("name", subjects);
        Certificate c = service.createCertificate(s);
        assertEquals(c.getMessage(), "Parabéns!");
    }

    @Test
    void studentWithMeanBelowNine_shouldNotReceiveHonors() {
        List<Subject> subjects = createSubjects(new double[] {8.0, 8.0});
        Student s = new Student("name", subjects);
        Certificate c = service.createCertificate(s);
        assertEquals(c.getMessage(), "");
    }

    private List<Subject> createSubjects(double[] grades) {
        int n = grades.length;
        List<Subject> subjects = new ArrayList<>();
        for (int i = 0; i < n; i++)
            subjects.add(new Subject("subject-" + i, grades[i]));
        return subjects;
    }
}
