package meli.bootcamp.aula5.exe1;

public class Pessoa implements Precedente<Pessoa> {
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + " (" + this.cpf + ")";
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.cpf.compareTo(pessoa.getCpf());
    }
}
