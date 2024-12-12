package br.com.fespinoza.factory;

public abstract class Fabrica {

    public Carro criar(String solicitacaoDeNota) {
        Carro carro = carroRequerido(solicitacaoDeNota);
        carro = prepararCarro(carro);
        return carro;
    }

    private Carro prepararCarro(Carro carro) {
        carro.ligarMotor();
        carro.limpar();
        carro.checagemMecanica();
        carro.encherTanque();
        return carro;
    }

    abstract Carro carroRequerido(String solicitacaoDeNota);
}
