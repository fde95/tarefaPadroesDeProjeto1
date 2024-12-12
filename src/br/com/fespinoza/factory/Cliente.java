package br.com.fespinoza.factory;

public class Cliente {

    private String solicitacaoDeNota;
    private boolean possuiContratoDeEmpresa;

    public Cliente(String solicitacaoDeNota, boolean possuiContratoDeEmpresa) {
        this.possuiContratoDeEmpresa = possuiContratoDeEmpresa;
        this.solicitacaoDeNota = solicitacaoDeNota;
    }

    public boolean possuiContratoDeEmpresa() {
        return possuiContratoDeEmpresa;
    }

    public String getSolicitacaoDeNota() {
        return solicitacaoDeNota;
    }
}
