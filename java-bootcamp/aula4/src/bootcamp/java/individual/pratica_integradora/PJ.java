package bootcamp.java.individual.pratica_integradora;

public class PJ extends Funcionario {
    private int horasTrabalhadas;
    private double remuneracaoHora;

    public PJ(int horasTrabalhadas, double remuneracaoHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.remuneracaoHora = remuneracaoHora;
    }

    @Override
    public double pagaSalario() {
        return this.horasTrabalhadas * this.remuneracaoHora;
    }
}
