package br.com.abc.javacore.introducaoclasses.herança.classes;

public class Funcionario extends Pessoa {

    private double salario;

    {
        System.out.println("Bloco de inicialização 1 funcionario");
    }

    {
        System.out.println("Bloco de inicialização 2 funcionario");
    }

    static {
        System.out.println("Bloco de inicialização static funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    public void print() {
        super.print();// super chama o metodo da classe superior.
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + "recebi o pagamento de " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
