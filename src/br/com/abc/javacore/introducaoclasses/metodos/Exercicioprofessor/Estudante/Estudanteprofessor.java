package br.com.abc.javacore.introducaoclasses.metodos.Exercicioprofessor.Estudante;

public class Estudanteprofessor {
    private String nome;
    private int idade;
    private double[] notas;

    private boolean passou;

    public void print(){
        System.out.println("Nome : "+ this.nome);
        System.out.println("Idade : " + this.idade);

        for(double aux : this.notas){
            System.out.print(aux + " ");
        }

    }

    public void aprovado(){
        double media = 0;
        for (double i : this.notas){
            media  +=i;
        }
        double media1 = media/3;
        if (media1 > 6){
            this.passou = true;
            System.out.println("Aprovado");
        }else{
            this.passou = false;
            System.out.println("Reprovado");
        }

    }

    public void setNome( String nome){
        this.nome = nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public void setNotas (double notas[]){
        this.notas =notas;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getNome(){
        return this.nome;
    }

    public double[] getNotas() {
        return this.notas;
    }


    public boolean isPassou(){
        return this.passou;
    }
}
