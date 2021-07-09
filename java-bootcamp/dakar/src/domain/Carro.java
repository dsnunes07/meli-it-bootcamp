package domain;

public class Carro extends Veiculo {

    public Carro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, 1000.00, 4, placa);
    }
}
