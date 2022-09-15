package br.com.abc.javacore.introducaoclasses.ModificadorFinal.Classes;

public class Carro {

    private static final double VELOCIDADE_FINAL = 250;

    private final Comprador COMPRADOR = new Comprador();

    public Comprador getComprador(){
        return COMPRADOR;
    }
    private String nome;
    private String marca;


    public final  void imprime(){

    }

    @Override
    public String toString(){
        return "Carro : " + nome + " Marca: "+ marca;
    }



    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
}
