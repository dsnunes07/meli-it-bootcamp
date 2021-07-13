package meli.bootcamp.spring.diploma.service;

import meli.bootcamp.spring.diploma.dto.AlunoDTO;
import meli.bootcamp.spring.diploma.dto.DiplomaDTO;
import meli.bootcamp.spring.diploma.dto.DisciplinaDTO;
import meli.bootcamp.spring.diploma.model.Aluno;
import meli.bootcamp.spring.diploma.model.Diploma;
import meli.bootcamp.spring.diploma.model.Disciplina;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiplomaService {
    public DiplomaDTO create(AlunoDTO dto) {
        double mean = meanGrade(dto.getDisciplinas());
        String mensagem = "";
        if (mean >= 9)
            mensagem = "Parabéns, sua média foi " + mean;
        else
            mensagem += "Sua média foi " + mean;
        return new DiplomaDTO(mensagem, mean, dto);
    }

    private double meanGrade(List<DisciplinaDTO> disciplinas) {
        return disciplinas.stream().mapToDouble(DisciplinaDTO::getNota).average().getAsDouble();
    }
}
