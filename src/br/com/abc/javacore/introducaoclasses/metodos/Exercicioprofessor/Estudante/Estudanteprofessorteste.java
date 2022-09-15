package br.com.abc.javacore.introducaoclasses.metodos.Exercicioprofessor.Estudante;

import java.util.Arrays;

public class Estudanteprofessorteste {
    public static void main(String[] args) {
        Estudanteprofessor cassio = new Estudanteprofessor();

        cassio.setNome("Cássio");
        cassio.setIdade(18);
        cassio.setNotas(new double []{0,0,0,12});
        cassio.print();
        cassio.aprovado();


        System.out.println("Aprovado :: " + cassio.isPassou());



        System.out.println(cassio.getNome());
        System.out.println(cassio.getIdade());
        System.out.println(Arrays.toString(cassio.getNotas()));


    }

    }

