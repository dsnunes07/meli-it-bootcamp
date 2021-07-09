import java.util.List;

public class Turma {
    private int serie;
    private String codigoIdentificador;
    private List<Disciplina> disciplinas;
    private List<Estudante> estudantes;

    public Turma(int serie, String codigoIdentificador, List<Disciplina> disciplinas, List<Estudante> estudantes) {
        this.serie = serie;
        this.codigoIdentificador = codigoIdentificador;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public Turma() {
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}