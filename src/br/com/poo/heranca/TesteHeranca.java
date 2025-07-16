package br.com.poo.heranca;

import java.time.LocalDate;

public class TesteHeranca {
    public static void main (String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Jardelzika");
        f1.setCpf("696.969.420");
        f1.setDataAdmissao(LocalDate.now());
        f1.setNumeroCLT("numerosgrandesaqui");

    }
}
