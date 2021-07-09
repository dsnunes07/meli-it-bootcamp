package domain;

//Modele a classe Corrida que possui os seguintes atributos:
//        distancia
//        premioEmDolares
//        nome
//        quantidadeVeiculosPermitidos
//        listaVeiculos

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Corrida {
    private double distancia;
    private double premioDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> veiculos;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioDolares() {
        return premioDolares;
    }

    public void setPremioDolares(double premioDolares) {
        this.premioDolares = premioDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(int quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo v) {
        if (this.veiculos.size() < this.quantidadeVeiculosPermitidos)
            this.veiculos.add(v);
        else
            System.out.println("Corrida já está na capacidade máxima de participantes");
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        Carro c = new Carro(velocidade, aceleracao, anguloDeGiro, placa);
        this.addVeiculo(c);

    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        Moto m = new Moto(velocidade, aceleracao, anguloDeGiro, placa);
        this.addVeiculo(m);
    }

    public void removerVeiculo(Veiculo v) {
        this.veiculos.remove(v);
    }

    public void removerVeiculo(String placa) {
        this.veiculos.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
    }

    public Veiculo definirVencedor() {
        Optional<Veiculo> o = this.veiculos.stream().max(Comparator.comparing(veiculo -> veiculo.getDesempenho()));

        return o.get();
    }
}
