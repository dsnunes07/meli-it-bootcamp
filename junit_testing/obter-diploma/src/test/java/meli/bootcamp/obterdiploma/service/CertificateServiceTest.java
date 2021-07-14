package meli.bootcamp.obterdiploma.service;

import meli.bootcamp.obterdiploma.domain.Certificate;
import meli.bootcamp.obterdiploma.domain.Student;
import meli.bootcamp.obterdiploma.domain.Subject;
import meli.bootcamp.obterdiploma.utils.SubjectCreator;
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
        List<Subject> subjects = SubjectCreator.createSubjects(new double[] {10.0, 10.0});
        Student s = new Student("name", subjects);
        Certificate c = service.createCertificate(s);
        assertEquals(c.getMessage(), "Parabéns!");
    }

    @Test
    void studentWithMeanEqualsNine_shouldReceiveHonors() {
        List<Subject> subjects = SubjectCreator.createSubjects(new double[] {9.0, 9.0});
        Student s = new Student("name", subjects);
        Certificate c = service.createCertificate(s);
        assertEquals(c.getMessage(), "Parabéns!");
    }

    @Test
    void studentWithMeanBelowNine_shouldNotReceiveHonors() {
        List<Subject> subjects = SubjectCreator.createSubjects(new double[] {8.0, 8.0});
        Student s = new Student("name", subjects);
        Certificate c = service.createCertificate(s);
        assertEquals("", c.getMessage());
    }
}
