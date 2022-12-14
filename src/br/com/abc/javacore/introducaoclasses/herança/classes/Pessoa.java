package br.com.abc.javacore.introducaoclasses.herança.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;

    protected Endereco endereco;

    static {
        System.out.println("Bloco de inicialização statico pessoa");
    }

    {
        System.out.println("Bloco de inicialização 1 pessoa");
    }

    {
        System.out.println("Bloco de inicialização 2 pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }


    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
