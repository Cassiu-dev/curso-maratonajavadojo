package br.com.abc.javacore.introducaoclasses.metodos.exercicio;

public class Estudante {

    public String nome;
    int idade;

    int nota1;
    int nota2;
    int nota3;




    public void criaEstudante(String nome1, int idade1, int nota11, int nota21, int nota31){

        nome = nome1;
        idade = idade1;
        nota1 = nota11;
        nota2 = nota21;
        nota3 = nota31;
    }

    public void imprimirDadosAluno(){

        System.out.println("Nome Aluno : "+ nome);
        System.out.println("Idade Aluno : "+ idade);
        System.out.println("Primeira nota : "+ nota1  );
        System.out.println("Segunda nota : "+ nota2  );
        System.out.println("Terçeira nota : "+ nota3  );
    }

    public void verificarAprovacao(){
        int media = (nota1+nota2+nota3)/3;
        if(media > 6){
            System.out.println("O Aluno: " + nome + "Foi aprovado com a media de :" + media);
        } else if (media == 6) {
            System.out.println("O Aluno " + nome + " está de recuperação");
        }else{
            System.out.println("O Aluno foi reprovado");
        }
    }





}
