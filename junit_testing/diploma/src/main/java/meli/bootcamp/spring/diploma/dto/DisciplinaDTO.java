package meli.bootcamp.spring.diploma.dto;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DisciplinaDTO {
    @Size(min=3, max=50)
    private String titulo;
    @Range(min=0, max=10)
    private double nota;

    public DisciplinaDTO(String titulo, double nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public DisciplinaDTO() {
    }

    public String getTitulo() {
        return titulo;
    }

    public double getNota() {
        return nota;
    }
}
