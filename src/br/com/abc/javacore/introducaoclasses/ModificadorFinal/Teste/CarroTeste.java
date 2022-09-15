package br.com.abc.javacore.introducaoclasses.ModificadorFinal.Teste;

import br.com.abc.javacore.introducaoclasses.ModificadorFinal.Classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Cassio");
        System.out.println(c.getComprador());
    }
}
