package br.com.poo.interfaces;

public class Mobilia implements Transportavel{
    private String tipo;
    private String fabricante;
    private String material;
    private double altura;
    private double largura;
    private double profundidade;
    private double peso;

    @Override
    public double getVolume() {
        return this.altura * this.largura;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public int getEmpilhamentoMaximo() {
        return 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
