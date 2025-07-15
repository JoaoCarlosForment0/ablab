package br.com.poo.bancario;

import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String numero;
    private Banco banco;

    private int numeroContasAbertas;
    private int numeroMaxContas;
    private static int numeroProximaConta = 1455;

    private List<Conta> contas = new ArrayList<>();

    public Agencia(String num, Banco banco, int numeroMaxContas) {
        this.numero = num;
        this.banco = banco;
        this.numeroMaxContas = numeroMaxContas;
    }

    public String getNumero() {
        return numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Conta abrirConta(double saldo, Cliente cliente ){
        Conta contaAberta = new Conta(saldo, String.valueOf(numeroProximaConta), cliente );
        return null;
    }
    private void adicionaContaLista(Conta conta) {

    }

}
