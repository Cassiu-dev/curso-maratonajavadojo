package br.com.abc.javacore.introducaoclasses.teste;

import br.com.abc.javacore.introducaoclasses.classe.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {

        Professor charles = new Professor();

        charles.cpf = "333000";
        charles.nome ="Charles";
        charles.matricula = "455545554";
        charles.rg = "454546456456465";

        System.out.println(charles.cpf);
        System.out.println(charles.nome);
        System.out.println(charles.matricula);
        System.out.println(charles.rg);
    }
}
