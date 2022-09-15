package br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes;

import org.w3c.dom.ls.LSOutput;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public  Seminario(String titulo) {
        this.titulo = titulo;
    }

    public  Seminario() {
    }


    public void print(){
        System.out.println("Relatorio do seminario");
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Professor palestrante:" + this.professor.getNome());
        System.out.println("Especialidade:" + this.professor.getEspecialidade());
        if(this.local != null) {
            System.out.println("Local");
            System.out.println("Rua: " + this.local.getRua());
            System.out.println("Bairro: " + this.local.getBairro());
        }else{
            System.out.println("O Local do seminario ainda não foi definido");
        }

        if(alunos != null && alunos.length != 0){
            System.out.println("Lista de alunos participantes");
        for (Aluno alun : alunos){
            System.out.println( alun.getNome());
        }
        System.out.println();

        }else{
            System.out.println("Não houve inscriçoes de alunos nesse seminario");
        }}



    public void setTitulo(String Titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }

    public Aluno[] getAlunos(){
        return alunos;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setLocal(Local local){
        this.local = local;
    }

    public Local getLocal(){
        return local;
    }
}

