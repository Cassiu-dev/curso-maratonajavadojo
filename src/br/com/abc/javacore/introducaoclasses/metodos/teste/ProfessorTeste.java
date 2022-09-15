package br.com.abc.javacore.introducaoclasses.metodos.teste;

import br.com.abc.javacore.introducaoclasses.metodos.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "45599886655";
        prof.matricula = " 45899S";
        prof.nome = "João";
        prof.rg = "4556665564";

        Professor prof2 = new Professor();
        prof.cpf = "45599886655";
        prof.matricula = " 45899S";
        prof.nome = "Paulo";
        prof.rg = "4556665564";


        System.out.println("Prof.cpf");
        System.out.println("Prof.matricula");
        System.out.println("Prof.nome");
        System.out.println("Prof.rg");

        System.out.println("Prof2.cpf");
        System.out.println("Prof2.matricula");
        System.out.println("Prof2.nome");
        System.out.println("Prof2.rg");

        System.out.println("---------------------------------------------------------------------");
        Professor prof3 = new Professor();
        prof3.criaProf("122212212","323226565656","Joao pedro","454545454554");
        prof3.imprime(prof3);


    }
}
