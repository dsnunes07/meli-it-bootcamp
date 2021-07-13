package meli.bootcamp.spring.diploma.model;

public class Diploma {
    private String mensagem;
    private double media;
    private Aluno aluno;

    public Diploma(Aluno aluno) {
        this.aluno = aluno;
        this.media = aluno.media();
        if (this.media > 9.0)
            this.mensagem = "Parabéns";
        else
            this.mensagem = "";
    }

    public String getMensagem() {
        return mensagem;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double getMedia() {
        return media;
    }
}
