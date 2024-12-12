package br.com.fespinoza.factory;

public class Demonstracao {

    public static void main (String[] args) {

        Cliente cliente = new Cliente("A",false);
        Fabrica fabrica = getFabrica(cliente);

        fabrica.criar(cliente.getSolicitacaoDeNota());
    }

    private static Fabrica getFabrica(Cliente cliente) {

        if (cliente.possuiContratoDeEmpresa()) {
            return new ContratoFechado();
        } else {
            return new SemContrato();
        }
    }
}
