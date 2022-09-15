package br.com.abc.javacore.introducaoclasses.Enum.Classes;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),PESSOA_JURIDICA(2,"Pessoa Juridica");

    public int tipo;
    public String nome;

    TipoCliente(int tipo,String nome){
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}


