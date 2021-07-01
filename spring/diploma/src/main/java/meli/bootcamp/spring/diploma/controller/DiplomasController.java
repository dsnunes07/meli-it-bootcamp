package meli.bootcamp.spring.diploma.controller;

import meli.bootcamp.spring.diploma.model.Aluno;
import meli.bootcamp.spring.diploma.model.Diploma;
import meli.bootcamp.spring.diploma.model.Disciplina;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diplomas")
public class DiplomasController {
    @RequestMapping(value = "/gerar", method = RequestMethod.POST)
    public ResponseEntity<Diploma> create(@RequestBody Aluno aluno) {
        System.out.println(aluno);
        for (Disciplina d : aluno.getDisciplinas()) {
            System.out.println(d);
        }
        return new ResponseEntity<Diploma>(new Diploma(aluno), HttpStatus.OK);
    }
}
