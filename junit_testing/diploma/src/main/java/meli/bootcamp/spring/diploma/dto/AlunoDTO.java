package meli.bootcamp.spring.diploma.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class AlunoDTO {
    @Size(min=3, max=50)
    @NotBlank
    @NotNull
    private String nome;
    @Valid
    private List<DisciplinaDTO> disciplinas;

    public AlunoDTO(String name, List<DisciplinaDTO> disciplinas) {
        this.nome = name;
        this.disciplinas = disciplinas;
    }

    public AlunoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public List<DisciplinaDTO> getDisciplinas() {
        return disciplinas;
    }
}
