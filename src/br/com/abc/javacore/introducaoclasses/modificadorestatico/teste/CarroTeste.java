package br.com.abc.javacore.introducaoclasses.modificadorestatico.teste;

import br.com.abc.javacore.introducaoclasses.modificadorestatico.classe.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro("Sandero",290);
        Carro b =  new Carro("Logan", 230);
        Carro e = new Carro ("Civic", 280);

        Carro.setVelocidadeLimite(280);

        c.imprime();
        b.imprime();
        e.imprime();
        System.out.println("+++++++++++++++++++++++++++++++++++++");



        c.imprime();
        b.imprime();
        e.imprime();
    }
}
