package br.com.abc.javacore.introducaoclasses.Sobreescrita.Classe;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;

    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString(){
        return "Nome " + nome + " idade " + idade;
    }




}
