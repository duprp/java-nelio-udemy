package entities;

public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;
    private double deposito;
    private double saque;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setDeposito(double deposito) {
        this.saldo += deposito;
    }



    public void setSaque(double saque) {

        this.saldo -= saque + 5 ;
    }


    @Override
    public String toString() {
        return "Account data:\n" +
                "Account " + numeroConta +
                ", Holder: " + titular +
                ", Balance: " + String.format("%.2f", saldo);
    }
}
