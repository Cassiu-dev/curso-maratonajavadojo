package br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Teste;

import br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes.Aluno;
import br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes.Local;
import br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes.Professor;
import br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Cassio",33);
        Aluno aluno2 = new Aluno("Pedro",33);

        Seminario sem = new Seminario("Programação c#");
        Professor prof = new Professor("Pedro","C#");
        Local local = new Local("Rua Opa opa", "Opaves");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0]= sem;
        prof.setSeminario(semArray);

        sem.print();
        prof.print();



    }
}
