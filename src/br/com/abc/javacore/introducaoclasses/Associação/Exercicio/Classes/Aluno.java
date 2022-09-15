package br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes;

public class Aluno {
    private String nome;
    private int idade;

    private Seminario seminario;


    public Aluno (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(){

    }


    public void print(){
        System.out.println("Relatorio do aluno");
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: "+ this.idade);
        if (this.seminario != null){
            System.out.println("Seminario: " +this.seminario.getTitulo());
        }else{
            System.out.println("O aluno não está escrito em nenhum seminario");
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
     }

     public int getIdade(){
        return idade;
     }

     public void setSeminario(Seminario seminario){
        this.seminario = seminario;
     }

     public Seminario getSeminario(){
        return seminario;
     }


}
