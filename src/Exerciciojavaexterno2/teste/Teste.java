package Exerciciojavaexterno2.teste;

import Exerciciojavaexterno2.classe.Aluno1;
import Exerciciojavaexterno2.classe.Local;
import Exerciciojavaexterno2.classe.Professor1;
import Exerciciojavaexterno2.classe.Seminario1;
import br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes.Aluno;
import br.com.abc.javacore.introducaoclasses.Associação.Exercicio.Classes.Professor;

public class Teste {
    public static void main(String[] args) {

        Aluno1 aluno = new Aluno1("Cassio", 25);
        Aluno1 aluno2 = new Aluno1("Adalberto", 25);

        Seminario1 sem = new Seminario1("Java osso");
        Seminario1 sem2 = new Seminario1("Java Alegria");
        Professor1 prof = new Professor1("João","Java");
        Local local = new Local("Rua da araras","Opa opa");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno1[]{aluno,aluno2});

        prof.setSeminarios(new Seminario1[]{sem,sem2});


        sem.print();
        aluno.print();
        prof.print();
        local.print();
    }
}
