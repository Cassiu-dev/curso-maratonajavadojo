package Exerciciojavaexterno2.classe;

import org.w3c.dom.ls.LSOutput;

public class Seminario1 {

    private String titulo;

    private Aluno1[] alunos;

    private Local local;

    private  Professor1 professor;


    public Seminario1() {
    }

    public Seminario1(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("Relatorio seminario");
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Professor palestrante: "+this.professor.getNome());
        if (alunos != null && alunos.length != 0){
            for (Aluno1 num : alunos){
            System.out.println("Alunos cadastrados no seminario : "+ num.getNome());
        }}else{
                System.out.println("Não existem alunos inscritos no seminario");
            }

        if(local != null) {
            System.out.println("Local, rua: " + this.local.getRua() + " bairro: " + this.local.getBairro());
        }else{
            System.out.println("Não existe local cadastrado.");
        }



    }

    public Aluno1[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno1[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor1 getProfessor() {
        return professor;
    }

    public void setProfessor(Professor1 professor) {
        this.professor = professor;
    }







    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }




}
