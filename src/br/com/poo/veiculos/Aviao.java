package br.com.poo.veiculos;

public class Aviao  extends Veiculo {
    public Aviao(String cor, Pessoa pessoa, int qtdLugares) {
        super.setCor(cor);
        super.setPessoa(pessoa);
        super.setQtdLugares(qtdLugares);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando as turbinas");

    }
    @Override
    public void desligar() {
        System.out.println("Desligando o motor");

    }
    @Override
    public void locomover() {
        System.out.println("Se movimentando");
    }
}
