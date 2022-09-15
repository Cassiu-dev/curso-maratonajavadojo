package br.com.abc.javacore.introducaoclasses.metodos;

public class Professor {

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void criaProf(String cpf1, String matricula1, String nome1, String rg1){
      cpf = cpf1;
      matricula= matricula1;
      nome= nome1;
      rg = rg1;
    }

    public void imprime(Professor aux){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(matricula);
        System.out.println(rg);
    }


}
