package domain;

public class Moto extends Veiculo{

    public Moto(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, 300.0, 2, placa);
    }
}
