package br.com.abc.javacore.introducaoclasses.modificadorestatico.teste;


import br.com.abc.javacore.introducaoclasses.modificadorestatico.classe.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente b = new Cliente();

        System.out.println("Tamanho: "+ Cliente.getParcelas().length);
        System.out.println("Tamanho: "+ Cliente.getParcelas().length);
        System.out.println("Tamanho: "+ Cliente.getParcelas().length);

    }
}
