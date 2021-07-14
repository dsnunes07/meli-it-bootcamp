package meli.bootcamp.obterdiploma.controller;

import meli.bootcamp.obterdiploma.domain.Certificate;
import meli.bootcamp.obterdiploma.domain.Student;
import meli.bootcamp.obterdiploma.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CertificateController {

    @Autowired
    CertificateService certificateService;

    @PostMapping("/analyzeNotes")
    public ResponseEntity<Certificate> create(@Valid @RequestBody Student student) {
        Certificate certificate = certificateService.createCertificate(student);
        return new ResponseEntity<>(certificate, HttpStatus.OK);
    }
}
