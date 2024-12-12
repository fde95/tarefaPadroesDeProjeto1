package br.com.fespinoza.factory;

public class ContratoFechado extends Fabrica{

    @Override
    Carro carroRequerido(String solicitacaoDeNota) {
        if ("A".equals(solicitacaoDeNota)) {
            return new Virtus("Virtus",128,"Gasolina","Vermelho");
        } else {
            return new Fusca("Fusca",550,"Gasolina","Azul");
        }
    }
}
