package pe.edu.unsch;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
