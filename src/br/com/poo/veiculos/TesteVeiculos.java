package br.com.poo.veiculos;

public class TesteVeiculos {
    public static void main(String[] args) {

        Pessoa jardelzinho = new Pessoa("Jardelzinho");
        jardelzinho.setEndereco(new Endereco("Major jardelindo", 525));
        Veiculo aviao = new Aviao("Rosa pink",jardelzinho, 80);
        aviao.ligar();
        Veiculo fiatMarea = new Carro("Verde abacate", jardelzinho, 3);
        fiatMarea.ligar();
        fiatMarea.desligar();
        fiatMarea.locomover();
        exibirInfosVeiculo(aviao);
        exibirInfosVeiculo(fiatMarea);
    }
    public static void exibirInfosVeiculo(Veiculo veiculo) {

        System.out.println(veiculo.getCor());
    }
}
