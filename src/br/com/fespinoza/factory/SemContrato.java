package br.com.fespinoza.factory;

public class SemContrato extends Fabrica {

    @Override
    Carro carroRequerido(String solicitacaoDeNota) {
        if ("A".equals(solicitacaoDeNota)) {
            return new Urus("Urus",660,"Gasolina","Amarelo");
        } else {
            return new Purosangue("Purosangue",715,"Gasolina","Vermelho");
        }
    }
}
