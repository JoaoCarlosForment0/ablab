package br.com.poo.heranca;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private String numeroCLT;
    private LocalDate dataAdmissao;

    public String getNumeroCLT() {
        return numeroCLT;
    }

    public void setNumeroCLT(String numeroCLT) {
        this.numeroCLT = numeroCLT;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
