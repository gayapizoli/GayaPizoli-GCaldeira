public abstract class Conta {
    protected double saldo;

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double obterSaldo() {
        return this.saldo;
    }
}
