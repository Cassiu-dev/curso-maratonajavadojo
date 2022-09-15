package br.com.abc.javacore.introducaoclasses.Abstrastas.Classes;

public abstract class Funcionario extends Pessoa {


    protected String clt;
    protected double salario;

    public Funcionario (String nome, String clt, double salario){
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public String toString(){
        return "Nome: "+ nome + " CLT: "+ clt + " Salario:" + salario;
    }

    public Funcionario() {
    }

    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
