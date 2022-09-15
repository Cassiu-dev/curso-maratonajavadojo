package br.com.abc.javacore.introducaoclasses.Abstrastas.Classes;

public class Gerente extends Funcionario {

    public Gerente(){

    }

    public Gerente(String nome, String clt, double salario){
        super(nome,clt,salario);
    }

    public void imprime(){

    }

    public void calculaSalario(){
        this.salario = salario + (salario* 0.2);
    }



}
