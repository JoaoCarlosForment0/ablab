package br.com.poo.veiculos;

public class Carro extends Veiculo {

    public Carro(String cor, Pessoa pessoa, int qtdLugares) {
        super.setCor(cor);
        super.setPessoa(pessoa);
        super.setQtdLugares(qtdLugares);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando as bombas de fissao nuclear(motor do marea)");

    }
    @Override
    public void desligar() {
        System.out.println("Desligando o bomba portatil");

    }
    @Override
    public void locomover() {
        System.out.println("Se movimentando (graças a deus)");
    }
}
