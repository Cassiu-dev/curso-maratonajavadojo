package br.com.abc.javacore.introducaoclasses.teste;

import br.com.abc.javacore.introducaoclasses.classe.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro novo = new Carro();
        novo.modelo = "pegout";
        novo.placa = "ABC1222";
        novo.velocidadeMaxima = 190f;

        System.out.println(novo.modelo);
        System.out.println(novo.placa);
        System.out.println(novo.velocidadeMaxima);
    }
}
