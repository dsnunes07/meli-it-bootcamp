package bootcamp.java.individual.exercicio1;

public class ContaCorrente {
    private double saldo;
    private String agencia;
    private String conta;

    public ContaCorrente(ContaCorrente cc) {
        this.saldo = cc.getSaldo();
        this.agencia = cc.getAgencia();
        this.conta = cc.getConta();
    }

    public ContaCorrente(double saldo, String agencia, String conta) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                ", agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                '}';
    }
}
