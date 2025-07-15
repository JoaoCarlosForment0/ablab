package br.com.poo.bancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numero;
    private int numeroAgenciasAbertas;
    private int numeroMaxAgencias;
    private static int numeroProximaAgencia = 1234;
    private List<Agencia> agencias = new ArrayList<>();

    public Banco(String nome, int numero, int numeroMaxAgencias) {
        this.nome = nome;
        this.numero = numero;
        this.numeroMaxAgencias = numeroMaxAgencias;
    }
    public Agencia abrirAgencia () {
        Agencia novaAgencia = new Agencia(String.valueOf(this.numeroProximaAgencia), this);
        this.adicionaAgenciaLista(novaAgencia);
        return novaAgencia;
    }
    private void adicionaAgenciaLista(Agencia agencia) {
        this.agencias.add(agencia);
        this.numeroProximaAgencia++;
    }
    public void imprimeAgencias () {
        System.out.println("Todas as agências do banco:\n\n");
        for(Agencia agencia : agencias) {
            System.out.println(agencia.toString());
        }
    }
}
