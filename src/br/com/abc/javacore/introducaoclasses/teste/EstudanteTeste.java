package br.com.abc.javacore.introducaoclasses.teste;

import br.com.abc.javacore.introducaoclasses.classe.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante carlos =new Estudante();
        carlos.nome = "Carlos";
        carlos.idade = 15;
        carlos.matricula = "21199";

        System.out.println(carlos.nome);
    }
}
