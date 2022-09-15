package br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes;

public class Professor {

    private String nome;
    private String especialidade;

    private Seminario[] seminario;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(){
    }

    public void print() {
        System.out.println("Relatorio do professor");
        System.out.println("Nome Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if (seminario != null && seminario.length != 0) {
            System.out.print("Seminario Participantes ");
            for (Seminario sem : seminario) {
                System.out.print(sem.getTitulo() + " ");
            }}else{
                System.out.println("o Professor não está escrito em nenhum seminario");
            }
        }


    public void setNome(String nome){
        this.nome = nome;
        }
    public String getNome(){
        return nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setSeminario(Seminario[] seminario){
        this.seminario = seminario;
    }

    public Seminario[] getSeminario(){
        return seminario;
    }

}
