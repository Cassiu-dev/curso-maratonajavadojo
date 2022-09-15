package br.com.abc.javacore.introducaoclasses.Abstrastas.Classes;

public abstract class Pessoa {

    protected String nome;

    public abstract void imprime();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
