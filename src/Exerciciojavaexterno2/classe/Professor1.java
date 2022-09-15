package Exerciciojavaexterno2.classe;

public class Professor1 {

    private String nome;
    private String especialidade;

    private Seminario1[] seminarios;

    public Professor1() {

    }

    public Professor1(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print(){
        System.out.println("Relatorio Professor");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade "+ this.especialidade);

        if(this.seminarios != null && this.seminarios.length != 0){
        for(Seminario1 sem : seminarios) {
            System.out.println("Seminarios que o professor ministra: " + sem.getTitulo());
         }}else{
                System.out.println("O professor não realiza nenhuma palestra");
            }
    }

    public Seminario1[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario1[] seminarios) {
        this.seminarios = seminarios;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
