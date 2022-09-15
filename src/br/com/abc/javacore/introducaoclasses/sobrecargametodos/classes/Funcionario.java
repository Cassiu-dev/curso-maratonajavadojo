package br.com.abc.javacore.introducaoclasses.sobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    private String rg;

    public Funcionario(String nome,String cpf,double salario, String rg){
        this.nome = nome;
        this.cpf= cpf;
        this.salario=salario;
        this.rg = rg;
    }

    public Funcionario(){

    }

    public void setNome( String nome){
        this.nome = nome;
    }

    public void setRg(String rg){
        this.rg =rg;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public void setSalario (double salario){
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getRg(){
        return this.rg;
    }

    public void  imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }




}
