package Exerciciojavaexterno2.classe;

import br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes.Seminario;

public class Aluno1 {

    private String nome;
    private int idade;

    private Seminario1 seminario;

    public Seminario1 getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario1 seminario) {
        this.seminario = seminario;
    }

    public Aluno1() {
    }

    public Aluno1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void print(){
        System.out.println("Relatorio Aluno");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        if(this.seminario != null){
        System.out.println("Seminario: "+this.seminario.getTitulo());
    }else {
            System.out.println("Aluno não está inscrito em nenhum seminario");
        }}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
