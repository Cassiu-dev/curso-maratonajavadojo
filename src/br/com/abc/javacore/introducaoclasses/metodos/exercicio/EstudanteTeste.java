package br.com.abc.javacore.introducaoclasses.metodos.exercicio;



public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante João = new Estudante();

        João.criaEstudante("João",20,10,2,2);
        João.imprimirDadosAluno();
        João.verificarAprovacao();

        Estudante Cassio = new Estudante();

        Cassio.criaEstudante("Cassio",23,10,2,6);
        Cassio.imprimirDadosAluno();
        Cassio.verificarAprovacao();

    }
}
