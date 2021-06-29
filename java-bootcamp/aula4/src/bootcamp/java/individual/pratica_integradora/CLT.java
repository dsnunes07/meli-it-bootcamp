package bootcamp.java.individual.pratica_integradora;

public class CLT extends Funcionario {

    private double bonificacao;
    private int jornadaHoras;
    private double salarioBase;
    private int metasBatidas;
    private double lucrosShare;
    private int descansoRemunerado;

    public CLT(String nome, double bonificacao, int jornadaHoras, double salarioBase, int metasBatidas, double lucrosShare, int descansoRemunerado) {
        super(nome);
        this.bonificacao = bonificacao;
        this.jornadaHoras = jornadaHoras;
        this.salarioBase = salarioBase;
        this.metasBatidas = metasBatidas;
        this.lucrosShare = lucrosShare;
        this.descansoRemunerado = descansoRemunerado;
    }

    @Override
    public double pagaSalario() {
        double salario = salarioBase * (1 + this.bonificacao * this.metasBatidas + this.lucrosShare);
        salario += (this.descansoRemunerado/this.jornadaHoras) * this.salarioBase;
        return salario;
    }
}
