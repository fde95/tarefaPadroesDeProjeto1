package br.com.fespinoza.factory;

public abstract class Carro {

    private String modelo;
    private int cavalosDeForca;
    private String combustivel;
    private String cor;


    public Carro(String modelo,int cavalosDeForca, String combustivel, String cor) {
        this.modelo = modelo;
        this.cavalosDeForca = cavalosDeForca;
        this.combustivel = combustivel;
        this.cor = cor;
    }


    public void ligarMotor() {
        System.out.println("O " + modelo + " esta ligado e pronto. O carro é movido à " + combustivel + " e possui " + cavalosDeForca + " cavalos de força.");
    }

    public void limpar() {
        System.out.println("O carro foi limpo e pintado com a cor " + cor.toLowerCase());
    }

    public void checagemMecanica() {
        System.out.println("O carro foi checado pelo mecânico. Tudo parece perfeito!");
    }

    public void encherTanque() {
        System.out.println("O carro esta carregado/tanque cheio com " + combustivel.toLowerCase());
    }
}
