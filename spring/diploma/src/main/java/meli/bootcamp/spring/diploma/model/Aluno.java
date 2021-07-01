package meli.bootcamp.spring.diploma.model;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addDisciplina(Disciplina d) {
        this.disciplinas.add(d);
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    public double media() {
        OptionalDouble optional = this.disciplinas.stream().mapToDouble(Disciplina::getNota).average();
        if (optional.isPresent())
            return optional.getAsDouble();
        return 0.0;
    }
}
