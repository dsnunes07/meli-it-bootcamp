package meli.bootcamp.spring.diploma.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DiplomaDTO {
    @JsonProperty("message")
    private String mensagem;
    @JsonProperty("average")
    private double average;
    @JsonProperty("student")
    private AlunoDTO aluno;

    public DiplomaDTO(String mensagem, double average, AlunoDTO aluno) {
        this.mensagem = mensagem;
        this.average = average;
        this.aluno = aluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public AlunoDTO getAluno() {
        return aluno;
    }

    public double getAverage() {
        return average;
    }
}
