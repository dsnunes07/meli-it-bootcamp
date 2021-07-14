package meli.bootcamp.obterdiploma.service;

import meli.bootcamp.obterdiploma.domain.Certificate;
import meli.bootcamp.obterdiploma.domain.Student;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {

    public Certificate createCertificate(Student student) {
        String message = this.createCertificateMessage(student.gradesMean());
        Certificate certificate = new Certificate(message, student.gradesMean(), student);
        return certificate;
    }

    private String createCertificateMessage(double mean) {
        String message = "";
        if (mean >= 9.0) message = "Parabéns!";
        return message;
    }
}
