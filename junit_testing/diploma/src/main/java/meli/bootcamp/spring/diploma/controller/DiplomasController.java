package meli.bootcamp.spring.diploma.controller;

import meli.bootcamp.spring.diploma.dto.AlunoDTO;
import meli.bootcamp.spring.diploma.dto.DiplomaDTO;
import meli.bootcamp.spring.diploma.model.Diploma;
import meli.bootcamp.spring.diploma.service.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DiplomasController {

    @Autowired
    DiplomaService service;

    @RequestMapping(value = "/analyzeNotes", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<DiplomaDTO> create(@Valid @RequestBody AlunoDTO aluno) {
        return new ResponseEntity<>(service.create(aluno), HttpStatus.OK);
    }
}
