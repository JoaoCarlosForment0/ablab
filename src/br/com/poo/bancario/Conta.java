package br.com.poo.bancario;

public class Conta {
    private double saldo;
    private String numero;
    private Cliente titular;

    public Conta(double saldo, String numero, Cliente titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
