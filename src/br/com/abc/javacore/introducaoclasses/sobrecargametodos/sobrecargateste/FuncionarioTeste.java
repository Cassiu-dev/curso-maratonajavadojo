package br.com.abc.javacore.introducaoclasses.sobrecargametodos.sobrecargateste;

import br.com.abc.javacore.introducaoclasses.sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {

    public static void main (String[] args){
        Funcionario cassio = new Funcionario("Pedro","23132131312",312321,"32131312");


        cassio.imprimir();

        Funcionario joao = new Funcionario("João","23132131312",312321,"32131312");

        joao.imprimir();

        Funcionario pedro = new Funcionario();
        pedro.imprimir();
    }






}
