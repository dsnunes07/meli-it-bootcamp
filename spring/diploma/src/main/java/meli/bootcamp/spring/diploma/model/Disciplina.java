package meli.bootcamp.spring.diploma.model;

public class Disciplina {
    private String titulo;
    private double nota;

    public Disciplina(String titulo, double nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "titulo='" + titulo + '\'' +
                ", nota=" + nota +
                '}';
    }
}
