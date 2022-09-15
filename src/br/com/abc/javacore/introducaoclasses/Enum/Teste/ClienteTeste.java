package br.com.abc.javacore.introducaoclasses.Enum.Teste;

import br.com.abc.javacore.introducaoclasses.Enum.Classes.Cliente;
import br.com.abc.javacore.introducaoclasses.Enum.Classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cassio = new Cliente("Cassio", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);

        System.out.println(cassio);




    }
}
