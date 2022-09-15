package br.com.abc.javacore.introducaoclasses.construtores.classe;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;

    private String dataMatricula;


    public Estudante(String matricula, String nome, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;

    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;

    }

    public Estudante() {

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);

        for (double novo : this.notas) {
            System.out.print(novo + " ");
        }
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setDataMatricula(String dataMatricula){
        this.dataMatricula =dataMatricula;
    }

    public String getDataMatricula(){
        return dataMatricula;
    }

}
